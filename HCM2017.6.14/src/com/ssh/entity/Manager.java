package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 单位负责人
 * @author Administrator
 *
 */
@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Mid;
	private String Mfactory;
	private String MfId;
	private String Mname;
	public Long getMid() {
		return Mid;
	}
	public void setMid(Long mid) {
		Mid = mid;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getMfactory() {
		return Mfactory;
	}
	public void setMfactory(String mfactory) {
		Mfactory = mfactory;
	}
	public String getMfId() {
		return MfId;
	}
	public void setMfId(String mfId) {
		MfId = mfId;
	}
}
