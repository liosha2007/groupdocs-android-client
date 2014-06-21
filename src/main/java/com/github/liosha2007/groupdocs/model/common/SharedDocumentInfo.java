package com.github.liosha2007.groupdocs.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SharedDocumentInfo implements Serializable {
    private String status = null;
    private UserInfo owner = null;
    private List<UserInfo> sharers = new ArrayList<UserInfo>();
    private Long shared_on = null;
    private String name = null;
    private Integer version = null;
    private Long size = null;
    private String type = null;
    private String type_str = null;
    private String file_type_str = null;
    private String document_path = null;
    private String access = null;
    private String url = null;
    private String file_type = null;
    private Double id = null;
    private String guid = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Long getShared_on() {
        return shared_on;
    }

    public void setShared_on(Long shared_on) {
        this.shared_on = shared_on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_str() {
        return type_str;
    }

    public void setType_str(String type_str) {
        this.type_str = type_str;
    }

    public String getFile_type_str() {
        return file_type_str;
    }

    public void setFile_type_str(String file_type_str) {
        this.file_type_str = file_type_str;
    }

    public String getDocument_path() {
        return document_path;
    }

    public void setDocument_path(String document_path) {
        this.document_path = document_path;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SharedDocumentInfo that = (SharedDocumentInfo) o;

        if (access != null ? !access.equals(that.access) : that.access != null) return false;
        if (document_path != null ? !document_path.equals(that.document_path) : that.document_path != null)
            return false;
        if (file_type != null ? !file_type.equals(that.file_type) : that.file_type != null) return false;
        if (file_type_str != null ? !file_type_str.equals(that.file_type_str) : that.file_type_str != null)
            return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (shared_on != null ? !shared_on.equals(that.shared_on) : that.shared_on != null) return false;
        if (sharers != null ? !sharers.equals(that.sharers) : that.sharers != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (type_str != null ? !type_str.equals(that.type_str) : that.type_str != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = status != null ? status.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (sharers != null ? sharers.hashCode() : 0);
        result = 31 * result + (shared_on != null ? shared_on.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (type_str != null ? type_str.hashCode() : 0);
        result = 31 * result + (file_type_str != null ? file_type_str.hashCode() : 0);
        result = 31 * result + (document_path != null ? document_path.hashCode() : 0);
        result = 31 * result + (access != null ? access.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (file_type != null ? file_type.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SharedDocumentInfo");
        sb.append("{status='").append(status).append('\'');
        sb.append(", owner=").append(owner);
        sb.append(", sharers=").append(sharers);
        sb.append(", shared_on=").append(shared_on);
        sb.append(", name='").append(name).append('\'');
        sb.append(", version=").append(version);
        sb.append(", size=").append(size);
        sb.append(", type='").append(type).append('\'');
        sb.append(", type_str='").append(type_str).append('\'');
        sb.append(", file_type_str='").append(file_type_str).append('\'');
        sb.append(", document_path='").append(document_path).append('\'');
        sb.append(", access='").append(access).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", file_type='").append(file_type).append('\'');
        sb.append(", id=").append(id);
        sb.append(", guid='").append(guid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

