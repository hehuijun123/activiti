package com.ssh.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import com.ssh.entity.Role;
import com.ssh.entity.Temporary;
import com.ssh.entity.inf;
import com.ssh.entity.rulee;
import com.ssh.util.ChooseRole;
import com.ssh.util.GetDate;
@Controller
@Scope
public class EmergencyAction extends BaseAction<Emergency> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531851319630619325L;
	private static final Log log = LogFactory.getLog(EmergencyAction.class);
	/*public String selectEmergency(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String company = (String) ActionContext.getContext().getSession().get("work");

		log.error(usernameS+"-查询应急方案");
//		String flax = getRequest().getParameter("flax");
//		System.out.println(flax);
		try {
			List<Emergency> list = emergencyService.search(page, rows,flax,ChooseRole.chooseWorkAndKey(company));
			//System.out.println(list.get(5).getCaddress());
			response(list,emergencyService.selectall(ChooseRole.chooseWorkAndKey(company)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}*/
	
	public String selectEmergency(){
		String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
		String company = (String) ActionContext.getContext().getSession().get("work");
		String role = (String) ActionContext.getContext().getSession().get("role");
		log.error(usernameS+"-查询应急方案");
//		String flax = getRequest().getParameter("flax");
		System.out.println(role+company);
		try {
			List<Emergency> list = emergencyService.search(page, rows,role,company);
			//System.out.println(list.get(5).getCaddress());
			response(list,emergencyService.selectall(ChooseRole.chooseWorkAndKey(company)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public  String groupCompany(){	
		String id = getRequest().getParameter("id");
		try {
			List<Emergency> list = emergencyService.selectyj(id);
			//System.out.println(list.get(5).getCaddress());
			response(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public  String jt(){	
		List<Emergency> list = emergencyService.selectjt();
		//System.out.println(list.get(5).getCaddress());
		response(list);
		return null;
		
	}
	public  String zs(){
		System.out.println("zs");

		List<String> list = emergencyService.selectzs();
		List<Role> role = roleService.select();
		List<inf> inflist = new ArrayList<>();
		
		for (String purchase : list) {
			inf i = new inf();
			 Role roles = role.get(Integer.parseInt(purchase));
			 i.setName((role.get(Integer.parseInt(purchase))).getName());
			 i.setId(purchase);
			 inflist.add(i);
		}
		//System.out.println(list.get(5).getCaddress());
		response(inflist);
		return null;
		
	}
	
	public  String sc(){
		String id = getRequest().getParameter("id");
		System.out.println("s"+id);

		List<String> list = emergencyService.selectsc(id);
		List<Role> role = roleService.select();
		List<inf> inflist = new ArrayList<>();
		
		for (String purchase : list) {
			inf i = new inf();
			 Role roles = role.get(Integer.parseInt(purchase));
			 i.setName((role.get(Integer.parseInt(purchase))).getName());
			 i.setId(purchase);
			 inflist.add(i);
		}
		//System.out.println(list.get(5).getCaddress());
		response(inflist);
		return null;
		
	}
	
	//保存
	public String saveCompany(){
		
		String Cid = getRequest().getParameter("id");
		if(Cid!=null&&!"".equals(Cid)){
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
	public String deleteEmergency(){
		String Cid = getRequest().getParameter("id");
		Long cid = Long.parseLong(Cid);
		emergencyService.delete(cid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "ok");
		response(map);
		return null;
	}
	
	//删除
		public String deleteEmergencyRule(){
			String Cid = getRequest().getParameter("id");
			
			Long cid = Long.parseLong(Cid);
			System.out.println("sfsda:"+cid);
			emergencyService.deleteRule(Long.valueOf(cid));
			Map<String, String> map = new HashMap<String, String>();
			map.put("success", "ok");
			response(map);
			return null;
		}
	
	
	//添加文件
		public String addFile(){
			String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
			
			log.error(usernameS+"-删除用户");
			String path = "E:\\文件\\"; 
			String realpath = ServletActionContext.getServletContext().getRealPath("/upload") ;//获取服务器路径
			String username = (String) ActionContext.getContext().getSession().get("loginName");//上传人
			String work = (String) ActionContext.getContext().getSession().get("work");//工作单位
			Map<String,String> map = ChooseRole.chooseRole(work);

			//			String flax = getRequest().getParameter("flax");
//			System.out.println(flax);
			Emergency emergency = new Emergency();
			emergency.setEdate(GetDate.Getdate());
			emergency.setEperson(username);
			emergency.setEwork(work);
			String savePath = "";
	        File file = new File(path); // 判断文件夹是否存在,如果不存在则创建文件夹  
	        if (!file.exists()) {  
	            file.mkdir();  
	        }  
	        try {  
	        	System.out.println(this.file != null);
	            if (this.file != null) {  
	                File f[] = this.getFile(); 
	                filePath = new String[f.length];  
	                for (int i = 0; i < f.length; i++) {  
	                    String fileName = java.util.UUID.randomUUID().toString(); // 采用时间+UUID的方式随即命名  
	                    //String name =fileFileName[i].substring(fileFileName[i].l)+fileFileName[i].substring(fileFileName[i].lastIndexOf(".")); //保存在硬盘中的文件名  
	                    String name = fileFileName[i];
	                    System.out.println(fileFileName[i]);
	                    savePath =name;
	                    
	                    FileInputStream inputStream = new FileInputStream(f[i]);  
	                    FileOutputStream outputStream = new FileOutputStream(path+ "\\" + name);
	                    FileOutputStream outputStream1 = new FileOutputStream(realpath+ "\\" + name);
	                    byte[] buf = new byte[1024];  
	                    int length = 0;  
	                    while ((length = inputStream.read(buf)) != -1) {  
	                        outputStream.write(buf, 0, length);  
	                        outputStream1.write(buf, 0, length);
	                    }  
	                   
	                    inputStream.close();  
	                    outputStream.flush();  
	                    //文件保存的完整路径  
	                    // 如：D:\tomcat6\webapps\struts_ajaxfileupload\\upload\a0be14a1-f99e-4239-b54c-b37c3083134a.png  
	                    filePath[i] = path + "\\" + name; 
	                    System.out.println("文件路径："+filePath[0]);
	                }  
	  
	            }  
	            if(flax.equals("1")){
	            	log.error(usernameS+"-添加应急预案");
	            	emergency.setEscheme(savePath);	            	
	            }
	            if(flax.equals("2")){
	            	log.error(usernameS+"-添加企业平面图");
	            	emergency.setEpicture(savePath);	            	
	            }
	            if(flax.equals("3")){
	            	log.error(usernameS+"-添加技术说明");
	            	emergency.setEinstructions(savePath);       	
	            }
	            if(map.get("jt")!=null){
	            	emergency.setJt(map.get("jt"));
				}
				if(map.get("zs")!=null){
					emergency.setZs(map.get("zs"));
				}
				if(map.get("sc")!=null){
					emergency.setSc(map.get("sc"));
				}
	            emergencyService.save(emergency);
	            response("ok");
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return SUCCESS;  
			
		}
		
		
		//添加文件
				public String addFileRule(){
					String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
					
					log.error(usernameS+"-删除用户");
					String path = "E:\\文件\\"; 
					String realpath = ServletActionContext.getServletContext().getRealPath("/upload") ;//获取服务器路径
					System.out.println(realpath);
					String username = (String) ActionContext.getContext().getSession().get("loginName");//上传人
					String work = (String) ActionContext.getContext().getSession().get("work");//工作单位
					Map<String,String> map = ChooseRole.chooseRole(work);

					//			String flax = getRequest().getParameter("flax");
//					System.out.println(flax);
					rulee rule = new rulee();
					rule.setRdate(GetDate.Getdate());
					rule.setRperson(username);
					
					String savePath = "";
			        File file = new File(path); // 判断文件夹是否存在,如果不存在则创建文件夹  
			        if (!file.exists()) {  
			            file.mkdir();  
			        }  
			        try {  
			        	System.out.println(this.file != null);
			            if (this.file != null) {  
			                File f[] = this.getFile(); 
			                filePath = new String[f.length];  
			                for (int i = 0; i < f.length; i++) {  
			                    String fileName = java.util.UUID.randomUUID().toString(); // 采用时间+UUID的方式随即命名  
			                    //String name =fileFileName[i].substring(fileFileName[i].l)+fileFileName[i].substring(fileFileName[i].lastIndexOf(".")); //保存在硬盘中的文件名  
			                    String name = fileFileName[i];
			                    System.out.println(fileFileName[i]);
			                    savePath =name;
			                    
			                    FileInputStream inputStream = new FileInputStream(f[i]);  
			                    FileOutputStream outputStream = new FileOutputStream(path+ "\\" + name);
			                    FileOutputStream outputStream1 = new FileOutputStream(realpath+ "\\" + name);
			                    byte[] buf = new byte[1024];  
			                    int length = 0;  
			                    while ((length = inputStream.read(buf)) != -1) {  
			                        outputStream.write(buf, 0, length);  
			                        outputStream1.write(buf, 0, length);
			                    }  
			                   
			                    inputStream.close();  
			                    outputStream.flush();  
			                    //文件保存的完整路径  
			                    // 如：D:\tomcat6\webapps\struts_ajaxfileupload\\upload\a0be14a1-f99e-4239-b54c-b37c3083134a.png  
			                    filePath[i] = path + "\\" + name; 
			                    System.out.println("文件路径："+filePath[0]);
			                }  
			  
			            }  
			          rule.setRname(savePath);
			            emergencyService.saveRule(rule);
			            response("ok");
			        } catch (Exception e) {  
			            e.printStackTrace();  
			        }  
			        return SUCCESS;  
					
				}
		/** 
	     * 文件下载 
	     * @return 
	     */  
	    public String downloadFile() {  
			String usernameS = (String) ActionContext.getContext().getSession().get("loginName");

	    	String path = "E:\\文件\\";
	        String downPath = "";  
	        String fileName = "";
	        String Cid = getRequest().getParameter("id");
//			String flax = getRequest().getParameter("flax");
			System.out.println("Cid:   "+Cid+"   flax:   "+flax);
			Long cid = Long.parseLong(Cid);
			Emergency emergency = emergencyService.select(cid);
			 if(flax.equals("1")){
				 log.error(usernameS+"-下载应急预案");
				 downPath = path+emergency.getEscheme();
				 fileName = emergency.getEscheme();
	            }
	            if(flax.equals("2")){
					 log.error(usernameS+"-下载企业平面图");

	            	downPath =path+emergency.getEpicture();	   
	            	 fileName =emergency.getEpicture();
	            }
	            if(flax.equals("3")){
					 log.error(usernameS+"-下载技术说明");

	            	downPath = path+emergency.getEinstructions();
	            	 fileName =emergency.getEinstructions();
	            }
			System.out.println("路径："+downPath);
	        HttpServletResponse response = ServletActionContext.getResponse();  
	        try {  
	            // path是指欲下载的文件的路径。  
	            File file = new File(downPath);  
	            // 取得文件名。  
	            String filename = file.getName(); 
	            System.out.println("filename:"+filename);
	            // 以流的形式下载文件。  
	            InputStream fis = new BufferedInputStream(new FileInputStream(downPath));  
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
	    
	    /** 
	     * 文件下载 
	     * @return 
	     */  
	    public String downloadFileRule() {  
			String usernameS = (String) ActionContext.getContext().getSession().get("loginName");

	    	String path = "E:\\文件\\";
	        String downPath = "";  
	        String fileName = "";
	        String Cid = getRequest().getParameter("id");
//			String flax = getRequest().getParameter("flax");
			System.out.println("Cid:   "+Cid+"   flax:   "+flax);
			Long cid = Long.parseLong(Cid);
			rulee emergency = emergencyService.selectRule(cid);
			
			log.error(usernameS+"-下载法律法规");
			downPath = path+emergency.getRname();
			fileName = emergency.getRname();
			System.out.println("路径："+downPath);
	        HttpServletResponse response = ServletActionContext.getResponse();  
	        try {  
	            // path是指欲下载的文件的路径。  
	            File file = new File(downPath);  
	            // 取得文件名。  
	            String filename = file.getName(); 
	            System.out.println("filename:"+filename);
	            // 以流的形式下载文件。  
	            InputStream fis = new BufferedInputStream(new FileInputStream(downPath));  
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
	    
	    
	    public String selectRule(){
			String usernameS = (String) ActionContext.getContext().getSession().get("loginName");
			String company = (String) ActionContext.getContext().getSession().get("work");

			log.error(usernameS+"-查询应急方案");
//			String flax = getRequest().getParameter("flax");
//			System.out.println(flax);
			try {
				List<rulee> list = emergencyService.searchRule(page, rows);
				//System.out.println(list.get(5).getCaddress());
				response(list,emergencyService.selectallRule());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
	private File[] file;              //文件    
    private String[] fileFileName;    //文件名     
    private String[] filePath;        //文件路径  
    
    private String flax;
    
    
    public String getFlax() {
		return flax;
	}

	public void setFlax(String flax) {
		this.flax = flax;
	}

	public File[] getFile() {
		return file;
	}

	public void setFile(File[] file) {
		this.file = file;
	}

	public String[] getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String[] fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String[] getFilePath() {
		return filePath;
	}

	public void setFilePath(String[] filePath) {
		this.filePath = filePath;
	}

	public String getDownloadFilePath() {
		return downloadFilePath;
	}

	public void setDownloadFilePath(String downloadFilePath) {
		this.downloadFilePath = downloadFilePath;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	private String downloadFilePath;  //文件下载路径  
    private InputStream inputStream;

}
