package com.github.liosha2007.groupdocs.model.user;

import com.github.liosha2007.groupdocs.model.common.UserInfo;

import java.io.Serializable;

public class UserInfoResult implements Serializable {
    private UserInfo user = null;

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfoResult that = (UserInfoResult) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return user != null ? user.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UserInfoResult");
        sb.append("{user=").append(user);
        sb.append('}');
        return sb.toString();
    }
}

