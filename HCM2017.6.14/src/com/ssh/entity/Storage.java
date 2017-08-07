package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 五号沟数据
 * @author Administrator
 *
 */
@Entity
public class Storage {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Sid;	//库存id
	private String Sname;	//危化品名称
	private String Snum;	//危化品编码
	private String Stotal;	//当月总量 
	private String Sdate;	//月份
	private String Smonth;	//当月购入量
	private String Ssurplus;	//本月剩余量：当月
	private String SbeforeSurplus;	//上月剩余量 ：上月库存量
	private String Sposition;//库位
	private String Swork;	//	单位
	private String Sapply;	//	使用量
	private String Sunit;	//使用计量
	private String Sall;	//库存总量  上月余量+当前月库存量
	private String Sother;	//备注
	private String Stype;	//危化物类型
	public Long getSid() {
		return Sid;
	}
	public void setSid(Long sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSnum() {
		return Snum;
	}
	public void setSnum(String snum) {
		Snum = snum;
	}
	public String getStotal() {
		return Stotal;
	}
	public void setStotal(String stotal) {
		Stotal = stotal;
	}
	public String getSdate() {
		return Sdate;
	}
	public void setSdate(String sdate) {
		Sdate = sdate;
	}
	public String getSmonth() {
		return Smonth;
	}
	public void setSmonth(String smonth) {
		Smonth = smonth;
	}
	public String getSsurplus() {
		return Ssurplus;
	}
	public void setSsurplus(String ssurplus) {
		Ssurplus = ssurplus;
	}
	public String getSbeforeSurplus() {
		return SbeforeSurplus;
	}
	public void setSbeforeSurplus(String sbeforeSurplus) {
		SbeforeSurplus = sbeforeSurplus;
	}
	public String getSposition() {
		return Sposition;
	}
	public void setSposition(String sposition) {
		Sposition = sposition;
	}
	public String getSwork() {
		return Swork;
	}
	public void setSwork(String swork) {
		Swork = swork;
	}
	public String getSapply() {
		return Sapply;
	}
	public void setSapply(String sapply) {
		Sapply = sapply;
	}
	public String getSunit() {
		return Sunit;
	}
	public void setSunit(String sunit) {
		Sunit = sunit;
	}
	public String getSall() {
		return Sall;
	}
	public void setSall(String sall) {
		Sall = sall;
	}
	public String getSother() {
		return Sother;
	}
	public void setSother(String sother) {
		Sother = sother;
	}
	public String getStype() {
		return Stype;
	}
	public void setStype(String stype) {
		Stype = stype;
	}
	
	
}
