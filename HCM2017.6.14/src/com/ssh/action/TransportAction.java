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
import com.ssh.entity.Purpose;
import com.ssh.entity.Transport;
import com.ssh.util.ChooseRole;
@Controller
@Scope
public class TransportAction extends BaseAction<Transport> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	private static final Log log = LogFactory.getLog(TransportAction.class);
	public String selectTransport(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String work = (String) ActionContext.getContext().getSession().get("work");
		log.error(usernameS+"-查询运输");		
		try {
			List<Transport> list = transportService.search(page, rows,work);
			//System.out.println(list.get(5).getCaddress());
			response(list,transportService.selectall(work));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String searchPurchase(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String company = (String) ActionContext.getContext().getSession().get("work");

		log.error(usernameS+"-查询运输");	
		try {
			String psdate = getRequest().getParameter("psdate");
			String pedate = getRequest().getParameter("pedate");
			System.out.println("开始时间："+psdate+"结束时间"+pedate);
			List<Transport> list = transportService.searchPc(page, rows,searchCon,searchType,searchNum,ChooseRole.chooseWorkAndKey(company));
			response(list,transportService.selectallPc(searchCon,searchType,searchNum,ChooseRole.chooseWorkAndKey(company)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public  String addCompany(){	
		return null;
		
	}
	public String updateTransport(){
		System.out.println("更新用户");
		String Cid = getRequest().getParameter("Cid");
		String cname = getRequest().getParameter("cname");
		String caddress = getRequest().getParameter("caddress");
		String ctel = getRequest().getParameter("ctel");
		String emergencyPerson = getRequest().getParameter("emergencyPerson");
		String emergencyCalls = getRequest().getParameter("emergencyCalls");
		String emil = getRequest().getParameter("emil");
		Long cid = Long.parseLong(Cid);
		
		return null;
	}
	//保存
	public String saveTransport(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String work = (String) ActionContext.getContext().getSession().get("work");

		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		if(Cid!=null&&!"".equals(Cid)){
			log.error(usernameS+"-更新运输信息");	
			String tnum = getRequest().getParameter("tnum");
			String tdate = getRequest().getParameter("tdate");
			String tperson = getRequest().getParameter("tperson");
			String tother = getRequest().getParameter("tother");
			String tcompany = getRequest().getParameter("tcompany");
			Long cid = Long.parseLong(Cid);
			Transport transport = transportService.select(cid);
			transport.setTnum(tnum);
			transport.setTdate(tdate);
			transport.setTcompany(tcompany);
			transport.setTperson(tperson);
			transport.setTother(tother);
			transport.setTwork(work);
			transportService.update(transport);
		}else{
			log.error(usernameS+"-添加运输信息");	
			String tnum = getRequest().getParameter("tnum");
			String tdate = getRequest().getParameter("tdate");
			String tcompany = getRequest().getParameter("tcompany");
			String tperson = getRequest().getParameter("tperson");
			String tother = getRequest().getParameter("tother");
			Map<String,String> map = ChooseRole.chooseRole(work);
			Transport transport = new Transport();
			if(map.get("jt")!=null){
				transport.setJt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				transport.setZs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				transport.setSc(map.get("sc"));
			}
			transport.setTnum(tnum);
			transport.setTdate(tdate);
			transport.setTcompany(tcompany);
			transport.setTperson(tperson);
			transport.setTwork(work);
			transport.setTother(tother);
			transport.setTr(usernameS);
			transportService.save(transport);	
		}
		
		return null;
	}
	//删除
	public String deleteTransport(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-删除运输运输");	
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		Long cid = Long.parseLong(Cid);
		transportService.delete(cid);
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

	public String getSearchNum() {
		return searchNum;
	}

	public void setSearchNum(String searchNum) {
		this.searchNum = searchNum;
	}

	private String searchNum;
	private String searchCon;
	private String searchType;
	
	
}
