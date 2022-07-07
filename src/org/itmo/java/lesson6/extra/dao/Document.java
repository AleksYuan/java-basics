package org.itmo.java.lesson6.extra.dao;

public class Document {
    private Long id;
    private Integer pageCount;
    private String format;
    private Boolean isEditAble;

    public Document(Integer pageCount, String format, Boolean isEditAble) {
        this.pageCount = pageCount;
        this.format = format;
        this.isEditAble = isEditAble;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getEditAble() {
        return isEditAble;
    }

    public void setEditAble(Boolean editAble) {
        isEditAble = editAble;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", pageCount=" + pageCount +
                ", format='" + format + '\'' +
                ", isEditAble=" + isEditAble +
                '}';
    }
}
