package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 存储Excel文件
 * @author Administrator
 *
 */
@Entity
public class ExcelFile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Eid;
	private String Ename;//文件名
	private String Eurl;//文件路径
	private String Ework;//工作
	private String Edate;
	private String sc;
	private String zs;
	private String jt;
	public Long getEid() {
		return Eid;
	}
	public void setEid(Long eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEurl() {
		return Eurl;
	}
	public void setEurl(String eurl) {
		Eurl = eurl;
	}
	public String getEwork() {
		return Ework;
	}
	public void setEwork(String ework) {
		Ework = ework;
	}
	public String getSc() {
		return sc;
	}
	public void setSc(String sc) {
		this.sc = sc;
	}
	public String getZs() {
		return zs;
	}
	public void setZs(String zs) {
		this.zs = zs;
	}
	public String getJt() {
		return jt;
	}
	public void setJt(String jt) {
		this.jt = jt;
	}
	public String getEdate() {
		return Edate;
	}
	public void setEdate(String edate) {
		Edate = edate;
	}
	

}
