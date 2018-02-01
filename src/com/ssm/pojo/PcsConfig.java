package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PcsConfig {
    private String pcsUuid;

    private String pcsCategory;

    private String pcsGroup;

    private String pcsKey;

    private String pcsValue;

    private String pcsDescription;

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

    public String getPcsCategory() {
        return pcsCategory;
    }

    public void setPcsCategory(String pcsCategory) {
        this.pcsCategory = pcsCategory == null ? null : pcsCategory.trim();
    }

    public String getPcsGroup() {
        return pcsGroup;
    }

    public void setPcsGroup(String pcsGroup) {
        this.pcsGroup = pcsGroup == null ? null : pcsGroup.trim();
    }

    public String getPcsKey() {
        return pcsKey;
    }

    public void setPcsKey(String pcsKey) {
        this.pcsKey = pcsKey == null ? null : pcsKey.trim();
    }

    public String getPcsValue() {
        return pcsValue;
    }

    public void setPcsValue(String pcsValue) {
        this.pcsValue = pcsValue == null ? null : pcsValue.trim();
    }

    public String getPcsDescription() {
        return pcsDescription;
    }

    public void setPcsDescription(String pcsDescription) {
        this.pcsDescription = pcsDescription == null ? null : pcsDescription.trim();
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