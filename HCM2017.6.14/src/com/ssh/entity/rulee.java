package com.ssh.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * ���ɷ���
 * @author Administrator
 *
 */
@Entity
public class rulee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long rid;
	private String rname;
	private String rdate;	//�ϴ�����
	private String rperson;	//�ϴ���
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getRperson() {
		return rperson;
	}
	public void setRperson(String rperson) {
		this.rperson = rperson;
	}
	
	
	
}
