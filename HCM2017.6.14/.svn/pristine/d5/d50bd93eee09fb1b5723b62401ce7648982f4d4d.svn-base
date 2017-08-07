package com.ssh.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
import com.ssh.entity.Role;
import com.ssh.entity.Storehouse;
import com.ssh.entity.Temporary;
import com.ssh.entity.ZS;
import com.ssh.service.impl.RoleServiceImpl;
import com.ssh.util.ChooseFactory;
import com.ssh.util.ChooseRole;
import com.ssh.util.DoSum;
import com.ssh.util.GetDate;
@Controller
@Scope
public class StorageAction extends BaseAction<Company> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	
	private static final Log log = LogFactory.getLog(StorageAction.class);
	
	public String selectStorage(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-查询库存");	
		try {
			List<Storehouse> list = storagehouseService.search(page, rows);
			System.out.println(list.get(5).getSname());
			response(list,storagehouseService.selectall());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String searchStorage(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-查询库存");
		String work = (String) ActionContext.getContext().getSession().get("work");
		System.out.println("条件查询----------------------");
		try {
			String psdate = getRequest().getParameter("ssdate");
			
			System.out.println("开始时间："+searchCon+"-=-=-=-=-="+searchCp);
			List<Storehouse> list = storagehouseService.searchPc(page, rows,searchCon,searchCp,work);
			response(list,storagehouseService.selectallPc(searchCon,searchCp,work));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//管理员
	public String searchAllStorage() throws Exception{
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String company = (String) ActionContext.getContext().getSession().get("work");
		String name = "";
		String[] date;
		String dates = "";
		if(searchCp!=null&&!"".equals(searchCp)){
			name = URLDecoder.decode(searchCp,"utf8");
		}
		if(searchCon!=null&&!"".equals(searchCon)){
			date =searchCon.split("-");
			dates = date[0]+"年"+date[1]+"月";
			System.out.println("date---"+dates);
			
		}
		System.out.println("searchCon---"+dates);
		log.error(usernameS+"-查询库存");
		try {
			String psdate = getRequest().getParameter("psdate");
			String pedate = getRequest().getParameter("pedate");
			String scompany = getRequest().getParameter("tt");
			
			List<Temporary> list = new ArrayList<Temporary>();
			int count = 0;
			
			long start = System.currentTimeMillis();
			if(searchType!=null&&!"".equals(searchType)){
				list = storagehouseService.searchAllPc(page, rows,dates,ChooseRole.chooseWorkAndKey(searchType),name);//时间，公司，危化品名称
				count = storagehouseService.selectAllPc(dates,ChooseRole.chooseWorkAndKey(searchType),name);
			}else{
				list = storagehouseService.searchAllPc(page, rows,dates,ChooseRole.chooseWorkAndKey(company),name);//时间，公司，危化品名称
				count = storagehouseService.selectAllPc(dates,ChooseRole.chooseWorkAndKey(company),name);

			}
			List<Role> role = roleService.select();
			
			for (Temporary purchase : list) {
				String i = purchase.getSwork();
				 Role roles = role.get(Integer.parseInt(i));
				purchase.setSwork((role.get(Integer.parseInt(i))).getName());
			}
			long end = System.currentTimeMillis();
			System.out.println("时间："+(end-start));
			response(list,count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	
	public String searchZSStorage() throws Exception{
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String company = (String) ActionContext.getContext().getSession().get("work");
		String sname = getRequest().getParameter("sname");
		String name = "";
		String[] date;
		String dates = "";
		if(searchCp!=null&&!"".equals(searchCp)){
			name = URLDecoder.decode(searchCp,"utf8");
		}
		if(searchCon!=null&&!"".equals(searchCon)){
			date =searchCon.split("-");
			dates = date[0]+"年"+date[1]+"月";
			System.out.println("date---"+dates);
			
		}
		System.out.println("searchCon---"+dates);
		log.error(usernameS+"-查询库存");
		try {
			String psdate = getRequest().getParameter("psdate");
			String pedate = getRequest().getParameter("pedate");
			String scompany = getRequest().getParameter("tt");
			
			List<ZS> list = new ArrayList<ZS>();
			int count = 0;
			
			long start = System.currentTimeMillis();
			if(searchType!=null&&!"".equals(searchType)){
				list = storagehouseService.searchAllZS(page, rows,dates,ChooseRole.chooseWorkAndKey(searchType),URLDecoder.decode(sname,"utf8"));//时间，公司，危化品名称
				count = storagehouseService.selectAllPc(dates,ChooseRole.chooseWorkAndKey(searchType),name);
			}else{
				list = storagehouseService.searchAllZS(page, rows,dates,ChooseRole.chooseWorkAndKey(company),URLDecoder.decode(sname,"utf8"));//时间，公司，危化品名称
				count = storagehouseService.selectAllPc(dates,ChooseRole.chooseWorkAndKey(company),name);

			}
			List<Role> role = roleService.select();
			
			for (ZS purchase : list) {
				 String i = purchase.getZs();
				 Role roles = role.get(Integer.parseInt(i));
				purchase.setSwork((role.get(Integer.parseInt(i))).getName());
			}
			long end = System.currentTimeMillis();
			System.out.println("时间："+(end-start));
			response(list,count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	
	
	public  String selectdetail() throws UnsupportedEncodingException{
		String sname = getRequest().getParameter("sname");
		String sdate = getRequest().getParameter("sdate");
		String swork = getRequest().getParameter("swork");
		String flax = getRequest().getParameter("flax");
		System.out.println("sname---"+URLDecoder.decode(sname,"utf8")+"sdate---"+URLDecoder.decode(sdate,"utf8")+"swork---"+swork+"flax---"+flax);
		List<Storehouse> list = storagehouseService.selectDetail(URLDecoder.decode(sname,"utf8"),URLDecoder.decode(sdate,"utf8"),swork,flax);//时间，公司，危化品名称
		List<Role> role = roleService.select();
		
		for (Storehouse purchase : list) {
			String i = purchase.getSwork();
			 Role roles = role.get(Integer.parseInt(i));
			purchase.setSwork((role.get(Integer.parseInt(i))).getName());
		}
		response(list);
		return null;
		
	}
	public String updateStorage(){
		System.out.println("更新用户");
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
	public String saveStorage(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		if(Cid!=null&&!"".equals(Cid)){
			log.error(usernameS+"-查询库存");
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
			System.out.println("添加用户");
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
	public String deleteStorage(){
		System.out.println("删除--------------------");
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		Long cid = Long.parseLong(Cid);
		companyService.delete(cid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "ok");
		response(map);
		return null;
	}
	
	
	public String searchOrder(){
		List<Storehouse> list = storagehouseService.searchOrder();
		List<Role> role = roleService.select();
		System.out.println(list.size());
		for (Storehouse purchase : list) {
			String i = purchase.getSwork();
			purchase.setSwork((role.get(Integer.parseInt(i))).getName());
			String all = purchase.getSall();
			String sm = purchase.getSmonth();
			String b = purchase.getSbeforeSurplus();
			if(all!=null&&!all.equals("")){
				
				purchase.setSall(all);
			}else{
				purchase.setSall("0");
			}
			if(sm!=null&&!sm.equals("")){
				
				purchase.setSmonth(sm);
			}else{
				purchase.setSmonth("0");
			}
			if(all!=null&&!all.equals("")&&sm!=null&&!sm.equals("")&&b!=null&&!b.equals("")){
				double sb  = java.lang.Math.abs(Double.parseDouble(all)-Double.parseDouble(sm)-Double.parseDouble(b));
				purchase.setSapply(String.valueOf(DoSum.formatDouble4(sb)));
			}
			else{
				purchase.setSapply("0");

			}
		}
		response(list);
		return searchCon;
		
	}
	
	
	
	public String getSearchCon() {
		return searchCon;
	}
	public void setSearchCon(String searchCon) {
		this.searchCon = searchCon;
	}





	public String getSearchCp() {
		return searchCp;
	}
	public void setSearchCp(String searchCp) {
		this.searchCp = searchCp;
	}


	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}


	private String searchCon;
	private String searchCp;
	private String searchType;

	
	
}
