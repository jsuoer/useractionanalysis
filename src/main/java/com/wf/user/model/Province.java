package com.wf.user.model;

import java.util.Date;

public class Province {
    private String pid;

    private Date createTime;

    private String creator;

    private String isDeleted;

    private String modify;

    private Date modifyTime;

    private String nationcode;

    private String pcode;

    private String pname;

    private Date precordcreationdate;

    private String precordcreator;

    private String precordversion;

    private String creater;

    private Date createrTime;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
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

    public String getNationcode() {
        return nationcode;
    }

    public void setNationcode(String nationcode) {
        this.nationcode = nationcode == null ? null : nationcode.trim();
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Date getPrecordcreationdate() {
        return precordcreationdate;
    }

    public void setPrecordcreationdate(Date precordcreationdate) {
        this.precordcreationdate = precordcreationdate;
    }

    public String getPrecordcreator() {
        return precordcreator;
    }

    public void setPrecordcreator(String precordcreator) {
        this.precordcreator = precordcreator == null ? null : precordcreator.trim();
    }

    public String getPrecordversion() {
        return precordversion;
    }

    public void setPrecordversion(String precordversion) {
        this.precordversion = precordversion == null ? null : precordversion.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }
}