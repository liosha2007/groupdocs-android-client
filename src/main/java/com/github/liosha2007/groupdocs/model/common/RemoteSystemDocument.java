package com.github.liosha2007.groupdocs.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RemoteSystemDocument implements Serializable {
    private String url = null;
    private Integer version = null;
    private String type = null;
    private String file_type = null;
    private Long size = null;
    private String thumbnail = null;
    private List<String> supported_types = new ArrayList<String>();
    private Double id = null;
    private String guid = null;
    private String name = null;
    private String access = null;
    private UserInfo owner = null;
    private List<UserInfo> sharers = new ArrayList<UserInfo>();
    private Boolean dir = null;
    private Long modified_on = null;
    private Long created_on = null;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<String> getSupported_types() {
        return supported_types;
    }

    public void setSupported_types(List<String> supported_types) {
        this.supported_types = supported_types;
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

        RemoteSystemDocument that = (RemoteSystemDocument) o;

        if (access != null ? !access.equals(that.access) : that.access != null) return false;
        if (created_on != null ? !created_on.equals(that.created_on) : that.created_on != null) return false;
        if (dir != null ? !dir.equals(that.dir) : that.dir != null) return false;
        if (file_type != null ? !file_type.equals(that.file_type) : that.file_type != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (modified_on != null ? !modified_on.equals(that.modified_on) : that.modified_on != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (sharers != null ? !sharers.equals(that.sharers) : that.sharers != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (supported_types != null ? !supported_types.equals(that.supported_types) : that.supported_types != null)
            return false;
        if (thumbnail != null ? !thumbnail.equals(that.thumbnail) : that.thumbnail != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (file_type != null ? file_type.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (thumbnail != null ? thumbnail.hashCode() : 0);
        result = 31 * result + (supported_types != null ? supported_types.hashCode() : 0);
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
        sb.append("RemoteSystemDocument");
        sb.append("{url='").append(url).append('\'');
        sb.append(", version=").append(version);
        sb.append(", type='").append(type).append('\'');
        sb.append(", file_type='").append(file_type).append('\'');
        sb.append(", size=").append(size);
        sb.append(", thumbnail='").append(thumbnail).append('\'');
        sb.append(", supported_types=").append(supported_types);
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

