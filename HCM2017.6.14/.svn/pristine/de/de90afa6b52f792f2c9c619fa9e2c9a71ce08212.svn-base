package com.ssh.ecxel.model;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.entity.ExcelFile;
import com.ssh.entity.Storehouse;
import com.ssh.service.impl.CompanyServiceImpl;
import com.ssh.service.impl.ExcelFileServiceImpl;
import com.ssh.util.ChooseFactory;
import com.ssh.util.ChooseRole;
import com.ssh.util.GetDate;

import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class JtExcel {

    /*public static void main(String[] args) throws Exception {
        writeExcel();
    }
*/
    public static void writeExcelJT(Map<String,List<Storehouse>> map) throws Exception {
        // 第一步创建excel文件,并决定excel的路径和文件名
    	
    	String name = "D:/excel/城投水务（集团）有限公司-"+GetDate.Getdate()+".xls";
    	String Ename = "城投水务（集团）有限公司-"+GetDate.Getdate();//文件名
    	String sc = ID(map);
    	String Edate = GetDate.Getdate();
    	saveJT(Ename,sc,Edate,name);
    	String date = GetDate.Getdate();
        WritableWorkbook wwb = Workbook.createWorkbook(new File(name));

        // 第二部,创建工作簿,指定该工作簿的名称和位置'
        WritableSheet sheet = wwb.createSheet(GetDate.Getdate(), 0);

        // 第三部,设置表格指定列的列宽
        sheet.setColumnView(0, 14);
        sheet.setColumnView(1, 12);
        sheet.setColumnView(2, 25);
        sheet.setColumnView(3, 20);
        sheet.setColumnView(4, 12);
        sheet.setColumnView(5, 20);
        sheet.setColumnView(6, 20);
        sheet.setColumnView(7, 15);
        
        // 第四部,往工作簿中插入数据,设定字体:微软雅黑,24,加粗
        // 创建字体对象
        WritableFont bold = new WritableFont(WritableFont.ARIAL,10,WritableFont.BOLD);//设置字体种类和黑体显示,字体为Arial,字号大小为10,采用黑体显示
        WritableCellFormat titleFormate = new WritableCellFormat(bold);//生成一个单元格样式控制对象
        WritableFont titleFont = new WritableFont(WritableFont.createFont("微软雅黑"), 24, WritableFont.NO_BOLD);
        WritableFont contentFont = new WritableFont(WritableFont.createFont("楷体 _GB2312"), 12, WritableFont.NO_BOLD);
        WritableCellFormat titleFormat = new WritableCellFormat(titleFont);
        WritableCellFormat contentFormat = new WritableCellFormat(contentFont);
        WritableCellFormat contentFormat2 = new WritableCellFormat(contentFont);
        titleFormate.setAlignment(jxl.format.Alignment.CENTRE);//单元格中的内容水平方向居中
        titleFormate.setVerticalAlignment(jxl.format.VerticalAlignment.TOP);//单元格的内容垂直方向居中

        contentFormat.setBorder(Border.ALL, BorderLineStyle.THIN, Colour.BLACK);
        // 设置格式居中对齐
        titleFormat.setAlignment(jxl.format.Alignment.CENTRE);//设置水平居中
        contentFormat.setAlignment(jxl.format.Alignment.CENTRE);
        contentFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE );//设置垂直居中
        contentFormat2.setAlignment(jxl.format.Alignment.CENTRE);
        contentFormat2.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE );//设置垂直居中
        // 将定义好的单元格绑定数据添加到工作簿中
        sheet.mergeCells(0, 0, 7, 0); // 合并单元格A-h列共8列
        sheet.addCell(new Label(0, 0, "危险化学品月报表", titleFormat));
        sheet.addCell(new Label(0, 1, "填报单位", contentFormat2));
        sheet.mergeCells(1, 1, 3, 1); // 合并单元格B-G列共7列
        sheet.addCell(new Label(1, 1, "城投水务（集团）有限公司", contentFormat2));
        sheet.mergeCells(5, 1, 7, 1); // 合并单元格B-G列共7列
        sheet.addCell(new Label(4, 1, "填报日期", contentFormat2));
        sheet.addCell(new Label(5, 1, date, contentFormat2));
        sheet.mergeCells(0, 2, 7, 2); // 合并单元格A-h列共8列
        sheet.addCell(new Label(0, 2, "一、危险化学品余量", contentFormat2));
       
      
        String th[] = { "序号", "2015版序号", "类别", "品名", "上月余量", "本月购入量（产出）", "本月余量","备注" };
        for (int i = 0; i < th.length; i++) {
            sheet.addCell(new Label(i, 3, th[i], contentFormat2));
        }
        // 这里的数据可以从数据库里获取,个人建议将这些抽成共通的方法,提供导入数据,用时调用即可
        	 int k = 4;
        	 int j = 4;
        	 int a = 0;
        	 int i = 0;
        	 int m = 1;
        	 Storehouse sh = null;
        	 for(Map.Entry<String, List<Storehouse>> entry : map.entrySet()){
        		 List<Storehouse> list = entry.getValue();
        		 a += list.size();
        		 sheet.mergeCells(2, k, 2, list.size()+k-1); // 合并单元格  
        		 sheet.mergeCells(0, k, 0, list.size()+k-1); // 合并单元格
        		 //sheet.addCell(new Label(2, k, "填报单位", contentFormat2));
        		 sheet.addCell(new Label(0, k, String.valueOf(m), contentFormat2));
        		 m++;
        		 for (;j < a+4; j++) {//行  			        			
       				 sh = (Storehouse) list.get(i);  
            		 /*sheet.addCell(new Label(0, j,(sh.getSid()).toString(), contentFormat));//第一列第四行
*/                   sheet.addCell(new Label(1, j, sh.getSnum(), contentFormat));
                     sheet.addCell(new Label(2, j, sh.getStype(), contentFormat));
                     sheet.addCell(new Label(3, j, sh.getSname(), contentFormat));
                     sheet.addCell(new Label(4, j, sh.getSbeforeSurplus(), contentFormat));
                     sheet.addCell(new Label(5, j, sh.getSmonth(), contentFormat));
                     sheet.addCell(new Label(6, j, sh.getSall(), contentFormat));
                     sheet.addCell(new Label(7, j, sh.getSother(), contentFormat));
                     i++;
                     if(i>=list.size()){
                    	 i = 0;
                     }
     			}
     			    //System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue().size());
     				k = k+list.size();
     				//j = j+list.size();
     				//a +=list.size();
        	 }
        
        // 第五部,写入工作表完毕,关闭流
        wwb.write();
        wwb.close();
    }
    
    
    public static String Name(Map<String,List<Storehouse>> map){
    	String name = "";
    	 for(Map.Entry<String, List<Storehouse>> entry : map.entrySet()){
    		 List<Storehouse> list = entry.getValue();
    			 Storehouse sh = (Storehouse) list.get(0);  
   				 name = ChooseFactory.chooseIdName(sh.getSc()); 
   				break;
    	 }
    	 String str= name.trim();
		return str;
    	
    }
    public static String ID(Map<String,List<Storehouse>> map){
    	String id = "";
    	 for(Map.Entry<String, List<Storehouse>> entry : map.entrySet()){
    		 List<Storehouse> list = entry.getValue();
    		 for (int i = 0;i < list.size(); i++) {//行  			        			
    			 Storehouse sh = (Storehouse) list.get(i);  
   				 id = sh.getSc();        		
 			}
    	 }
		return id;	
    }
    public static void save(String Ename,String sc,String Edate,String url){
    	BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
    	ExcelFileServiceImpl excelFileServiceImpl = (ExcelFileServiceImpl) factory.getBean("excelFileServiceImpl");
    	List<ExcelFile> list = excelFileServiceImpl.searchByName(Ename);
    	if(list.size()==0){
    		ExcelFile  excelFile =new  ExcelFile();
        	Map<String,String> map = ChooseRole.chooseRole(sc);
    		if(map.get("jt")!=null){
    			excelFile.setJt(map.get("jt"));
    		}
    		if(map.get("zs")!=null){
    			excelFile.setZs(map.get("zs"));
    		}
    		if(map.get("sc")!=null){
    			excelFile.setSc(map.get("sc"));
    		}
    		excelFile.setEdate(Edate);
    		excelFile.setEname(Ename);
    		excelFile.setEurl(url);
    		excelFile.setEwork(sc);
    		excelFileServiceImpl.save(excelFile);
    	}
    	
		
    	
    }
    
    public static void saveJT(String Ename,String sc,String Edate,String url){
    	BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
    	ExcelFileServiceImpl excelFileServiceImpl = (ExcelFileServiceImpl) factory.getBean("excelFileServiceImpl");
    	List<ExcelFile> list = excelFileServiceImpl.searchByName(Ename);
    	if(list.size()==0){
    		ExcelFile  excelFile =new  ExcelFile();    	
        	excelFile.setJt("0");
    		excelFile.setEdate(Edate);
    		excelFile.setEname(Ename);
    		excelFile.setEurl(url);
    		excelFile.setEwork("0");
    		excelFileServiceImpl.save(excelFile);
    	}  	
    }
}