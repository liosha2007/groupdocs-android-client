package com.github.liosha2007.groupdocs.model.common;

import java.io.Serializable;

public class JobErrorInfo implements Serializable {
    private Double job_id = null;
    private Double original_document_id = null;
    private Integer error_code = null;
    private String expected_format = null;

    public Double getJob_id() {
        return job_id;
    }

    public void setJob_id(Double job_id) {
        this.job_id = job_id;
    }

    public Double getOriginal_document_id() {
        return original_document_id;
    }

    public void setOriginal_document_id(Double original_document_id) {
        this.original_document_id = original_document_id;
    }

    public Integer getError_code() {
        return error_code;
    }

    public void setError_code(Integer error_code) {
        this.error_code = error_code;
    }

    public String getExpected_format() {
        return expected_format;
    }

    public void setExpected_format(String expected_format) {
        this.expected_format = expected_format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobErrorInfo that = (JobErrorInfo) o;

        if (error_code != null ? !error_code.equals(that.error_code) : that.error_code != null) return false;
        if (expected_format != null ? !expected_format.equals(that.expected_format) : that.expected_format != null)
            return false;
        if (job_id != null ? !job_id.equals(that.job_id) : that.job_id != null) return false;
        if (original_document_id != null ? !original_document_id.equals(that.original_document_id) : that.original_document_id != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = job_id != null ? job_id.hashCode() : 0;
        result = 31 * result + (original_document_id != null ? original_document_id.hashCode() : 0);
        result = 31 * result + (error_code != null ? error_code.hashCode() : 0);
        result = 31 * result + (expected_format != null ? expected_format.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("JobErrorInfo");
        sb.append("{job_id=").append(job_id);
        sb.append(", original_document_id=").append(original_document_id);
        sb.append(", error_code=").append(error_code);
        sb.append(", expected_format='").append(expected_format).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

