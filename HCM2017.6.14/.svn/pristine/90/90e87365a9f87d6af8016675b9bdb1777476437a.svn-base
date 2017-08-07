package com.ssh.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.entity.Company;
import com.ssh.entity.Emergency;
import com.ssh.entity.ExcelFile;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Purchase;
import com.ssh.entity.Role;
import com.ssh.entity.Storehouse;
import com.ssh.util.ChooseFactory;
import com.ssh.util.ChooseRole;
import com.ssh.util.CreatExcel;
import com.ssh.util.GetDate;
@Controller
@Scope
public class ExcelAction extends BaseAction<ExcelFile> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	private static final Log log = LogFactory.getLog(ExcelAction.class);
	public String searchExcel(){
		System.out.println("企业信息----------------------");
		try {
			String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
			String company = (String) ActionContext.getContext().getSession().get("work");
			log.error(usernameS+"-查看采购信息");
			List<ExcelFile> list = excelFileService.search(page, rows,ChooseRole.chooseWorkAndKey(company));
			for(ExcelFile ex:list){
				ex.setEwork(ChooseFactory.chooseIdName(ex.getEwork()));
			}
			//System.out.println(list.get(5).getCaddress());
			response(list,excelFileService.searchAll(ChooseRole.chooseWorkAndKey(company)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/** 
     * 文件下载 
     * @return 
	 * @throws UnsupportedEncodingException 
     */  
    public String downloadFile() throws UnsupportedEncodingException {  
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");

    	String path = "C:\\Users\\Administrator\\Desktop\\";
        String downPath = "";  
        String fileName = "";
        String Cid = getRequest().getParameter("id");
//		String flax = getRequest().getParameter("flax");
       
        String url = new String(Cid.getBytes("iso-8859-1"),"utf-8");
		System.out.println(url);
		String[] str = url.split("/");
		for(int i = 0;i<str.length;i++){
			System.out.println(str[i]);
			path = path+str[2];
		}
		 log.error(usernameS+"-下载应急预案");
		downPath = Cid;
		
      

		System.out.println("路径："+url);
        HttpServletResponse response = ServletActionContext.getResponse();  
        try {  
            // path是指欲下载的文件的路径。  
            File file = new File(url);  
            // 取得文件名。  
            String filename = file.getName(); 
            // 以流的形式下载文件。  
            InputStream fis = new BufferedInputStream(new FileInputStream(url));  
            byte[] buffer = new byte[fis.available()];  
            System.out.println(buffer.length);
            fis.read(buffer);  
            fis.close();  
            // 清空response  
            response.reset();  
            // 设置response的Header  
            String filenameString = new String(filename.getBytes("gbk"),"iso-8859-1"); 
            System.out.println(filenameString);
            response.addHeader("Content-Disposition", "attachment;filename="+ filenameString);  
            response.addHeader("Content-Length", "" + file.length());  
            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());  
            response.setContentType("application/octet-stream");  
            toClient.write(buffer);  
            toClient.flush();  
            toClient.close();  
        } catch (IOException ex) {  
            ex.printStackTrace();  
        }  
        return null;  
    } 
    
    
    public String creatExcel() throws Exception{
    	String ework = getRequest().getParameter("ework");
    	String edate = getRequest().getParameter("edate");
    	String[] str = edate.split("-");
    	String date = "";
    	date =str[0]+"年"+str[1]+"月";    	
    	//System.out.println("ework:"+ework+" edate:------------"+GetDate.Formatdate(edate));
    	Role role = roleService.selectByName(ework);
    	Long id = role.getRid();
    	List<Storehouse> list = storagehouseService.selectExcel(date,String.valueOf(id));
    	CreatExcel.createExcel(list);
    	
		return SUCCESS;
    	
    }
	/*public String selectExcel(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String company = (String) ActionContext.getContext().getSession().get("work");

		log.error(usernameS+"-查询采购信息");	
		try {
			String psdate = getRequest().getParameter("psdate");
			String pedate = getRequest().getParameter("pedate");
			System.out.println("开始时间："+psdate+"结束时间"+pedate);
			String work="";
			if(company!=null){
				work = ChooseFactory.chooseNum(company);
				
			}
			
			List<Purchase> list = purchaseService.searchPc(page, rows,searchDate,ChooseRole.chooseWorkAndKey(company));
			for (Purchase purchase : list) {
				String i = purchase.getPcompany();
				purchase.setPcompany(ChooseFactory.chooseWork(i));
				String j = purchase.getPpoison();
				if(j.equals("1")){
					purchase.setPpoison("是");
				}else if(j.equals("0")){
					purchase.setPpoison("否");
				}
			}
			response(list,purchaseService.selectallPc(searchCon,searchType,ChooseRole.chooseWorkAndKey(company)));
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
	*/
	
	public String getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}


	private String searchDate;
	
}
