package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * ͼƬλ��
 * @author Administrator
 *
 */
@Entity
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Iid;//id
	private String Iimage;//ͼƬ
	private String Iwork;//ˮ��
	private String Inum;//���
	public long getIid() {
		return Iid;
	}
	public void setIid(long iid) {
		Iid = iid;
	}
	public String getIimage() {
		return Iimage;
	}
	public void setIimage(String iimage) {
		Iimage = iimage;
	}
	public String getIwork() {
		return Iwork;
	}
	public void setIwork(String iwork) {
		Iwork = iwork;
	}
	public String getInum() {
		return Inum;
	}
	public void setInum(String inum) {
		Inum = inum;
	}
	
	
	

	
	
}
