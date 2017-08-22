package com.zh.domain;

import javax.persistence.Transient;
import java.io.Serializable;

public class TFriendGroup extends BaseEntity implements Serializable {

    @Transient
    private TFriend friend;
    @Transient
    private TGroup group;

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
