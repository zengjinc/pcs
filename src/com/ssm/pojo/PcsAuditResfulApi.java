package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PcsAuditResfulApi {
    private String pcsUuid;

    private String pcsId;

    private String pcsCategory;

    private String pcsModule;

    private String pcsCode;

    private String pcsContext;

    private String pcsActorUuid;

    private String pcsActorId;

    private String pcsActorIpAddr;

    private String pcsActorMac;

    private String pcsLevel;

    private String pcsTitle;

    private String pcsExtcode;

    private String pcsExtcontext;

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

    public String getPcsCode() {
        return pcsCode;
    }

    public void setPcsCode(String pcsCode) {
        this.pcsCode = pcsCode == null ? null : pcsCode.trim();
    }

    public String getPcsContext() {
        return pcsContext;
    }

    public void setPcsContext(String pcsContext) {
        this.pcsContext = pcsContext == null ? null : pcsContext.trim();
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

    public String getPcsLevel() {
        return pcsLevel;
    }

    public void setPcsLevel(String pcsLevel) {
        this.pcsLevel = pcsLevel == null ? null : pcsLevel.trim();
    }

    public String getPcsTitle() {
        return pcsTitle;
    }

    public void setPcsTitle(String pcsTitle) {
        this.pcsTitle = pcsTitle == null ? null : pcsTitle.trim();
    }

    public String getPcsExtcode() {
        return pcsExtcode;
    }

    public void setPcsExtcode(String pcsExtcode) {
        this.pcsExtcode = pcsExtcode == null ? null : pcsExtcode.trim();
    }

    public String getPcsExtcontext() {
        return pcsExtcontext;
    }

    public void setPcsExtcontext(String pcsExtcontext) {
        this.pcsExtcontext = pcsExtcontext == null ? null : pcsExtcontext.trim();
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