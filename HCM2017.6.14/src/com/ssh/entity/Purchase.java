package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 采购
 * @author Administrator
 *
 */
@Entity
public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Pid;	//id
	private String Pname;	//危化物名称
	private String Pcompany;	//单位
	private String Ptype;	//类型
	private String Pdensity;	//密度
	private String Pshape;	//形态
	private String Pnum;	//数量
	private String Pdate;	//日期
	private	String Ppoison;	//是否为剧毒
	private String Papplydate;	//申报日期
	private String Pposition;	//库位
	private String Punit;//危化物计量单位
	private String Pother;//使用场合
	private String Pperson;//记录人
	private String sc;
	private String zs;
	private String jt;
	public long getId() {
		return Pid;
	}
	public void setId(long id) {
		this.Pid = id;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPcompany() {
		return Pcompany;
	}
	public void setPcompany(String pcompany) {
		Pcompany = pcompany;
	}
	public String getPtype() {
		return Ptype;
	}
	public void setPtype(String ptype) {
		Ptype = ptype;
	}
	public String getPdensity() {
		return Pdensity;
	}
	public void setPdensity(String pdensity) {
		Pdensity = pdensity;
	}
	public String getPshape() {
		return Pshape;
	}
	public void setPshape(String pshape) {
		Pshape = pshape;
	}
	public String getPdate() {
		return Pdate;
	}
	public void setPdate(String pdate) {
		Pdate = pdate;
	}
	public String getPpoison() {
		return Ppoison;
	}
	public void setPpoison(String ppoison) {
		Ppoison = ppoison;
	}
	public String getPapplydate() {
		return Papplydate;
	}
	public void setPapplydate(String papplydate) {
		Papplydate = papplydate;
	}
	public String getPnum() {
		return Pnum;
	}
	public void setPnum(String pnum) {
		Pnum = pnum;
	}
	public String getPposition() {
		return Pposition;
	}
	public void setPposition(String pposition) {
		Pposition = pposition;
	}
	public String getPunit() {
		return Punit;
	}
	public void setPunit(String punit) {
		Punit = punit;
	}
	public String getPother() {
		return Pother;
	}
	public void setPother(String pother) {
		Pother = pother;
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
	public String getPperson() {
		return Pperson;
	}
	public void setPperson(String pperson) {
		Pperson = pperson;
	}
	
}
