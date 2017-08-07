package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * 紧急处理
 * @author Administrator
 *
 */
@Entity
public class Emergency {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Eid;	//id	
	private String Escheme;	//应急方案
	private String Epicture;	//企业平面图
	private String Einstructions;	//技术说明书
	private String Edate;	//上传日期
	private String Eperson;	//上传人
	private String Ework;	//工作单位
	private String sc;
	private String zs;
	private String jt;
	@Transient
	private String	name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return Eid;
	}
	public void setId(long id) {
		this.Eid = id;
	}
	public String getEscheme() {
		return Escheme;
	}
	public void setEscheme(String escheme) {
		Escheme = escheme;
	}
	
	public String getEinstructions() {
		return Einstructions;
	}
	public void setEinstructions(String einstructions) {
		Einstructions = einstructions;
	}
	public String getEdate() {
		return Edate;
	}
	public void setEdate(String edate) {
		Edate = edate;
	}
	public String getEperson() {
		return Eperson;
	}
	public void setEperson(String eperson) {
		Eperson = eperson;
	}
	public String getEwork() {
		return Ework;
	}
	public void setEwork(String ework) {
		Ework = ework;
	}
	public String getEpicture() {
		return Epicture;
	}
	public void setEpicture(String epicture) {
		Epicture = epicture;
	}
	public String getSc() {
		return sc;
	}
	public void setSc(String sc) {
		this.sc = sc;
	}
	public String getJt() {
		return jt;
	}
	public void setJt(String jt) {
		this.jt = jt;
	}
	public String getZs() {
		return zs;
	}
	public void setZs(String zs) {
		this.zs = zs;
	}
	
}
