package com.zh.shiro;

import com.zh.domain.TUserInfo;
import com.zh.mapper.UserMapper;
import com.zh.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;

/**
 * Created by lenovo on 2017/8/21.
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired(required = true)
    private UserMapper userMapper;

    @Autowired(required = true)
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 登录校验
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();//登录用户用户名
        if (!StringUtils.hasLength(username)) {
            return null;
        }
        TUserInfo userInfo = new TUserInfo();
        userInfo.setUsername(username);
        userInfo = userMapper.selectOne(userInfo);
        if (userInfo == null) {
            return null;
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
                userInfo,
                userInfo.getPassword(),
                ByteSource.Util.bytes(userInfo.getCredentialsSalt()),
                getName()
        );
        return info;
    }
}
