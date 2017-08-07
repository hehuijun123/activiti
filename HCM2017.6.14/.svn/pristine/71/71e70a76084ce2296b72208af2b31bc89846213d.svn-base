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
import com.ssh.entity.Purpose;
import com.ssh.entity.Waste;
import com.ssh.entity.WasteJt;
import com.ssh.entity.Wastesc;
import com.ssh.entity.Wastezs;
import com.ssh.util.ChooseRole;
@Controller
@Scope
public class WasteAction extends BaseAction<Waste> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	private static final Log log = LogFactory.getLog(CompanyAction.class);
	public String selectWaste(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String work = (String) ActionContext.getContext().getSession().get("work");
		log.error(usernameS+"-查看废弃物处理");
		try {
			List<Waste> list = wasteService.search(page, rows,work);
			//System.out.println(list.get(5).getCaddress());
			response(list,wasteService.selectall(work));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 查看所有的waste2017-7-3
	 * @return
	 */
	public String searchAllWastejt(){
		try {
			List<Waste> list = wasteService.searchAllWastejt();
			response(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 根废弃物名称和Zs查询waste2017-7-4
	 * @return
	 */
	public String selectByZsAndWname(){
		String Wname1 = getRequest().getParameter("Wname");
		try {
			List<Waste> list = wasteService.selectByZsAndWname(Wname1);
			response(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 根废弃物名称和Sc查询waste2017-7-4
	 * @return
	 */
	public String selectByScAndWname(){
		String Wname1 = getRequest().getParameter("Wname");
		String Cname1 = getRequest().getParameter("Cname1");
		try {
			String pid=wasteService.selectPidByCname(Cname1);
			List<Waste> list = wasteService.selectByScAndWname(Wname1,pid);
			response(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 根废弃物名称查询waste2017-7-6
	 * @return
	 */
	public String selectByWname(){
		String wname = getRequest().getParameter("wname");
		System.out.println(wname);
		try {
			List<Object[]> objList=wasteService.findAllNumZs(wname);
			System.out.println(objList.size());
			List<Wastezs> zsList=new ArrayList<>();
				for (Object[] objects : objList) {
					Wastezs zsWaste=new Wastezs(); 
					int wallnum=(int)objects[1];
					String cname=(String)objects[0];
					zsWaste.setCname(cname);
					zsWaste.setWallnum(wallnum);
					zsList.add(zsWaste);
				}
				response(zsList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String searchPurchase(){
		System.out.println("条件查询----------------------");
		String work = (String) ActionContext.getContext().getSession().get("work");

		try {
//          **************before
//			String psdate = getRequest().getParameter("psdate");
//			String pedate = getRequest().getParameter("pedate");
//			System.out.println("开始时间："+psdate+"结束时间"+pedate);
//			List<Waste> list = wasteService.searchPc(page, rows,searchCon,searchType,ChooseRole.chooseWorkAndKey(work));
//			List<Object> ListNew=new ArrayList<>();
//			//for(int i=0;i<list.size();i++){
//				ListNew.add(list);
//			//}
//          **************now将通过聚合函数查询到的废弃物总量查询出来，  没有时间查询
			List<WasteJt> jtList=new ArrayList<>();
			List<Object[]> obList=wasteService.findAllNumJt();
				for (Object[] objects : obList) {
					WasteJt jtWaste=new WasteJt();
					int wallnum=(int)objects[1];
					String wname=(String)objects[0];
					jtWaste.setWname(wname);
					jtWaste.setWallnum(wallnum);
					jtList.add(jtWaste);
				}
				response(jtList);
			//response(ListNew,wasteService.selectallPc(searchCon,searchType,ChooseRole.chooseWorkAndKey(work)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	public String searchPurchasesc(){
		System.out.println("条件查询----------------------");
		String work = (String) ActionContext.getContext().getSession().get("work");

		try {
			String wname = getRequest().getParameter("wname");
			String cname = getRequest().getParameter("cname");
			String psdate = getRequest().getParameter("psdate");
			String pedate = getRequest().getParameter("pedate");
			System.out.println("开始时间："+psdate+"结束时间"+pedate);
			/**
			 * 以下方法包含了按照时间查询，但是没有限制废弃物名称和公司。后期需要的话，可以整合起来
			 */
			//List<Waste> list = wasteService.searchPc(page, rows,searchCon,searchType,ChooseRole.chooseWorkAndKey(work));
			List<Object[]> list = wasteService.findDetailSC(wname, cname);
			List<Wastesc> jtList=new ArrayList<>();
				for (Object[] objects : list) {		
					Wastesc jtWaste=new Wastesc();										
					jtWaste.setWcompany((String)objects[1]);
					jtWaste.setWdate((String)objects[2]);
					jtWaste.setWname((String)objects[3]);
					jtWaste.setWnum((int)objects[4]);
					jtWaste.setWperson((String)objects[5]);
					jtWaste.setWr((String)objects[10]);
					jtWaste.setCname((String)objects[11]);
					jtList.add(jtWaste);
				}

			response(jtList,wasteService.selectallPc(searchCon,searchType,ChooseRole.chooseWorkAndKey(work)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;		
	}
	public  String addWaste(){	
		return null;
	}
	public String updateWaste(){
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
	public String saveWaste(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String work = (String) ActionContext.getContext().getSession().get("work");
		String Cid = getRequest().getParameter("wid");
		System.out.println("Cid:   "+Cid);
		Map<String,String> map = ChooseRole.chooseRole(work);
		if(Cid!=null&&!"".equals(Cid)){
			log.error(usernameS+"-更新废弃物");
			String wname = getRequest().getParameter("wname");
			String wdate = getRequest().getParameter("wdate");
			String wnum = getRequest().getParameter("wnum");
			String wcompany = getRequest().getParameter("wcompany");
			String wperson = getRequest().getParameter("wperson");
			Long cid = Long.parseLong(Cid);
			Waste waste = wasteService.select(cid);
			if(map.get("jt")!=null){
				waste.setJt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				waste.setZs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				waste.setSc(map.get("sc"));
			}
			waste.setWname(wname);
			waste.setWdate(wdate);
			waste.setWnum(Integer.parseInt(wnum));
			waste.setWcompany(wcompany);
			waste.setWwork(work);
			waste.setWperson(wperson);
			wasteService.update(waste);
		}else{
			log.error(usernameS+"-添加废弃物");
			
			String wname = getRequest().getParameter("wname");
			String wdate = getRequest().getParameter("wdate");
			String wnum = getRequest().getParameter("wnum");
			String wcompany = getRequest().getParameter("wcompany");
			String wperson = getRequest().getParameter("wperson");
			Waste waste = new Waste();
			if(map.get("jt")!=null){
				waste.setJt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				waste.setZs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				waste.setSc(map.get("sc"));
			}
			waste.setWname(wname);
			waste.setWdate(wdate);
			waste.setWnum(Integer.parseInt(wnum));
			waste.setWwork(work);
			waste.setWcompany(wcompany);
			waste.setWperson(wperson);
			waste.setWr(usernameS);
			wasteService.save(waste);
		}
		
		return null;
	}
	//删除
	public String deleteWaste(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-删除废弃物");

		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		Long cid = Long.parseLong(Cid);
		wasteService.delete(cid);
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
	private String searchCon;
	private String searchType;
}
