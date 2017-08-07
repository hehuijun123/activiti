package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * �û���ɫ
 * @author Administrator
 *
 */
@Entity
public class Role {
	@Id
	private Long Rid;
	private String name;//����
	private String url;//�˵�·��
	private String description;//����
	private int seq;//����
	private String iconCls;//ͼ��
	private String parents;//����	
	private String position;
	private String l;
	private String n;
	
	
	public Long getRid() {
		return Rid;
	}
	public void setRid(Long rid) {
		Rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public String getParents() {
		return parents;
	}
	public void setParents(String parents) {
		this.parents = parents;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
}
