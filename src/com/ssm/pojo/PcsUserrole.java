package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PcsUserrole {
    private String pcsUuid;

    private String pcsId;

    private String pcsUseruuid;

    private String pcsRole;

    private String pcsRealm;

    private String pcsCreater;

    private Date pcsCreatetime;

    private String pcsModifieder;

    private Date pcsModifiedtime;

    private BigDecimal pcsStatus;

    public String getPcsUuid() {
        return pcsUuid;
    }

    public void setPcsUuid(String pcsUuid) {
        this.pcsUuid = pcsUuid == null ? null : pcsUuid.trim();
    }

    public String getPcsId() {
        return pcsId;
    }

    public void setPcsId(String pcsId) {
        this.pcsId = pcsId == null ? null : pcsId.trim();
    }

    public String getPcsUseruuid() {
        return pcsUseruuid;
    }

    public void setPcsUseruuid(String pcsUseruuid) {
        this.pcsUseruuid = pcsUseruuid == null ? null : pcsUseruuid.trim();
    }

    public String getPcsRole() {
        return pcsRole;
    }

    public void setPcsRole(String pcsRole) {
        this.pcsRole = pcsRole == null ? null : pcsRole.trim();
    }

    public String getPcsRealm() {
        return pcsRealm;
    }

    public void setPcsRealm(String pcsRealm) {
        this.pcsRealm = pcsRealm == null ? null : pcsRealm.trim();
    }

    public String getPcsCreater() {
        return pcsCreater;
    }

    public void setPcsCreater(String pcsCreater) {
        this.pcsCreater = pcsCreater == null ? null : pcsCreater.trim();
    }

    public Date getPcsCreatetime() {
        return pcsCreatetime;
    }

    public void setPcsCreatetime(Date pcsCreatetime) {
        this.pcsCreatetime = pcsCreatetime;
    }

    public String getPcsModifieder() {
        return pcsModifieder;
    }

    public void setPcsModifieder(String pcsModifieder) {
        this.pcsModifieder = pcsModifieder == null ? null : pcsModifieder.trim();
    }

    public Date getPcsModifiedtime() {
        return pcsModifiedtime;
    }

    public void setPcsModifiedtime(Date pcsModifiedtime) {
        this.pcsModifiedtime = pcsModifiedtime;
    }

    public BigDecimal getPcsStatus() {
        return pcsStatus;
    }

    public void setPcsStatus(BigDecimal pcsStatus) {
        this.pcsStatus = pcsStatus;
    }
}