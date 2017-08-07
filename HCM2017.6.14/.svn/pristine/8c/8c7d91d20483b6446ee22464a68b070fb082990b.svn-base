package com.ssh.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.formula.functions.Choose;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.entity.Company;
import com.ssh.entity.Purchase;
import com.ssh.entity.Purpose;
import com.ssh.entity.Role;
import com.ssh.entity.Storehouse;
import com.ssh.entity.Temporary;
import com.ssh.util.ChooseFactory;
import com.ssh.util.ChooseRole;
@Controller
@Scope
public class PurchaseAction extends BaseAction<Company> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	private static final Log log = LogFactory.getLog(PurchaseAction.class);
	public String selectPurchase(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String work = (String) ActionContext.getContext().getSession().get("work");
		log.error(usernameS+"-查询采购信息");	
		try {
			List<Purchase> list = purchaseService.search(page, rows,work);
			for (Purchase purchase : list) {
				String i = purchase.getPcompany();
				purchase.setPcompany(ChooseFactory.chooseIdName(i));
				String j = purchase.getPpoison();
				if(j!=null){
					
					if(j.equals("1")){
						purchase.setPpoison("是");
					}else{
						purchase.setPpoison("否");
					}
					
				}
				
			}
			//System.out.println(list.get(5).getCaddress());
			response(list,purchaseService.selectall(work));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public String searchPurchase(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String company = (String) ActionContext.getContext().getSession().get("work");

		log.error(usernameS+"-查询采购信息");	
		try {
			String psdate = getRequest().getParameter("psdate");
			String pedate = getRequest().getParameter("pedate");
			System.out.println("开始时间："+psdate+"结束时间"+pedate);
			String work="";
			if(searchCp!=null){
				work = ChooseFactory.chooseNum(searchCp);
				
			}
			List<Purchase> list = new ArrayList<Purchase>();
			int count = 0;
			
			System.out.println("开始时间："+psdate+"结束时间"+searchType);
			if(searchCp!=null&&!"".equals(searchCp)){
				list = purchaseService.searchPc(page, rows,searchCon,searchType,ChooseRole.chooseWorkAndKey(searchCp));//时间，公司，危化品名称
				count = purchaseService.selectallPc(searchCon,searchType,ChooseRole.chooseWorkAndKey(searchCp));
			}else{
				list = purchaseService.searchPc(page, rows,searchCon,searchType,ChooseRole.chooseWorkAndKey(company));//时间，公司，危化品名称
				count = purchaseService.selectallPc(searchCon,searchType,ChooseRole.chooseWorkAndKey(company));

			}
			
			List<Role> role = roleService.select();
			
			for (Purchase purchase : list) {
				String i = purchase.getPcompany();
				purchase.setPcompany((role.get(Integer.parseInt(i))).getName());
				String j = purchase.getPpoison();
				if(j.equals("1")){
					purchase.setPpoison("是");
				}else if(j.equals("0")){
					purchase.setPpoison("否");
				}
			}			
			response(list,count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public  String addPurchase(){	
		return null;
		
	}
	public String updatePurchase(){
		System.out.println("更新用户");
		String Cid = getRequest().getParameter("id");
		String pname = getRequest().getParameter("name");
		String pcompany = getRequest().getParameter("pcompany");
		String ptype = getRequest().getParameter("ptype");
		String pdensity = getRequest().getParameter("pdensity");
		String pshape = getRequest().getParameter("pshape");
		String pdate = getRequest().getParameter("pdate");
		String ppoison = getRequest().getParameter("ppoison");
		Long cid = Long.parseLong(Cid);
		Purchase purchase = purchaseService.select(cid);
		purchase.setPname(pname);
		purchase.setPcompany(pcompany);
		purchase.setPtype(ptype);
		purchase.setPdensity(pdensity);
		purchase.setPshape(pshape);
		purchase.setPdate(pdate);
		purchase.setPpoison(ppoison);
		String papplydate ="";
		if(ppoison.equals("1")){
			 papplydate = getRequest().getParameter("papplydate");
			 purchase.setPapplydate(papplydate);
		}
		purchaseService.update(purchase);
		return null;
	}
	//保存
	public String savePurchase(){
		String work = (String) ActionContext.getContext().getSession().get("work");
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		if(Cid!=null&&!"".equals(Cid)){
			log.error(usernameS+"-更新采购信息");	
			String pname = getRequest().getParameter("pname");
			System.out.println(pname);
			String pcompany = getRequest().getParameter("pcompany");
			Map<String,String> map = ChooseRole.chooseRole(work);
			
			
			String punit = getRequest().getParameter("punit");
			String ptype = getRequest().getParameter("ptype");
			String pdensity = getRequest().getParameter("pdensity");
			System.out.println("类型"+ptype);
			String pshape = getRequest().getParameter("pshape");
			String pdate = getRequest().getParameter("pdate");
			String ppoison = getRequest().getParameter("ppoison");
			String pnum = getRequest().getParameter("pnum");
			String pother = getRequest().getParameter("pother");
			String pposition = getRequest().getParameter("pposition");
			Long cid = Long.parseLong(Cid);
			Purchase purchase = purchaseService.select(cid);
			
			if(map.get("jt")!=null){
				purchase.setJt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				purchase.setZs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				purchase.setSc(map.get("sc"));
			}
			purchase.setPname(pname);
			purchase.setPother(pother);
			purchase.setPunit(punit);
			purchase.setPcompany(work);
			purchase.setPtype(ptype);
			purchase.setPdensity(pdensity);
			purchase.setPshape(pshape);
			purchase.setPdate(pdate);
			purchase.setPpoison(ppoison);
			purchase.setPnum(pnum);
			purchase.setPposition(pposition);
			String papplydate ="";
			/*if(ppoison.equals("1")){
				 papplydate = getRequest().getParameter("papplydate");
				 purchase.setPapplydate(papplydate);
			}*/
			purchaseService.update(purchase);
		}else{
			String pname = getRequest().getParameter("pname");
			log.error(usernameS+"-添加采购信息");
			String pcompany = getRequest().getParameter("pcompany");
			String punit = getRequest().getParameter("punit");
			String pother = getRequest().getParameter("pother");
			Map<String,String> map = ChooseRole.chooseRole(work);
			String ptype = getRequest().getParameter("ptype");
			System.out.println("类型"+ptype);
			String pdensity = getRequest().getParameter("pdensity");
			String pshape = getRequest().getParameter("pshape");
			String pdate = getRequest().getParameter("pdate");
			String ppoison = getRequest().getParameter("ppoison");
			String pnum = getRequest().getParameter("pnum");
			String pposition = getRequest().getParameter("pposition");
			System.out.println(pposition);
			Purchase purchase = new Purchase();
			purchase.setPname(pname);
			purchase.setPunit(punit);
			purchase.setPcompany(work);
			purchase.setPtype(ptype);
			purchase.setPdensity(pdensity);
			purchase.setPshape(pshape);
			purchase.setPdate(pdate);
			purchase.setPpoison(ppoison);
			purchase.setPnum(pnum);
			purchase.setPother(pother);
			purchase.setPposition(pposition);
			purchase.setPperson(usernameS);
			if(map.get("jt")!=null){
				purchase.setJt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				purchase.setZs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				purchase.setSc(map.get("sc"));
			}
			String papplydate ="";
			if(ppoison.equals("1")){
				 papplydate = getRequest().getParameter("papplydate");
				 purchase.setPapplydate(papplydate);
			}
			purchaseService.save(purchase,work);	
		}
		
		return null;
	}
	//删除
	public String deletePurchase(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		log.error(usernameS+"-删除采购信息");
		String Cid = getRequest().getParameter("id");
		System.out.println("Cid:   "+Cid);
		Long cid = Long.parseLong(Cid);
		purchaseService.delete(cid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "ok");
		response(map);
		return null;
	}
	//查询采购量使用量
	public String selectOrder(){
		List<Purchase> listu = purchaseService.selectOrder();
		List<Purpose> listo = purposeService.selectOrder();
		List<Role> role = roleService.select();
		
		for (Purchase purchase : listu) {
			String i = purchase.getPcompany();
			purchase.setPcompany((role.get(Integer.parseInt(i))).getName());
			String j = purchase.getPpoison();
			if(j.equals("1")){
				purchase.setPpoison("是");
			}else if(j.equals("0")){
				purchase.setPpoison("否");
			}
		}	
		System.out.println(listu.size());
		response(listu);
		return null;
		
	}
	//查询采购量使用量
		public String selectOrders(){
			List<Purpose> listo = purposeService.selectOrder();
			List<Role> role = roleService.select();
			
			for (Purpose purchase : listo) {
				String i = purchase.getPcompany();
				purchase.setPcompany((role.get(Integer.parseInt(i))).getName());
				
			}	
			System.out.println(listo);
			response(listo);
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


	private String searchCon;
	private String searchCp;
	private String searchType;
	
}
