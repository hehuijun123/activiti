package com.ssh.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * 水厂信息
 * @author Administrator
 *
 */
@Entity
public class ScCompany {
	@Id
	private Long Cid;	//id
	private String Cname;	//企业名称 
	private String Caddress;	//企业地址
	private String Ctel;	//企业电话
	private String EmergencyPerson;		//紧急联系人
	private String EmergencyCalls;		//联系人电话
	private String Pid;//所属公司
	public Long getCid() {
		return Cid;
	}
	public void setCid(Long cid) {
		Cid = cid;
	}
	
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCaddress() {
		return Caddress;
	}
	public void setCaddress(String caddress) {
		Caddress = caddress;
	}
	public String getCtel() {
		return Ctel;
	}
	public void setCtel(String ctel) {
		Ctel = ctel;
	}
	public String getEmergencyPerson() {
		return EmergencyPerson;
	}
	public void setEmergencyPerson(String emergencyPerson) {
		EmergencyPerson = emergencyPerson;
	}
	public String getEmergencyCalls() {
		return EmergencyCalls;
	}
	public void setEmergencyCalls(String emergencyCalls) {
		EmergencyCalls = emergencyCalls;
	}
	public String getPid() {
		return Pid;
	}
	public void setPid(String pid) {
		Pid = pid;
	}
	
	

}
