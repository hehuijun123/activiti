package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 使用
 * @author Administrator
 *
 */
@Entity
public class Apply {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Aid;	//id
	private String Aname;	//危化品名称
	private String Anum;	//使用量
	private String Acompany;	//使用单位	
	private String Adate;	//使用日期
	private String Aperson;	//使用人员
	private	String A2d;	//2D图
	private String A3d;	//3d图
	public long getId() {
		return Aid;
	}
	public void setId(long id) {
		this.Aid = id;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public String getAnum() {
		return Anum;
	}
	public void setAnum(String anum) {
		Anum = anum;
	}
	public String getAcompany() {
		return Acompany;
	}
	public void setAcompany(String acompany) {
		Acompany = acompany;
	}
	public String getAdate() {
		return Adate;
	}
	public void setAdate(String adate) {
		Adate = adate;
	}
	public String getAperson() {
		return Aperson;
	}
	public void setAperson(String aperson) {
		Aperson = aperson;
	}
	public String getA2d() {
		return A2d;
	}
	public void setA2d(String a2d) {
		A2d = a2d;
	}
	public String getA3d() {
		return A3d;
	}
	public void setA3d(String a3d) {
		A3d = a3d;
	}
	
}
