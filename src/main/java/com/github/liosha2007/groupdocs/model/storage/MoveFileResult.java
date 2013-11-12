package com.github.liosha2007.groupdocs.model.storage;

import com.github.liosha2007.groupdocs.model.common.DocumentInfo;

public class MoveFileResult {
    private DocumentInfo src_file = null;
    private DocumentInfo dst_file = null;

    public DocumentInfo getSrc_file() {
        return src_file;
    }

    public void setSrc_file(DocumentInfo src_file) {
        this.src_file = src_file;
    }

    public DocumentInfo getDst_file() {
        return dst_file;
    }

    public void setDst_file(DocumentInfo dst_file) {
        this.dst_file = dst_file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoveFileResult that = (MoveFileResult) o;

        if (dst_file != null ? !dst_file.equals(that.dst_file) : that.dst_file != null) return false;
        if (src_file != null ? !src_file.equals(that.src_file) : that.src_file != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = src_file != null ? src_file.hashCode() : 0;
        result = 31 * result + (dst_file != null ? dst_file.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MoveFileResult");
        sb.append("{src_file=").append(src_file);
        sb.append(", dst_file=").append(dst_file);
        sb.append('}');
        return sb.toString();
    }
}

