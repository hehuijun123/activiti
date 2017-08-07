package com.ssh.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.entity.Company;
import com.ssh.entity.Purchase;
import com.ssh.entity.Purpose;
import com.ssh.entity.Role;
import com.ssh.entity.Temporary;
import com.ssh.util.ChooseFactory;
import com.ssh.util.ChooseRole;
@Controller
@Scope
public class PurposeAction extends BaseAction<Company> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	private static final Log log = LogFactory.getLog(PurposeAction.class);
	public String selectPurpose(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String work = (String) ActionContext.getContext().getSession().get("work");
		log.error(usernameS+"-查询使用信息");	
		try {
			List<Purpose> list = purposeService.search(page, rows,work);
			for (Purpose purpose : list) {
				String i = purpose.getPcompany();
				purpose.setPcompany(ChooseFactory.chooseWork(i));
			}
			//System.out.println(list.get(5).getCaddress());
			response(list,purposeService.selectall(work));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String searchPurchase(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String company = (String) ActionContext.getContext().getSession().get("work");

		log.error(usernameS+"-查询使用信息");
		try {
			String psdate = getRequest().getParameter("psdate");
			String pedate = getRequest().getParameter("pedate");
			
			String work="";
			if(searchCp!=null){
				work = ChooseFactory.chooseNum(searchCp);
				
			}
			List<Purpose> list = new ArrayList<Purpose>();
			int count = 0;
			
			System.out.println("开始时间："+psdate+"结束时间"+searchType);
			if(searchCp!=null&&!"".equals(searchCp)){
				list = purposeService.searchPc(page, rows,searchCon,searchType,ChooseRole.chooseWorkAndKey(searchCp));//时间，公司，危化品名称
				count = purposeService.selectallPc(searchCon,searchType,ChooseRole.chooseWorkAndKey(searchCp));
			}else{
				list = purposeService.searchPc(page, rows,searchCon,searchType,ChooseRole.chooseWorkAndKey(company));//时间，公司，危化品名称
				count = purposeService.selectallPc(searchCon,searchType,ChooseRole.chooseWorkAndKey(company));

			}
			List<Role> role = roleService.select();
			
			for (Purpose purpose : list) {
				String i = purpose.getPcompany();
				purpose.setPcompany((role.get(Integer.parseInt(i))).getName());
			}
			
			response(list,count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public  String addCompany(){	
		return null;
		
	}
	public String updatePurpose(){
		System.out.println("更新用户");
		String Cid = getRequest().getParameter("id");
		String pname = getRequest().getParameter("pname");
		String pcompany = getRequest().getParameter("pcompany");
		String pdate = getRequest().getParameter("pdate");
		String pnum = getRequest().getParameter("pnum");
		String pperson = getRequest().getParameter("pperson");
		Long cid = Long.parseLong(Cid);
		Purpose purpose = purposeService.select(cid);
		purpose.setPname(pname);
		purpose.setPcompany(pcompany);
		purpose.setPdate(pdate);
		purpose.setPnum(pnum);
		purpose.setPperson(pperson);
		purposeService.update(purpose);
		return null;
	}
	//保存
	public String savePurpose(){	
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String work = (String) ActionContext.getContext().getSession().get("work");
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		if(Cid!=null&&!"".equals(Cid)){
			log.error(usernameS+"-更新使用信息");
			String pname = getRequest().getParameter("pname");
			String pcompany = getRequest().getParameter("pcompany");
			Map<String,String> map = ChooseRole.chooseRole(work);
			String pdate = getRequest().getParameter("pdate");
			String pnum = getRequest().getParameter("pnum");
			String pperson = getRequest().getParameter("pperson");
			String pother = getRequest().getParameter("pother");
			String punit = getRequest().getParameter("punit");
			Long cid = Long.parseLong(Cid);
			Purpose purpose = purposeService.select(cid);
			if(map.get("jt")!=null){
				purpose.setJt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				purpose.setZs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				purpose.setSc(map.get("sc"));
			}
			purpose.setPname(pname);
			purpose.setPcompany(work);
			purpose.setPdate(pdate);
			purpose.setPnum(pnum);
			purpose.setPperson(pperson);
			purpose.setPother(pother);
			purpose.setPunit(punit);
			purposeService.update(purpose);
		}else{
			log.error(usernameS+"-添加使用信息");
			String pname = getRequest().getParameter("pname");
			String pcompany = getRequest().getParameter("pcompany");
			Map<String,String> map = ChooseRole.chooseRole(work);
			String pdate = getRequest().getParameter("pdate");
			String pnum = getRequest().getParameter("pnum");
			String pperson = getRequest().getParameter("pperson");
			String pother = getRequest().getParameter("pother");
			String punit = getRequest().getParameter("punit");
			Purpose purpose = new Purpose();
			if(map.get("jt")!=null){
				purpose.setJt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				purpose.setZs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				purpose.setSc(map.get("sc"));
			}
			purpose.setPname(pname);
			purpose.setPcompany(work);
			purpose.setPdate(pdate);
			purpose.setPnum(pnum);
			purpose.setPperson(pperson);
			purpose.setPother(pother);
			purpose.setPunit(punit);
			purpose.setPr(usernameS);
			purposeService.save(purpose,work);	
		}
		
		return null;
	}
	//删除
	public String deletePurpose(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-删除使用信息");
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		Long cid = Long.parseLong(Cid);
		purposeService.delete(cid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "ok");
		response(map);
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

	private String searchCp;
	private String searchCon;
	private String searchType;
	
}
