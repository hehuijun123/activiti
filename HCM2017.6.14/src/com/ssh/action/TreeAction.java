package com.ssh.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;
import com.ssh.entity.Consumer;
import com.ssh.entity.Tree;
@Controller
@Scope("prototype")
public class TreeAction extends BaseAction<Tree> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4345012905699836064L;

	/**
	 * 
	 */

	public String tree(){
		System.out.println("tree");
		List<Tree> tree = rightService.select();
		for(Tree tr:tree){
			System.out.println(JSONObject.toJSONString(tr));
			
		}
		response(tree);
		return null;	
	}
	
	
	public String treeRole(){
		System.out.println("treeRole");
		List<Tree> tree = rightService.selectRole();
		for(Tree tr:tree){
			System.out.println(JSONObject.toJSONString(tr));
			
		}
		response(tree);
		return null;	
	}
	
	
	public String addRight(){
		System.out.println("test-------------");
		String id = getRequest().getParameter("id");
		System.out.println(tt);
		String[] resourceIdArr = tt.split(",");
		Consumer consumer = userService.select(Long.valueOf(id));
		for(String str:resourceIdArr){
			System.out.println("str:"+str+"   tt:"+tt.replace(" ", ""));
		}
		if(tt!=null&&!"".equals(tt)){
			consumer.setCqx(tt.replace(" ", ""));
		}
		userService.update(consumer);
		
		return null;
		
	}
	
	
	public String getTt() {
		return tt;
	}


	public void setTt(String tt) {
		this.tt = tt;
	}


	private String tt;
	

}
