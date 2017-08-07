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
@Controller
@Scope
public class HazrdousChemicalsAction extends BaseAction<HazardousChemicals> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	private static final Log log = LogFactory.getLog(HazrdousChemicalsAction.class);
	public String selectHazardousChemicals(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-查看危化物信息");
		try {
			List<HazardousChemicals> list = hazardousChemicalsService.search(page, rows);
			//System.out.println(list.get(5).getCaddress());
			response(list,hazardousChemicalsService.selectall());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String selectHazardousChemicalsOrder(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-查看危化物信息");
		try {
			List<HazardousChemicals> list = hazardousChemicalsService.searchAll();
			//System.out.println(list.get(5).getCaddress());
			response(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public  String selectHC(){	
		System.out.println("企业信息----------------------");
		try {
			String str = getRequest().getParameter("param");
			List<HazardousChemicals> list = hazardousChemicalsService.searchHC(str);
			//System.out.println(list.get(5).getCaddress());
			response(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public String updateHazardousChemicals(){
		System.out.println("更新用户");
		String Cid = getRequest().getParameter("id");
		String name = getRequest().getParameter("name");
		String othername = getRequest().getParameter("othername");
		String CASNum = getRequest().getParameter("cASNum");
		String other = getRequest().getParameter("other");
		Long cid = Long.parseLong(Cid);
		HazardousChemicals hazardousChemicals = hazardousChemicalsService.select(cid);
		hazardousChemicals.setCASNum(CASNum);
		hazardousChemicals.setName(name);
		hazardousChemicals.setOther(other);
		hazardousChemicals.setOthername(othername);
		hazardousChemicalsService.update(hazardousChemicals);
		return null;
	}
	//保存
	public String saveHazardousChemicals(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		if(Cid!=null&&!"".equals(Cid)){
			log.error(usernameS+"-更新危化物");
			String name = getRequest().getParameter("name");
			String hnum = getRequest().getParameter("hnum");
			String othername = getRequest().getParameter("othername");
			String CASNum = getRequest().getParameter("cASNum");
			String other = getRequest().getParameter("other");
			Long cid = Long.parseLong(Cid);
			HazardousChemicals hazardousChemicals = hazardousChemicalsService.select(cid);
			hazardousChemicals.setCASNum(CASNum);
			hazardousChemicals.setName(name);
			hazardousChemicals.setOther(other);
			hazardousChemicals.setOthername(othername);
			hazardousChemicals.setHnum(hnum);
			hazardousChemicalsService.update(hazardousChemicals);
		}else{
			log.error(usernameS+"-添加危化物");
			String name = getRequest().getParameter("name");
			String othername = getRequest().getParameter("othername");
			String CASNum = getRequest().getParameter("CASNum");
			String other = getRequest().getParameter("other");
			String hnum = getRequest().getParameter("hnum");
			HazardousChemicals hazardousChemicals = new HazardousChemicals();
			hazardousChemicals.setCASNum(CASNum);
			hazardousChemicals.setName(name);
			hazardousChemicals.setOther(other);
			hazardousChemicals.setOthername(othername);
			hazardousChemicals.setHnum(hnum);
			hazardousChemicalsService.save(hazardousChemicals);	
		}
		
		return null;
	}
	//删除
	public String deleteHazardousChemicals(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-删除危化物信息");
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		Long cid = Long.parseLong(Cid);
		hazardousChemicalsService.delete(cid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "ok");
		response(map);
		return null;
	}
	
}
