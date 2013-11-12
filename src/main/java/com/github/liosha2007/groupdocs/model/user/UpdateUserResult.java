package com.github.liosha2007.groupdocs.model.user;

public class UpdateUserResult {
    private String user_guid = null;

    public String getUser_guid() {
        return user_guid;
    }

    public void setUser_guid(String user_guid) {
        this.user_guid = user_guid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpdateUserResult that = (UpdateUserResult) o;

        if (user_guid != null ? !user_guid.equals(that.user_guid) : that.user_guid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return user_guid != null ? user_guid.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UpdateUserResult");
        sb.append("{user_guid='").append(user_guid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

