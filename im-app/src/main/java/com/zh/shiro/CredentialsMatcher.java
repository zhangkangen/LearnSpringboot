package com.zh.shiro;

import com.zh.util.Md5;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

public class CredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {

        UsernamePasswordToken utoken = (UsernamePasswordToken) token;
        String password = new String(utoken.getPassword());

        SimpleAuthenticationInfo uinfo = (SimpleAuthenticationInfo) info;
        String dbPassword = (String) uinfo.getCredentials();

        boolean b = equals(Md5.encode(password),dbPassword);
        return b;
    }
}
