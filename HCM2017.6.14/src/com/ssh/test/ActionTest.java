package com.ssh.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;


@Controller
@Scope("prototype")
public class ActionTest extends ActionSupport {
	//���ڲ��Ե���Struts�Ƿ�ɹ�
	public String index(){
		System.out.println("success");
		return "index";
	}

}
