package com.github.liosha2007.groupdocs.model.common;

import java.util.ArrayList;
import java.util.List;

public class JobInputDocument {
    private String status = null;
    private Long proc_date = null;
    private String output_formats = null;
    private List<JobOutputDocument> outputs = new ArrayList<JobOutputDocument>();
    private List<JobErrorInfo> job_errors = new ArrayList<JobErrorInfo>();
    private String actions = null;
    private List<String> supported_output_file_types = new ArrayList<String>();
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

    public Long getProc_date() {
        return proc_date;
    }

    public void setProc_date(Long proc_date) {
        this.proc_date = proc_date;
    }

    public String getOutput_formats() {
        return output_formats;
    }

    public void setOutput_formats(String output_formats) {
        this.output_formats = output_formats;
    }

    public List<JobOutputDocument> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<JobOutputDocument> outputs) {
        this.outputs = outputs;
    }

    public List<JobErrorInfo> getJob_errors() {
        return job_errors;
    }

    public void setJob_errors(List<JobErrorInfo> job_errors) {
        this.job_errors = job_errors;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public List<String> getSupported_output_file_types() {
        return supported_output_file_types;
    }

    public void setSupported_output_file_types(List<String> supported_output_file_types) {
        this.supported_output_file_types = supported_output_file_types;
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

        JobInputDocument that = (JobInputDocument) o;

        if (access != null ? !access.equals(that.access) : that.access != null) return false;
        if (actions != null ? !actions.equals(that.actions) : that.actions != null) return false;
        if (document_path != null ? !document_path.equals(that.document_path) : that.document_path != null)
            return false;
        if (file_type != null ? !file_type.equals(that.file_type) : that.file_type != null) return false;
        if (file_type_str != null ? !file_type_str.equals(that.file_type_str) : that.file_type_str != null)
            return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (job_errors != null ? !job_errors.equals(that.job_errors) : that.job_errors != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (output_formats != null ? !output_formats.equals(that.output_formats) : that.output_formats != null)
            return false;
        if (outputs != null ? !outputs.equals(that.outputs) : that.outputs != null) return false;
        if (proc_date != null ? !proc_date.equals(that.proc_date) : that.proc_date != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (supported_output_file_types != null ? !supported_output_file_types.equals(that.supported_output_file_types) : that.supported_output_file_types != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (type_str != null ? !type_str.equals(that.type_str) : that.type_str != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = status != null ? status.hashCode() : 0;
        result = 31 * result + (proc_date != null ? proc_date.hashCode() : 0);
        result = 31 * result + (output_formats != null ? output_formats.hashCode() : 0);
        result = 31 * result + (outputs != null ? outputs.hashCode() : 0);
        result = 31 * result + (job_errors != null ? job_errors.hashCode() : 0);
        result = 31 * result + (actions != null ? actions.hashCode() : 0);
        result = 31 * result + (supported_output_file_types != null ? supported_output_file_types.hashCode() : 0);
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
        sb.append("JobInputDocument");
        sb.append("{status='").append(status).append('\'');
        sb.append(", proc_date=").append(proc_date);
        sb.append(", output_formats='").append(output_formats).append('\'');
        sb.append(", outputs=").append(outputs);
        sb.append(", job_errors=").append(job_errors);
        sb.append(", actions='").append(actions).append('\'');
        sb.append(", supported_output_file_types=").append(supported_output_file_types);
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

