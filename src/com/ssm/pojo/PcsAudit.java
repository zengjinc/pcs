package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PcsAudit {
    private String pcsUuid;

    private String pcsId;

    private Date pcsReportTime;

    private String pcsCategory;

    private String pcsModule;

    private String pcsResult;

    private String pcsResultCode;

    private String pcsExtResult;

    private String pcsExtResultCode;

    private String pcsActorUuid;

    private String pcsActorId;

    private String pcsActorIpAddr;

    private String pcsActorMac;

    private String pcsRealActorUuid;

    private String pcsRealActorId;

    private String pcsRealActorName;

    private String pcsClientId;

    private String pcsClientType;

    private String pcsTargetUuid;

    private String pcsTargetId;

    private String pcsTargetName;

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

    public Date getPcsReportTime() {
        return pcsReportTime;
    }

    public void setPcsReportTime(Date pcsReportTime) {
        this.pcsReportTime = pcsReportTime;
    }

    public String getPcsCategory() {
        return pcsCategory;
    }

    public void setPcsCategory(String pcsCategory) {
        this.pcsCategory = pcsCategory == null ? null : pcsCategory.trim();
    }

    public String getPcsModule() {
        return pcsModule;
    }

    public void setPcsModule(String pcsModule) {
        this.pcsModule = pcsModule == null ? null : pcsModule.trim();
    }

    public String getPcsResult() {
        return pcsResult;
    }

    public void setPcsResult(String pcsResult) {
        this.pcsResult = pcsResult == null ? null : pcsResult.trim();
    }

    public String getPcsResultCode() {
        return pcsResultCode;
    }

    public void setPcsResultCode(String pcsResultCode) {
        this.pcsResultCode = pcsResultCode == null ? null : pcsResultCode.trim();
    }

    public String getPcsExtResult() {
        return pcsExtResult;
    }

    public void setPcsExtResult(String pcsExtResult) {
        this.pcsExtResult = pcsExtResult == null ? null : pcsExtResult.trim();
    }

    public String getPcsExtResultCode() {
        return pcsExtResultCode;
    }

    public void setPcsExtResultCode(String pcsExtResultCode) {
        this.pcsExtResultCode = pcsExtResultCode == null ? null : pcsExtResultCode.trim();
    }

    public String getPcsActorUuid() {
        return pcsActorUuid;
    }

    public void setPcsActorUuid(String pcsActorUuid) {
        this.pcsActorUuid = pcsActorUuid == null ? null : pcsActorUuid.trim();
    }

    public String getPcsActorId() {
        return pcsActorId;
    }

    public void setPcsActorId(String pcsActorId) {
        this.pcsActorId = pcsActorId == null ? null : pcsActorId.trim();
    }

    public String getPcsActorIpAddr() {
        return pcsActorIpAddr;
    }

    public void setPcsActorIpAddr(String pcsActorIpAddr) {
        this.pcsActorIpAddr = pcsActorIpAddr == null ? null : pcsActorIpAddr.trim();
    }

    public String getPcsActorMac() {
        return pcsActorMac;
    }

    public void setPcsActorMac(String pcsActorMac) {
        this.pcsActorMac = pcsActorMac == null ? null : pcsActorMac.trim();
    }

    public String getPcsRealActorUuid() {
        return pcsRealActorUuid;
    }

    public void setPcsRealActorUuid(String pcsRealActorUuid) {
        this.pcsRealActorUuid = pcsRealActorUuid == null ? null : pcsRealActorUuid.trim();
    }

    public String getPcsRealActorId() {
        return pcsRealActorId;
    }

    public void setPcsRealActorId(String pcsRealActorId) {
        this.pcsRealActorId = pcsRealActorId == null ? null : pcsRealActorId.trim();
    }

    public String getPcsRealActorName() {
        return pcsRealActorName;
    }

    public void setPcsRealActorName(String pcsRealActorName) {
        this.pcsRealActorName = pcsRealActorName == null ? null : pcsRealActorName.trim();
    }

    public String getPcsClientId() {
        return pcsClientId;
    }

    public void setPcsClientId(String pcsClientId) {
        this.pcsClientId = pcsClientId == null ? null : pcsClientId.trim();
    }

    public String getPcsClientType() {
        return pcsClientType;
    }

    public void setPcsClientType(String pcsClientType) {
        this.pcsClientType = pcsClientType == null ? null : pcsClientType.trim();
    }

    public String getPcsTargetUuid() {
        return pcsTargetUuid;
    }

    public void setPcsTargetUuid(String pcsTargetUuid) {
        this.pcsTargetUuid = pcsTargetUuid == null ? null : pcsTargetUuid.trim();
    }

    public String getPcsTargetId() {
        return pcsTargetId;
    }

    public void setPcsTargetId(String pcsTargetId) {
        this.pcsTargetId = pcsTargetId == null ? null : pcsTargetId.trim();
    }

    public String getPcsTargetName() {
        return pcsTargetName;
    }

    public void setPcsTargetName(String pcsTargetName) {
        this.pcsTargetName = pcsTargetName == null ? null : pcsTargetName.trim();
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