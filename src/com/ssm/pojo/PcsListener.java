package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PcsListener {
    private String pcsUuid;

    private String pcsListenername;

    private String pcsEventcategory;

    private String pcsEventtype;

    private String pcsEventresult;

    private String pcsConnector;

    private String pcsWhen;

    private String pcsRunnow;

    private Date pcsCreatetime;

    private Date pcsModifiedtime;

    private String pcsModifieder;

    private BigDecimal pcsStatus;

    public String getPcsUuid() {
        return pcsUuid;
    }

    public void setPcsUuid(String pcsUuid) {
        this.pcsUuid = pcsUuid == null ? null : pcsUuid.trim();
    }

    public String getPcsListenername() {
        return pcsListenername;
    }

    public void setPcsListenername(String pcsListenername) {
        this.pcsListenername = pcsListenername == null ? null : pcsListenername.trim();
    }

    public String getPcsEventcategory() {
        return pcsEventcategory;
    }

    public void setPcsEventcategory(String pcsEventcategory) {
        this.pcsEventcategory = pcsEventcategory == null ? null : pcsEventcategory.trim();
    }

    public String getPcsEventtype() {
        return pcsEventtype;
    }

    public void setPcsEventtype(String pcsEventtype) {
        this.pcsEventtype = pcsEventtype == null ? null : pcsEventtype.trim();
    }

    public String getPcsEventresult() {
        return pcsEventresult;
    }

    public void setPcsEventresult(String pcsEventresult) {
        this.pcsEventresult = pcsEventresult == null ? null : pcsEventresult.trim();
    }

    public String getPcsConnector() {
        return pcsConnector;
    }

    public void setPcsConnector(String pcsConnector) {
        this.pcsConnector = pcsConnector == null ? null : pcsConnector.trim();
    }

    public String getPcsWhen() {
        return pcsWhen;
    }

    public void setPcsWhen(String pcsWhen) {
        this.pcsWhen = pcsWhen == null ? null : pcsWhen.trim();
    }

    public String getPcsRunnow() {
        return pcsRunnow;
    }

    public void setPcsRunnow(String pcsRunnow) {
        this.pcsRunnow = pcsRunnow == null ? null : pcsRunnow.trim();
    }

    public Date getPcsCreatetime() {
        return pcsCreatetime;
    }

    public void setPcsCreatetime(Date pcsCreatetime) {
        this.pcsCreatetime = pcsCreatetime;
    }

    public Date getPcsModifiedtime() {
        return pcsModifiedtime;
    }

    public void setPcsModifiedtime(Date pcsModifiedtime) {
        this.pcsModifiedtime = pcsModifiedtime;
    }

    public String getPcsModifieder() {
        return pcsModifieder;
    }

    public void setPcsModifieder(String pcsModifieder) {
        this.pcsModifieder = pcsModifieder == null ? null : pcsModifieder.trim();
    }

    public BigDecimal getPcsStatus() {
        return pcsStatus;
    }

    public void setPcsStatus(BigDecimal pcsStatus) {
        this.pcsStatus = pcsStatus;
    }
}