package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 用户
 * @author Administrator
 *
 */
@Entity
public class Consumer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Cid;	//id
	private String Cuser;	//登录名
	private String Cname;	//用户名
	private String Cpassword;	//密码
	private String Csex;//性别
	private String Ccompany; 	//水厂
	private String Ctel;	//手机号
	private String Cqx;//权限
	private String Czs;//制水公司
	private String Cjt;//集团
	private String Csc;//水厂
	
	public Long getId() {
		return Cid;
	}
	public void setId(Long id) {
		this.Cid = id;
	}
	public String getCuser() {
		return Cuser;
	}
	public void setCuser(String cuser) {
		Cuser = cuser;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCpassword() {
		return Cpassword;
	}
	public void setCpassword(String cpassword) {
		Cpassword = cpassword;
	}
	public String getCsex() {
		return Csex;
	}
	public void setCsex(String csex) {
		Csex = csex;
	}
	public String getCcompany() {
		return Ccompany;
	}
	public void setCcompany(String ccompany) {
		Ccompany = ccompany;
	}
	public String getCtel() {
		return Ctel;
	}
	public void setCtel(String ctel) {
		Ctel = ctel;
	}
	public String getCqx() {
		return Cqx;
	}
	public void setCqx(String cqx) {
		Cqx = cqx;
	}
	public String getCzs() {
		return Czs;
	}
	public void setCzs(String czs) {
		Czs = czs;
	}
	public String getCjt() {
		return Cjt;
	}
	public void setCjt(String cjt) {
		Cjt = cjt;
	}
	public String getCsc() {
		return Csc;
	}
	public void setCsc(String csc) {
		Csc = csc;
	}
	
}
