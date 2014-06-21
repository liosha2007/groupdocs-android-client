package com.github.liosha2007.groupdocs.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RemoteSystemFolder implements Serializable {
    private Integer folder_count = null;
    private Integer file_count = null;
    private Double id = null;
    private String guid = null;
    private String name = null;
    private String access = null;
    private UserInfo owner = null;
    private List<UserInfo> sharers = new ArrayList<UserInfo>();
    private Boolean dir = null;
    private Long modified_on = null;
    private Long created_on = null;

    public Integer getFolder_count() {
        return folder_count;
    }

    public void setFolder_count(Integer folder_count) {
        this.folder_count = folder_count;
    }

    public Integer getFile_count() {
        return file_count;
    }

    public void setFile_count(Integer file_count) {
        this.file_count = file_count;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public UserInfo getOwner() {
        return owner;
    }

    public void setOwner(UserInfo owner) {
        this.owner = owner;
    }

    public List<UserInfo> getSharers() {
        return sharers;
    }

    public void setSharers(List<UserInfo> sharers) {
        this.sharers = sharers;
    }

    public Boolean getDir() {
        return dir;
    }

    public void setDir(Boolean dir) {
        this.dir = dir;
    }

    public Long getModified_on() {
        return modified_on;
    }

    public void setModified_on(Long modified_on) {
        this.modified_on = modified_on;
    }

    public Long getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Long created_on) {
        this.created_on = created_on;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoteSystemFolder that = (RemoteSystemFolder) o;

        if (access != null ? !access.equals(that.access) : that.access != null) return false;
        if (created_on != null ? !created_on.equals(that.created_on) : that.created_on != null) return false;
        if (dir != null ? !dir.equals(that.dir) : that.dir != null) return false;
        if (file_count != null ? !file_count.equals(that.file_count) : that.file_count != null) return false;
        if (folder_count != null ? !folder_count.equals(that.folder_count) : that.folder_count != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (modified_on != null ? !modified_on.equals(that.modified_on) : that.modified_on != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (sharers != null ? !sharers.equals(that.sharers) : that.sharers != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = folder_count != null ? folder_count.hashCode() : 0;
        result = 31 * result + (file_count != null ? file_count.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (access != null ? access.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (sharers != null ? sharers.hashCode() : 0);
        result = 31 * result + (dir != null ? dir.hashCode() : 0);
        result = 31 * result + (modified_on != null ? modified_on.hashCode() : 0);
        result = 31 * result + (created_on != null ? created_on.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RemoteSystemFolder");
        sb.append("{folder_count=").append(folder_count);
        sb.append(", file_count=").append(file_count);
        sb.append(", id=").append(id);
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", access='").append(access).append('\'');
        sb.append(", owner=").append(owner);
        sb.append(", sharers=").append(sharers);
        sb.append(", dir=").append(dir);
        sb.append(", modified_on=").append(modified_on);
        sb.append(", created_on=").append(created_on);
        sb.append('}');
        return sb.toString();
    }
}

