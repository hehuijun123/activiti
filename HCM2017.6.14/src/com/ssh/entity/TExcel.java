package com.ssh.entity;

import java.util.ArrayList;
import java.util.List;

public class TExcel {
	
	private List<Excel> listGas = new ArrayList<>();	//ѹ�������Һ������
	private List<Excel> listwater = new ArrayList<>();	//��ȼҺ��listwater
	private List<Excel> liststone = new ArrayList<>();	//��ȼ����
	private List<Excel> listO2 = new ArrayList<>();	//������
	private List<Excel> listPoison = new ArrayList<>();	//����Ʒ
	private List<Excel> listEmit = new ArrayList<>();	//��������Ʒ
	private List<Excel> listCorrosion = new ArrayList<>();	//��ʴƷ
	private List<Excel> listboom = new ArrayList<>();	//��ըƷ

	public List<Excel> getListstone() {
		return liststone;
	}
	public void setListstone(List<Excel> liststone) {
		this.liststone = liststone;
	}
	public List<Excel> getListboom() {
		return listboom;
	}
	public void setListboom(List<Excel> listboom) {
		this.listboom = listboom;
	}
	public List<Excel> getListwater() {
		return listwater;
	}
	public void setListwater(List<Excel> listwater) {
		this.listwater = listwater;
	}
	public List<Excel> getListO2() {
		return listO2;
	}
	public void setListO2(List<Excel> listO2) {
		this.listO2 = listO2;
	}
	public List<Excel> getListPoison() {
		return listPoison;
	}
	public void setListPoison(List<Excel> listPoison) {
		this.listPoison = listPoison;
	}
	public List<Excel> getListEmit() {
		return listEmit;
	}
	public void setListEmit(List<Excel> listEmit) {
		this.listEmit = listEmit;
	}
	public List<Excel> getListCorrosion() {
		return listCorrosion;
	}
	public void setListCorrosion(List<Excel> listCorrosion) {
		this.listCorrosion = listCorrosion;
	}
	public List<Excel> getListGas() {
		return listGas;
	}
	public void setListGas(List<Excel> listGas) {
		this.listGas = listGas;
	}

}
