package com.ssh.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.entity.Company;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Position;
@Controller
@Scope
public class PositionAction extends BaseAction<Position> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	private static final Log log = LogFactory.getLog(PositionAction.class);
	public String selectPosition(){
		System.out.println("企业信息----------------------");
		try {
			String work = (String) ActionContext.getContext().getSession().get("work");
			
			List<Position> list = positionService.selectByWork(work);
			//System.out.println(list.get(5).getCaddress());
			response(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public  String selectCp(){	
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-查看采购信息");
		try {
			String str = getRequest().getParameter("param");
			List<Company> list = companyService.searchHC(str);
			//System.out.println(list.get(5).getCaddress());
			response(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public  String addCompany(){	
		return null;
		
	}
	public String updateCompany(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-更新用户");
		String Cid = getRequest().getParameter("Cid");
		String cname = getRequest().getParameter("cname");
		String caddress = getRequest().getParameter("caddress");
		String ctel = getRequest().getParameter("ctel");
		String emergencyPerson = getRequest().getParameter("emergencyPerson");
		String emergencyCalls = getRequest().getParameter("emergencyCalls");
		String emil = getRequest().getParameter("emil");
		Long cid = Long.parseLong(Cid);
		Company company = companyService.select(cid);
		company.setCaddress(caddress);
		company.setCname(cname);
		company.setCtel(ctel);
		company.setEmergencyCalls(emergencyCalls);
		company.setEmergencyPerson(emergencyPerson);
		company.setEmil(emil);
		companyService.update(company);
		return null;
	}
	//保存
	public String saveCompany(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-查看企业信息");
		String Cid = getRequest().getParameter("id");
		if(Cid!=null&&!"".equals(Cid)){
			log.error(usernameS+"-更新用户");
			String cname = getRequest().getParameter("cname");
			String caddress = getRequest().getParameter("caddress");
			String ctel = getRequest().getParameter("ctel");
			String emergencyPerson = getRequest().getParameter("emergencyPerson");
			String emergencyCalls = getRequest().getParameter("emergencyCalls");
			String emil = getRequest().getParameter("emil");
			Long cid = Long.parseLong(Cid);
			Company company = companyService.select(cid);
			company.setCaddress(caddress);
			company.setCname(cname);
			company.setCtel(ctel);
			company.setEmergencyCalls(emergencyCalls);
			company.setEmergencyPerson(emergencyPerson);
			company.setEmil(emil);
			companyService.update(company);
		}else{
			log.error(usernameS+"-添加企业信息");
			
			String cname = getRequest().getParameter("cname");
			String caddress = getRequest().getParameter("caddress");
			String ctel = getRequest().getParameter("ctel");
			String emergencyPerson = getRequest().getParameter("emergencyPerson");
			String emergencyCalls = getRequest().getParameter("emergencyCalls");
			String emil = getRequest().getParameter("emil");
			Company company = new Company();
			company.setCaddress(caddress);
			company.setCname(cname);
			company.setCtel(ctel);
			company.setEmergencyCalls(emergencyCalls);
			company.setEmergencyPerson(emergencyPerson);
			company.setEmil(emil);
			companyService.save(company);	
		}
		
		return null;
	}
	//删除
	public String deleteCompany(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-删除用户");
		String Cid = getRequest().getParameter("id");
		
		Long cid = Long.parseLong(Cid);
		companyService.delete(cid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "ok");
		response(map);
		return null;
	}
	
}
