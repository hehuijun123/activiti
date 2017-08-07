package com.ssh.ecxel.model;

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
public class HazardousChemicalsExcel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Hid;	//id
	private String Hnum;	//编码
	private String Htype;//类型
	private String name;	//危化品名称
	private String LastMonth;//上月余量
	private String ThisMonthBuy;//当月购入量
	private String Alls;//总量
	private String Hunit;//单位
	private String Hmethod;//使用场合
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
	public String getHtype() {
		return Htype;
	}
	public void setHtype(String htype) {
		Htype = htype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastMonth() {
		return LastMonth;
	}
	public void setLastMonth(String lastMonth) {
		LastMonth = lastMonth;
	}
	public String getThisMonthBuy() {
		return ThisMonthBuy;
	}
	public void setThisMonthBuy(String thisMonthBuy) {
		ThisMonthBuy = thisMonthBuy;
	}
	public String getAlls() {
		return Alls;
	}
	public void setAlls(String alls) {
		Alls = alls;
	}
	public String getHunit() {
		return Hunit;
	}
	public void setHunit(String hunit) {
		Hunit = hunit;
	}
	public String getHmethod() {
		return Hmethod;
	}
	public void setHmethod(String hmethod) {
		Hmethod = hmethod;
	}
	


}
