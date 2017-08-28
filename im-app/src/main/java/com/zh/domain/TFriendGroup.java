package com.zh.domain;

import javax.persistence.Transient;
import java.io.Serializable;

public class TFriendGroup extends BaseEntity implements Serializable {

    private Integer groupId;
    private Integer friendId;

    @Transient
    private TFriend friend;
    @Transient
    private TGroup group;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public TFriend getFriend() {
        return friend;
    }

    public void setFriend(TFriend friend) {
        this.friend = friend;
    }

    public TGroup getGroup() {
        return group;
    }

    public void setGroup(TGroup group) {
        this.group = group;
    }
}
