package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 废弃物
 * @author Administrator
 *
 */
@Entity
public class Wastesc {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Wid;	//id	
	private String Wname;	//废弃物名称
	private String Wdate;	//废弃时间
	private int Wnum;	//数量
	private String Wcompany;	//接收单位
	private String Wperson;	//处置人
	private String Wwork;
	private String Wr;//记录人
	private String Cname;//分厂
	public long getWid() {
		return Wid;
	}
	public void setWid(long wid) {
		Wid = wid;
	}
	public String getWname() {
		return Wname;
	}
	public void setWname(String wname) {
		Wname = wname;
	}
	public String getWdate() {
		return Wdate;
	}
	public void setWdate(String wdate) {
		Wdate = wdate;
	}
	public int getWnum() {
		return Wnum;
	}
	public void setWnum(int wnum) {
		Wnum = wnum;
	}
	public String getWcompany() {
		return Wcompany;
	}
	public void setWcompany(String wcompany) {
		Wcompany = wcompany;
	}
	public String getWperson() {
		return Wperson;
	}
	public void setWperson(String wperson) {
		Wperson = wperson;
	}
	public String getWwork() {
		return Wwork;
	}
	public void setWwork(String wwork) {
		Wwork = wwork;
	}
	public String getWr() {
		return Wr;
	}
	public void setWr(String wr) {
		Wr = wr;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
}
