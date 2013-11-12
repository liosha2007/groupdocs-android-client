package com.github.liosha2007.groupdocs.model.storage;

public class UploadWebResult {
    private String adj_name = null;
    private String url = null;
    private String type = null;
    private String file_type = null;
    private Long size = null;
    private Integer version = null;
    private Double view_job_id = null;
    private String thumbnail = null;
    private Long upload_time = null;
    private Double id = null;
    private String guid = null;

    public String getAdj_name() {
        return adj_name;
    }

    public void setAdj_name(String adj_name) {
        this.adj_name = adj_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Double getView_job_id() {
        return view_job_id;
    }

    public void setView_job_id(Double view_job_id) {
        this.view_job_id = view_job_id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Long getUpload_time() {
        return upload_time;
    }

    public void setUpload_time(Long upload_time) {
        this.upload_time = upload_time;
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

        UploadWebResult that = (UploadWebResult) o;

        if (adj_name != null ? !adj_name.equals(that.adj_name) : that.adj_name != null) return false;
        if (file_type != null ? !file_type.equals(that.file_type) : that.file_type != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (thumbnail != null ? !thumbnail.equals(that.thumbnail) : that.thumbnail != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (upload_time != null ? !upload_time.equals(that.upload_time) : that.upload_time != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (view_job_id != null ? !view_job_id.equals(that.view_job_id) : that.view_job_id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adj_name != null ? adj_name.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (file_type != null ? file_type.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (view_job_id != null ? view_job_id.hashCode() : 0);
        result = 31 * result + (thumbnail != null ? thumbnail.hashCode() : 0);
        result = 31 * result + (upload_time != null ? upload_time.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UploadWebResult");
        sb.append("{adj_name='").append(adj_name).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", file_type='").append(file_type).append('\'');
        sb.append(", size=").append(size);
        sb.append(", version=").append(version);
        sb.append(", view_job_id=").append(view_job_id);
        sb.append(", thumbnail='").append(thumbnail).append('\'');
        sb.append(", upload_time=").append(upload_time);
        sb.append(", id=").append(id);
        sb.append(", guid='").append(guid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

