package com.ssm.pojo;

import java.util.Date;

public class User {
	private String pcs_uuid;
	private String pcs_id;
	private String pcs_name;
	private String pcs_password;
	private String pcs_type;
	private String pcs_creater;
	private Date pcs_createtime;
	private String pcs_modifieder;
	private Date pcs_modifiedtime;
	private Integer pcs_status;
	public String getPcs_uuid() {
		return pcs_uuid;
	}
	public void setPcs_uuid(String pcs_uuid) {
		this.pcs_uuid = pcs_uuid;
	}
	public String getPcs_id() {
		return pcs_id;
	}
	public void setPcs_id(String pcs_id) {
		this.pcs_id = pcs_id;
	}
	public String getPcs_name() {
		return pcs_name;
	}
	public void setPcs_name(String pcs_name) {
		this.pcs_name = pcs_name;
	}
	public String getPcs_password() {
		return pcs_password;
	}
	public void setPcs_password(String pcs_password) {
		this.pcs_password = pcs_password;
	}
	public String getPcs_type() {
		return pcs_type;
	}
	public void setPcs_type(String pcs_type) {
		this.pcs_type = pcs_type;
	}
	public String getPcs_creater() {
		return pcs_creater;
	}
	public void setPcs_creater(String pcs_creater) {
		this.pcs_creater = pcs_creater;
	}
	public Date getPcs_createtime() {
		return pcs_createtime;
	}
	public void setPcs_createtime(Date pcs_createtime) {
		this.pcs_createtime = pcs_createtime;
	}
	public String getPcs_modifieder() {
		return pcs_modifieder;
	}
	public void setPcs_modifieder(String pcs_modifieder) {
		this.pcs_modifieder = pcs_modifieder;
	}
	public Date getPcs_modifiedtime() {
		return pcs_modifiedtime;
	}
	public void setPcs_modifiedtime(Date pcs_modifiedtime) {
		this.pcs_modifiedtime = pcs_modifiedtime;
	}
	public Integer getPcs_status() {
		return pcs_status;
	}
	public void setPcs_status(Integer pcs_status) {
		this.pcs_status = pcs_status;
	}
	@Override
	public String toString() {
		return "User [pcs_uuid=" + pcs_uuid + ", pcs_id=" + pcs_id + ", pcs_name=" + pcs_name + ", pcs_password="
				+ pcs_password + ", pcs_type=" + pcs_type + ", pcs_creater=" + pcs_creater + ", pcs_createtime="
				+ pcs_createtime + ", pcs_modifieder=" + pcs_modifieder + ", pcs_modifiedtime=" + pcs_modifiedtime
				+ ", pcs_status=" + pcs_status + "]";
	}
	
}
