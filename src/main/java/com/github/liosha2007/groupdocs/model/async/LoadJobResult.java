package com.github.liosha2007.groupdocs.model.async;

import com.github.liosha2007.groupdocs.model.common.JobDocumentsEntry;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LoadJobResult implements Serializable {
    private Double id = null;
    private List<String> out_formats = new ArrayList<String>();
    private String actions = null;
    private String status = null;
    private Boolean email_results = null;
    private Double priority = null;
    private Boolean url_only = null;
    private JobDocumentsEntry documents = null;
    private Long requested_time = null;
    private Long scheduled_time = null;
    private String guid = null;
    private String name = null;
    private String callback_url = null;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public List<String> getOut_formats() {
        return out_formats;
    }

    public void setOut_formats(List<String> out_formats) {
        this.out_formats = out_formats;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getEmail_results() {
        return email_results;
    }

    public void setEmail_results(Boolean email_results) {
        this.email_results = email_results;
    }

    public Double getPriority() {
        return priority;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public Boolean getUrl_only() {
        return url_only;
    }

    public void setUrl_only(Boolean url_only) {
        this.url_only = url_only;
    }

    public JobDocumentsEntry getDocuments() {
        return documents;
    }

    public void setDocuments(JobDocumentsEntry documents) {
        this.documents = documents;
    }

    public Long getRequested_time() {
        return requested_time;
    }

    public void setRequested_time(Long requested_time) {
        this.requested_time = requested_time;
    }

    public Long getScheduled_time() {
        return scheduled_time;
    }

    public void setScheduled_time(Long scheduled_time) {
        this.scheduled_time = scheduled_time;
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

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoadJobResult that = (LoadJobResult) o;

        if (actions != null ? !actions.equals(that.actions) : that.actions != null) return false;
        if (callback_url != null ? !callback_url.equals(that.callback_url) : that.callback_url != null) return false;
        if (documents != null ? !documents.equals(that.documents) : that.documents != null) return false;
        if (email_results != null ? !email_results.equals(that.email_results) : that.email_results != null)
            return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (out_formats != null ? !out_formats.equals(that.out_formats) : that.out_formats != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (requested_time != null ? !requested_time.equals(that.requested_time) : that.requested_time != null)
            return false;
        if (scheduled_time != null ? !scheduled_time.equals(that.scheduled_time) : that.scheduled_time != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (url_only != null ? !url_only.equals(that.url_only) : that.url_only != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (out_formats != null ? out_formats.hashCode() : 0);
        result = 31 * result + (actions != null ? actions.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (email_results != null ? email_results.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (url_only != null ? url_only.hashCode() : 0);
        result = 31 * result + (documents != null ? documents.hashCode() : 0);
        result = 31 * result + (requested_time != null ? requested_time.hashCode() : 0);
        result = 31 * result + (scheduled_time != null ? scheduled_time.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (callback_url != null ? callback_url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LoadJobResult");
        sb.append("{id=").append(id);
        sb.append(", out_formats=").append(out_formats);
        sb.append(", actions='").append(actions).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", email_results=").append(email_results);
        sb.append(", priority=").append(priority);
        sb.append(", url_only=").append(url_only);
        sb.append(", documents=").append(documents);
        sb.append(", requested_time=").append(requested_time);
        sb.append(", scheduled_time=").append(scheduled_time);
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", callback_url='").append(callback_url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

