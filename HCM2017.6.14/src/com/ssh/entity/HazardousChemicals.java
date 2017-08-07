package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 危化品
 * @author Administrator
 *
 */
@Entity
public class HazardousChemicals {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Hid;	//id
	private String Hnum;	//编码
	private String name;	//危化品名称
	private String othername;	//别名
	private String CASNum;	//CAS码
	private String other;	//备注
	private String Hunit;//单位
	private String Htype;//类型
	private String Hmethod;//使用场合
	private String Msds;
	public Long getHid() {
		return Hid;
	}
	public void setHid(Long hid) {
		Hid = hid;
	}
	public String getHnum() {
		return Hnum;
	}
	public void setHnum(String hnum) {
		Hnum = hnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOthername() {
		return othername;
	}
	public void setOthername(String othername) {
		this.othername = othername;
	}
	public String getCASNum() {
		return CASNum;
	}
	public void setCASNum(String cASNum) {
		CASNum = cASNum;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getHunit() {
		return Hunit;
	}
	public void setHunit(String hunit) {
		Hunit = hunit;
	}
	public String getHtype() {
		return Htype;
	}
	public void setHtype(String htype) {
		Htype = htype;
	}
	public String getHmethod() {
		return Hmethod;
	}
	public void setHmethod(String hmethod) {
		Hmethod = hmethod;
	}
	public String getMsds() {
		return Msds;
	}
	public void setMsds(String msds) {
		Msds = msds;
	}
	
	
	
	
	
	
	

}
