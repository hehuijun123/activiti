package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * �û�
 * @author Administrator
 *
 */
@Entity
public class Consumer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Cid;	//id
	private String Cuser;	//��¼��
	private String Cname;	//�û���
	private String Cpassword;	//����
	private String Csex;//�Ա�
	private String Ccompany; 	//ˮ��
	private String Ctel;	//�ֻ���
	private String Cqx;//Ȩ��
	private String Czs;//��ˮ��˾
	private String Cjt;//����
	private String Csc;//ˮ��
	
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
