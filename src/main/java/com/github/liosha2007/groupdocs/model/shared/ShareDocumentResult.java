package com.github.liosha2007.groupdocs.model.shared;

import com.github.liosha2007.groupdocs.model.common.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class ShareDocumentResult {
    private UserInfo owner = null;
    private List<UserInfo> shared_users = new ArrayList<UserInfo>();

    public UserInfo getOwner() {
        return owner;
    }

    public void setOwner(UserInfo owner) {
        this.owner = owner;
    }

    public List<UserInfo> getShared_users() {
        return shared_users;
    }

    public void setShared_users(List<UserInfo> shared_users) {
        this.shared_users = shared_users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShareDocumentResult that = (ShareDocumentResult) o;

        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (shared_users != null ? !shared_users.equals(that.shared_users) : that.shared_users != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = owner != null ? owner.hashCode() : 0;
        result = 31 * result + (shared_users != null ? shared_users.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ShareDocumentResult");
        sb.append("{owner=").append(owner);
        sb.append(", shared_users=").append(shared_users);
        sb.append('}');
        return sb.toString();
    }
}

