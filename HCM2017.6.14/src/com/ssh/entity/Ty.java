package com.ssh.entity;

import java.util.ArrayList;
import java.util.List;

public class Ty {
	
	private List<Storehouse> listGas = new ArrayList<>();	//压缩气体和液化气体
	private List<Storehouse> listwater = new ArrayList<>();	//易燃液体listwater
	private List<Storehouse> liststone = new ArrayList<>();	//易燃固体
	private List<Storehouse> listO2 = new ArrayList<>();	//氧化剂
	private List<Storehouse> listPoison = new ArrayList<>();	//毒害品
	private List<Storehouse> listEmit = new ArrayList<>();	//放射性物品
	private List<Storehouse> listCorrosion = new ArrayList<>();	//腐蚀品
	private List<Storehouse> listboom = new ArrayList<>();	//爆炸品

	public List<Storehouse> getListstone() {
		return liststone;
	}
	public void setListstone(List<Storehouse> liststone) {
		this.liststone = liststone;
	}
	public List<Storehouse> getListboom() {
		return listboom;
	}
	public void setListboom(List<Storehouse> listboom) {
		this.listboom = listboom;
	}
	public List<Storehouse> getListwater() {
		return listwater;
	}
	public void setListwater(List<Storehouse> listwater) {
		this.listwater = listwater;
	}
	public List<Storehouse> getListO2() {
		return listO2;
	}
	public void setListO2(List<Storehouse> listO2) {
		this.listO2 = listO2;
	}
	public List<Storehouse> getListPoison() {
		return listPoison;
	}
	public void setListPoison(List<Storehouse> listPoison) {
		this.listPoison = listPoison;
	}
	public List<Storehouse> getListEmit() {
		return listEmit;
	}
	public void setListEmit(List<Storehouse> listEmit) {
		this.listEmit = listEmit;
	}
	public List<Storehouse> getListCorrosion() {
		return listCorrosion;
	}
	public void setListCorrosion(List<Storehouse> listCorrosion) {
		this.listCorrosion = listCorrosion;
	}
	public List<Storehouse> getListGas() {
		return listGas;
	}
	public void setListGas(List<Storehouse> listGas) {
		this.listGas = listGas;
	}

}
