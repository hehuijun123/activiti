package com.ssh.action;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionContext;
import com.ssh.entity.Consumer;
import com.ssh.entity.Logg;
import com.ssh.entity.Logs;
import com.ssh.entity.Resources;
import com.ssh.entity.Role;
import com.ssh.util.BinarySearchUtil;
import com.ssh.util.ChooseFactory;
import com.ssh.util.ChooseRole;
import com.ssh.util.MD5Util;
@Controller
@Scope
public class UserAction extends BaseAction<Consumer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	private static final Log log = LogFactory.getLog(UserAction.class);
	public String result;
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String selectUser(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-��ѯ�û�");
		try {
			List<Consumer> list = userService.search(page, rows);
			//System.out.println(list.get(5).getCaddress());
			for (Consumer purchase : list) {
				//String i = purchase.getCcompany();
				purchase.setCcompany(ChooseFactory.chooseRole(purchase));
				String sex = purchase.getCsex();
				if(sex.equals("0")){
					purchase.setCsex("��");
				}
				if(sex.equals("1")){
					purchase.setCsex("Ů");
				}
				
			}
			
			response(list,userService.selectall());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public  String addUser(){	
		return null;
		
	}
	public String updateUser(){
		System.out.println("�����û�");
		String Cid = getRequest().getParameter("id");
		String cname = getRequest().getParameter("cuser");
		String caddress = getRequest().getParameter("cname");
		String ctel = getRequest().getParameter("csex");
		String emergencyPerson = getRequest().getParameter("ccompany");
		String emergencyCalls = getRequest().getParameter("ctel");
		Long cid = Long.parseLong(Cid);
		Consumer consumer = userService.select(cid);
		
		userService.update(consumer);
		return null;
	}
	/*
	 * 
	 * ����:�ȵ�ǰ̨tree���������ֶε�ʱ����Ҫ�����ж�
	 * 1���ݴ��������ֶβ�ѯ��role�����Ƿ��и��ڵ㣬������ڸ��ڵ㿴�м��㸸�ڵ�
	 * 		���������ڸ��ڵ㣬˵�����û��Ǽ����û�������������ֵ���浽�����ֶ���
	 * 		��������һ�㸸�ڵ㣬˵����ֻ˵��˾�û�������������ֵ���浽��ˮ��˾�ֶ��У����ҽ��鵽�ĸ��ڵ���뵽�����ֶ���
	 * 		�����������㸸�ڵ㣬˵�����û���ˮ���û��������������ֶα��浽ˮ���ֶ��У����ϼ����ڵ㱣�浽��ˮ�ֹ�˾�ֶ��У����ϼ����ڵ㱣�浽�����ֶ���
	 */
	public String saveUser(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		if(Cid!=null&&!"".equals(Cid)){
			log.error(usernameS+"-�����û�");
			String cuser = getRequest().getParameter("cuser");
			String cname = getRequest().getParameter("cname");
			String csex = getRequest().getParameter("csex");
			//String ccompany = getRequest().getParameter("ccompany");
			Map<String,String> map = ChooseRole.chooseRole(tt);
			for(Map.Entry<String, String> entry : map.entrySet()){
				 System.out.println("�� key ��"+entry.getKey()+" ֵvalue ��"+entry.getValue());
				 
			 }
			
			String ctel = getRequest().getParameter("ctel");
			Long cid = Long.parseLong(Cid);
			Consumer consumer = userService.select(cid);
			if(map.get("jt")!=null){
				consumer.setCjt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				consumer.setCzs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				consumer.setCsc(map.get("sc"));
			}
			consumer.setCuser(cuser);
			consumer.setCname(cname);
			consumer.setCpassword(MD5Util.string2MD5("123456"));
			consumer.setCsex(csex);
			//consumer.setCcompany(tt);
			consumer.setCtel(ctel);
			userService.update(consumer);
		}else{
			log.error(usernameS+"-����û�");
			String cuser = getRequest().getParameter("cuser");
			String cname = getRequest().getParameter("cname");
			String csex = getRequest().getParameter("csex");
			//String ccompany = getRequest().getParameter("ccompany");
			Map<String,String> map = ChooseRole.chooseRole(tt);
			for(Map.Entry<String, String> entry : map.entrySet()){
				 System.out.println("�� key ��"+entry.getKey()+" ֵvalue ��"+entry.getValue());
				 
			 }
			
			String ctel = getRequest().getParameter("ctel");
			Consumer consumer = new Consumer();
			if(map.get("jt")!=null){
				consumer.setCjt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				consumer.setCzs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				consumer.setCsc(map.get("sc"));
			}
			consumer.setCuser(cuser);
			consumer.setCname(cname);
			consumer.setCpassword(MD5Util.string2MD5("123456"));
			consumer.setCsex(csex);
			//consumer.setCcompany(tt);
			consumer.setCtel(ctel);
			System.out.println("tt"+tt);
			userService.save(consumer);	
		}
		
		return null;
	}
	//ɾ��
	public String deleteUser(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-ɾ���û�");
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		Long cid = Long.parseLong(Cid);
		userService.delete(cid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "ok");
		response(map);
		return null;
	}
	//��ѯ��־
	public String selectLog(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String work = (String) ActionContext.getContext().getSession().get("work");
		try {
			String psdate = getRequest().getParameter("psdate");
			String pedate = getRequest().getParameter("pedate");
			System.out.println("��ʼʱ�䣺"+psdate+"����ʱ��"+pedate);
			List<Logg> list = logService.searchPc(page, rows,searchCon,searchType,work);
			response(list,logService.selectallPc(searchCon,searchType,work));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	//��ѯ��־
		public String LogOrder(){
			try {
				
				List<Logs> list = logService.selectOrder();
				response(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	//��¼
	public String login(){
		Consumer consumer = userService.Login(uname);
		Map map = ActionContext.getContext().getSession();
		map.clear();
		log.error(uname+"-��¼ϵͳ");
		String results;
		if(consumer!=null){
			if(MD5Util.checkPassword(userpwd, consumer.getCpassword())){
				ServletActionContext.getRequest().getSession().setAttribute("loginName", uname);
				
				ServletActionContext.getRequest().getSession().setAttribute("password", userpwd);
				ServletActionContext.getRequest().getSession().setAttribute("work", ChooseFactory.chooseRoleId(consumer));
				ServletActionContext.getRequest().getSession().setAttribute("role", ChooseFactory.chooseRoles(consumer));
				
				String work = (String) ActionContext.getContext().getSession().get("work");
				System.out.println("work:-------"+work);
				String qx = consumer.getCqx().replace(" ", "");
				try {
					if(qx!=null&&!"".equals(qx)){
						String[] str = qx.split(",");
						List<Resources> listrs = rightService.search();
					    long[] ids = new long[listrs.size()];
					    for (int a = 0; a<listrs.size();a++) {
							ids[a] = listrs.get(a).getRid();
						}
						for(int i = 0;i<str.length;i++){
							String s = str[i];
							int ss = Integer.valueOf(s);
							/*for(int j = 0;j<listrs.size();j++){
								Resources resources = listrs.get(j);
								Long id =resources.getRid();
								if(ss==id){
									map.put(resources.getName(), resources.getUrl());break;
								}
							}	*/
							int  j = BinarySearchUtil.binarySearch(ids, ss);

							map.put(listrs.get(j).getName(), listrs.get(j).getUrl());
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String url = (String) ActionContext.getContext().getSession().get("ɾ���ɹ���Ϣ");	
				results="a"; 	
			}else{
				//��½ʧ��
				results="b";  
			}
		}else{
			//��½ʧ��
			results="c";  
		}
		System.out.println("result:__________________"+results);
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("info", results);
		results = JSONObject.toJSONString(results);
		result = results.toString();
		//response(result);
		return SUCCESS;
	}
	//�޸�����
	public String savepw(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-�޸�����");		
		String username = (String) ActionContext.getContext().getSession().get("loginName");
		String loginPassword= getRequest().getParameter("newpassword");
		Consumer consumer = userService.Login(username);
		consumer.setCpassword(MD5Util.string2MD5(loginPassword));
		userService.update(consumer);
		ActionContext.getContext().getSession().clear();
		
		return SUCCESS;	
	}
	//��ѯsession�е��û�
	public String sessionUser() throws UnsupportedEncodingException{
		
		String username = (String) ActionContext.getContext().getSession().get("loginName");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		System.out.println("session-------------------zcm"+username);
		response(username);
		return SUCCESS;
	}
	/*//��ѯ�û����� 
	public String selectpassword(){
		String username = (String) ActionContext.getContext().getSession().get("loginName");
		String oldloginPassword= getRequest().getParameter("oldloginPassword");	//ԭ����
		Consumer consumer = userService.Login(username);	
		String loginPassword = consumer.getCpassword();
		System.out.println(loginPassword);
		System.out.println(MD5Util.string2MD5(oldloginPassword));
		if(MD5Util.checkPassword(oldloginPassword, loginPassword)){
			System.out.println(MD5Util.string2MD5(oldloginPassword));
			System.out.println(loginPassword);
			result="a";
		}else{
			result = "b";
		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("info", result);
		JSONObject jo = JSONObject.fromObject(map);
		result = jo.toString();
		System.out.println(result);
		return SUCCESS;
	}*/
	//��ѯˮ��
	public String selectRole() throws Exception{
		String work = (String) ActionContext.getContext().getSession().get("work");		
		Role role = roleService.selectById(Long.valueOf(work));
		System.out.println("ˮ�����ƣ�"+role.getName());
		byte[] a = role.getName().getBytes();
		String result = new String(a,"GBK");
		System.out.println("ˮ�����ƣ�"+result+a.length);
//		response(result);
        getResponse().setCharacterEncoding("GBK");
        getResponse().setContentType("text/html;charset=GBK");
        getResponse().getWriter().write(result);
		return null;
	}
	
	public String selectRoles(){
		List<Role> list = roleService.select();
		response(list);
		
		return null;
		
	}
	public String getSearchCon() {
		return searchCon;
	}
	public void setSearchCon(String searchCon) {
		this.searchCon = searchCon;
	}


	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}


	public String getSearchCp() {
		return searchCp;
	}
	public void setSearchCp(String searchCp) {
		this.searchCp = searchCp;
	}


	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}


	public String getTt() {
		return tt;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}


	private String searchCon;
	private String searchCp;
	private String searchType;
	private String uname;
	private String userpwd;
	private String tt;

	
	
}
