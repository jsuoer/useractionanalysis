package com.wf.user.model;

import java.util.Date;

public class City {
    private String cid;

    private Date createTime;

    private String creator;

    private String isDeleted;

    private String modify;

    private Date modifyTime;

    private String ccode;

    private String cname;

    private Date crecordcreationdate;

    private String crecordcreator;

    private String crecordversion;

    private String provincecode;

    private Date createrTime;

    private String creater;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public String getModify() {
        return modify;
    }

    public void setModify(String modify) {
        this.modify = modify == null ? null : modify.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode == null ? null : ccode.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Date getCrecordcreationdate() {
        return crecordcreationdate;
    }

    public void setCrecordcreationdate(Date crecordcreationdate) {
        this.crecordcreationdate = crecordcreationdate;
    }

    public String getCrecordcreator() {
        return crecordcreator;
    }

    public void setCrecordcreator(String crecordcreator) {
        this.crecordcreator = crecordcreator == null ? null : crecordcreator.trim();
    }

    public String getCrecordversion() {
        return crecordversion;
    }

    public void setCrecordversion(String crecordversion) {
        this.crecordversion = crecordversion == null ? null : crecordversion.trim();
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode == null ? null : provincecode.trim();
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
}