package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PcsRole {
    private String pcsUuid;

    private String pcsId;

    private String pcsName;

    private String pcsPermissionId;

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

    public String getPcsName() {
        return pcsName;
    }

    public void setPcsName(String pcsName) {
        this.pcsName = pcsName == null ? null : pcsName.trim();
    }

    public String getPcsPermissionId() {
        return pcsPermissionId;
    }

    public void setPcsPermissionId(String pcsPermissionId) {
        this.pcsPermissionId = pcsPermissionId == null ? null : pcsPermissionId.trim();
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