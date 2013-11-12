package com.github.liosha2007.groupdocs.model.document;

import com.github.liosha2007.groupdocs.model.common.Dimension;

import java.util.ArrayList;
import java.util.List;

public class ViewDocumentResult {
    private String name = null;
    private Integer version = null;
    private Integer page_count = null;
    private Dimension page_size = null;
    private String url = null;
    private String doc_type = null;
    private List<String> image_urls = new ArrayList<String>();
    private String token = null;
    private String pageHtml = null;
    private String pageCss = null;
    private String password = null;
    private Double id = null;
    private String guid = null;

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

    public Integer getPage_count() {
        return page_count;
    }

    public void setPage_count(Integer page_count) {
        this.page_count = page_count;
    }

    public Dimension getPage_size() {
        return page_size;
    }

    public void setPage_size(Dimension page_size) {
        this.page_size = page_size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

    public List<String> getImage_urls() {
        return image_urls;
    }

    public void setImage_urls(List<String> image_urls) {
        this.image_urls = image_urls;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPageHtml() {
        return pageHtml;
    }

    public void setPageHtml(String pageHtml) {
        this.pageHtml = pageHtml;
    }

    public String getPageCss() {
        return pageCss;
    }

    public void setPageCss(String pageCss) {
        this.pageCss = pageCss;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

        ViewDocumentResult that = (ViewDocumentResult) o;

        if (doc_type != null ? !doc_type.equals(that.doc_type) : that.doc_type != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (image_urls != null ? !image_urls.equals(that.image_urls) : that.image_urls != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pageCss != null ? !pageCss.equals(that.pageCss) : that.pageCss != null) return false;
        if (pageHtml != null ? !pageHtml.equals(that.pageHtml) : that.pageHtml != null) return false;
        if (page_count != null ? !page_count.equals(that.page_count) : that.page_count != null) return false;
        if (page_size != null ? !page_size.equals(that.page_size) : that.page_size != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (page_count != null ? page_count.hashCode() : 0);
        result = 31 * result + (page_size != null ? page_size.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (doc_type != null ? doc_type.hashCode() : 0);
        result = 31 * result + (image_urls != null ? image_urls.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (pageHtml != null ? pageHtml.hashCode() : 0);
        result = 31 * result + (pageCss != null ? pageCss.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ViewDocumentResult");
        sb.append("{name='").append(name).append('\'');
        sb.append(", version=").append(version);
        sb.append(", page_count=").append(page_count);
        sb.append(", page_size=").append(page_size);
        sb.append(", url='").append(url).append('\'');
        sb.append(", doc_type='").append(doc_type).append('\'');
        sb.append(", image_urls=").append(image_urls);
        sb.append(", token='").append(token).append('\'');
        sb.append(", pageHtml='").append(pageHtml).append('\'');
        sb.append(", pageCss='").append(pageCss).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", id=").append(id);
        sb.append(", guid='").append(guid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

