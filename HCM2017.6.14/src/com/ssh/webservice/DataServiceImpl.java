package com.ssh.webservice;


import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.ssh.dao.impl.HazardousChemicalsDaoImpl;
import com.ssh.dao.impl.PositionDaoImpl;
import com.ssh.dao.impl.RoleDaoImpl;
import com.ssh.dao.impl.StorageDaoImpl;
import com.ssh.dao.impl.StoragehouseDaoImpl;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Image;
import com.ssh.entity.Position;
import com.ssh.entity.Role;
import com.ssh.entity.Storage;
import com.ssh.entity.Storehouse;
import com.ssh.util.GetDate;

@WebService(endpointInterface="com.ssh.webservice.DataService")
@Service
@Transactional
public class DataServiceImpl implements DataService{
	
	private static Logger log = Logger.getLogger(DataServiceImpl.class); 
	@Resource
	private StorageDaoImpl storageDaoImpl;
	@Resource
	private StoragehouseDaoImpl storagehouseDaoImpl;
	@Resource
	private HazardousChemicalsDaoImpl hazardousChemicalsDaoImpl;
	@Resource
	private PositionDaoImpl positionDaoImpl;
	@Resource
	private RoleDaoImpl roleDaoImpl;
	@Override
	public String toData(String json) {
		log.error("json数据格式 "+json);
		List<Storage> list = JSON.parseArray(json, Storage.class);
		log.error("大小："+list.size());
		for(int i = 0;i<list.size();i++){
			Storage storage = list.get(i);			
			//storage.setScompany("五");
			log.error(storage.toString());
			storageDaoImpl.save(storage);
			String snum = storage.getSnum();//危化物编码
			String month = storage.getSmonth();//本月购入量或本月使用量（正负）
			String surplus = storage.getSsurplus();//本月剩余量
			String other = storage.getSother();//适用场合
			String sother = "";
			if(other.equals("1")){
				sother = "消化产出";
			}
			if(other.equals("2")){
				sother = "实验室";
			}
			if(other.equals("3")){
				sother = "生产用途";
			}
			//String sposition = storage.getSposition();//库位
			HazardousChemicals hazardfousChemicals = hazardousChemicalsDaoImpl.selectHCByNum(snum);//通过危化物编码查询危化物
			Position position = positionDaoImpl.selectByNum("7");
			Role role = roleDaoImpl.selectById(Long.valueOf("15"));
			Image image = positionDaoImpl.selectByImage("7");
			String simg = image.getIimage();//库位图
			String sname = hazardfousChemicals.getName();//危化物名称
			String stype = hazardfousChemicals.getHtype();//危化物类型
			String sunit = hazardfousChemicals.getHunit();//危化物计量单位
			String sdate =  GetDate.Getdate();//月份
			String jt = "1";//集团
			String sc = "15";//水厂
			String zs = role.getParents();//制水公司
			String smonth = "";//本月购入量
			String sapply = "";//本月使用量
			String swork = "15";
			double number = Double.valueOf(month);
			Storehouse storehouse = new Storehouse();
			if(number<0){
				sapply =String.valueOf(java.lang.Math.abs(number));
				storehouse.setSapply(sapply);
			}
			if(number>=0){
				smonth = String.valueOf(java.lang.Math.abs(number));
				storehouse.setSmonth(smonth);

			}
			
			System.out.println("sapply----"+storehouse.getSapply());
			//上月剩余量，本月购入量，当月总量，库存总量，编号，适用场合，月份，工作单位，名称，危化物类型，图片，热点，单位，集团，制水，水厂
			//上月剩余量，本月购入量，当月总量，库存总量
			//通过接口传过来的值：本月购入量（当数字为正时为采购，负值为使用），本月剩余量
			storehouse.setSnum(snum);
			storehouse.setSother(sother);
			storehouse.setSdate(sdate);
			storehouse.setSwork(swork);
			storehouse.setSname(sname);
			storehouse.setStype(stype);
			storehouse.setSimg(simg);
			storehouse.setSunit(sunit);
			storehouse.setJt(jt);
			storehouse.setZs(zs);
			storehouse.setSc(sc);
			storagehouseDaoImpl.save(storehouse);
			
			
			/*if(scoding!=null&&!"".equals(scoding)){
				Storage st = storageDaoImpl.searchBySnum(scoding);
				if(st!=null){
					st.setSmonth(smonth);
					st.setSsurplus(ssurplus);
					storageDaoImpl.update(st);
				}else{
					storageDaoImpl.save(storage);
				}
			}
			storage.setScoding();*/	
		}
		return "success";		
	}
}
