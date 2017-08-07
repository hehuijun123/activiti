package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
/**
 * 存储
 * @author Administrator
 *
 */
@Entity
public class Storehouse {
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
	private String Simg;//图片
	private String Spoint;	//热点
	private String Swork;	//	单位
	private String Sapply;	//	使用量
	private String Sunit;	//使用计量
	private String Sall;	//库存总量  上月余量+当前月库存量
	private String Sother;	//备注
	private String Stype;
	private String sc;
	private String zs;
	private String jt;
	@Transient
	private String	SbeforeSurplus_;
	@Transient
	private String	Smonth_;
	@Transient
	private String	Sall_;
	
	public String getSbeforeSurplus_() {
		return SbeforeSurplus_;
	}
	public void setSbeforeSurplus_(String sbeforeSurplus_) {
		SbeforeSurplus_ = sbeforeSurplus_;
	}
	public String getSmonth_() {
		return Smonth_;
	}
	public void setSmonth_(String smonth_) {
		Smonth_ = smonth_;
	}
	public String getSall_() {
		return Sall_;
	}
	public void setSall_(String sall_) {
		Sall_ = sall_;
	}
	public Long getSid() {
		return Sid;
	}
	public void setSid(Long id) {
		Sid = id;
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
	public String getSother() {
		return Sother;
	}
	public void setSother(String sother) {
		Sother = sother;
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
	public String getSimg() {
		return Simg;
	}
	public void setSimg(String simg) {
		Simg = simg;
	}
	public String getSpoint() {
		return Spoint;
	}
	public void setSpoint(String spoint) {
		Spoint = spoint;
	}
	public String getSall() {
		return Sall;
	}
	public void setSall(String sall) {
		Sall = sall;
	}
	
	public String getStype() {
		return Stype;
	}
	public void setStype(String stype) {
		Stype = stype;
	}
	public String getSunit() {
		return Sunit;
	}
	public void setSunit(String sunit) {
		Sunit = sunit;
	}
	public String getZs() {
		return zs;
	}
	public void setZs(String zs) {
		this.zs = zs;
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
	
	

} 