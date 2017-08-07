package com.ssh.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.HazardousChemicalsDaoImpl;
import com.ssh.dao.impl.PurchaseDaoImpl;
import com.ssh.dao.impl.StoragehouseDaoImpl;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Purchase;
import com.ssh.entity.Storehouse;
import com.ssh.entity.Temporary;
import com.ssh.entity.ZS;
import com.ssh.service.PurchaseService;
import com.ssh.service.storagehouseService;
import com.ssh.util.DoSum;
@Transactional
@Service
public class StoragehouseServiceImpl implements storagehouseService {

	@Resource
	StoragehouseDaoImpl storageHouseDao;
	@Resource
	HazardousChemicalsDaoImpl hazardousChemicalsDaoImpl;
	@Override
	public List<Storehouse> search(String page, String rows) {
		// TODO Auto-generated method stub
		return storageHouseDao.select(page, rows);
	}

	@Override
	public void save(Storehouse purchase) {
		// TODO Auto-generated method stub
		storageHouseDao.save(purchase);
	}

	@Override
	public void update(Storehouse purchase) {
		// TODO Auto-generated method stub
		storageHouseDao.update(purchase);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		storageHouseDao.delete(id);

	}

	@Override
	public Storehouse select(Long id) {
		// TODO Auto-generated method stub
		return storageHouseDao.getById(id);
	}

	@Override
	public int selectall() {
		// TODO Auto-generated method stub
		return storageHouseDao.selectall();
	}

	@Override
	public List<Storehouse> searchPc(String page, String rows, String psdate, String searchCp,String work) {
		// TODO Auto-generated method stub
		System.out.println("searchPc----------------------");
		//List<HazardousChemicals> listHc = hazardousChemicalsDaoImpl.selectWork(work);//根据工厂查询危化品表
		List<Storehouse> listSh = storageHouseDao.searchPc(page, rows, psdate,searchCp,work);	//查询库存表
		List<Storehouse> listsh = new ArrayList<>();
		/*for(int i = 0;i<listHc.size();i++){
			HazardousChemicals hc = listHc.get(i);
			String Hname = hc.getName();
			System.out.println("危化品："+Hname);
			for(int j = 0;j<listSh.size();j++){
				Storehouse storehouse = listSh.get(j);
				String Sname = storehouse.getSname();
				System.out.println("库存："+Sname);
				if(Hname!=null&&!"".equals(Hname)
						&&Sname!=null&&!"".equals(Sname)
						&&Hname.equals(Sname)){
						storehouse.setSpoint(ChooseWork.chooseWork(hc, work));	
						storehouse.setSimg(ChooseWork.chooseImg(hc, work));					
							System.out.println("k:"+j);
							listsh.add(storehouse);	
						
				}
			}
		}*/

		System.out.println("searchPc---------");
		
		return listSh;
	}

	@Override
	public int selectallPc(String psdate,String searchCp,String work) {
		// TODO Auto-generated method stub
		return storageHouseDao.selectallPc(psdate,searchCp,work);
	}
	
	@Override
	public List<Temporary> searchAllPc(String page, String rows, String psdate,Map map,String searchCp) {
		// TODO Auto-generated method stub
		//List<HazardousChemicals> listHc = hazardousChemicalsDaoImpl.selectWork(searchCp);//根据工厂查询危化品表
		storageHouseDao.deleteTemporaty();
		List<Storehouse> list = DoSum.sum(storageHouseDao.searchAdminPc(page, rows, psdate, map,searchCp));
		for(Storehouse s:list){
			Temporary tp = new Temporary();
			//使用量=总量-本月购入量-上月剩余量；
			String all = s.getSall_();
			String sm = s.getSmonth_();
			String b = s.getSbeforeSurplus_();
			String app = "";
			if(all!=null&&!all.equals("")&&sm!=null&&!sm.equals("")&&b!=null&&!b.equals("")){
				double sb  = java.lang.Math.abs(Double.parseDouble(all)-Double.parseDouble(sm)-Double.parseDouble(b));
				app = String.valueOf(DoSum.formatDouble4(sb));
			}
			tp.setSid(s.getSid());
			tp.setSapply(app);
			tp.setSbeforeSurplus(s.getSbeforeSurplus_());
			tp.setSdate(s.getSdate());
			tp.setSmonth(s.getSmonth_());
			tp.setSall(s.getSall_());
			tp.setSname(s.getSname());
			tp.setSnum(s.getSnum());
			tp.setSother(s.getSother());
			tp.setSpoint(s.getSpoint());
			tp.setSposition(s.getSposition());
			tp.setSsurplus(s.getSsurplus());
			tp.setStotal(s.getStotal());
			tp.setStype(s.getStype());
			tp.setSimg(s.getSimg());
			tp.setSunit(s.getSunit());
			tp.setJt(s.getJt());
			tp.setSc(s.getSc());
			tp.setZs(s.getZs());
			tp.setSwork(s.getSwork());
			
			storageHouseDao.saveTempory(tp);
		}
		return selectTempory(page,rows);
	}
	
	@Override
	public List<ZS> searchAllZS(String page, String rows, String psdate,Map map,String searchCp) {
		// TODO Auto-generated method stub
		//List<HazardousChemicals> listHc = hazardousChemicalsDaoImpl.selectWork(searchCp);//根据工厂查询危化品表
		List<String> ls = storageHouseDao.selectSizeZS();
		List<ZS> lzs = new ArrayList<>();
		map.put("key", "zs");
		for(String sy:ls){
			map.put("value", sy);
			//查询出该危化物所属的制水公司的数据
			List<Storehouse> list = DoSum.sum(storageHouseDao.searchAdminPc(page, rows, psdate, map,searchCp));	
			if(list.size()!=0){
				Storehouse s = list.get(0);
				ZS tp = new ZS();
				//使用量=总量-本月购入量-上月剩余量；
				String all = s.getSall_();
				String sm = s.getSmonth_();
				String b = s.getSbeforeSurplus_();
				String app = "";
				if(all!=null&&!all.equals("")&&sm!=null&&!sm.equals("")&&b!=null&&!b.equals("")){
					double sb  = java.lang.Math.abs(Double.parseDouble(all)-Double.parseDouble(sm)-Double.parseDouble(b));
					app = String.valueOf(DoSum.formatDouble4(sb));
				}
				tp.setSid(s.getSid());
				tp.setSapply(app);
				tp.setSbeforeSurplus(s.getSbeforeSurplus_());
				tp.setSdate(s.getSdate());
				tp.setSmonth(s.getSmonth_());
				tp.setSall(s.getSall_());
				tp.setSname(s.getSname());
				tp.setSnum(s.getSnum());
				tp.setSother(s.getSother());
				tp.setSpoint(s.getSpoint());
				tp.setSposition(s.getSposition());
				tp.setSsurplus(s.getSsurplus());
				tp.setStotal(s.getStotal());
				tp.setStype(s.getStype());
				tp.setSimg(s.getSimg());
				tp.setSunit(s.getSunit());
				tp.setJt(s.getJt());
				tp.setSc(s.getSc());
				tp.setZs(s.getZs());
				tp.setSwork(s.getSwork());
				lzs.add(tp);
			}	
		}
		return lzs;
	}
	public List<Temporary> selectTempory(String page, String rows){
		return storageHouseDao.searchTempory(page,rows);
		
	}

	@Override
	public int selectAllPc(String psdate, Map map,String searchCp) {
		// TODO Auto-generated method stub
		return storageHouseDao.selectallTempory(psdate, map,searchCp);
	}

	@Override
	public List<Storehouse> searchExcel(String str) {
		// TODO Auto-generated method stub
		//List<HazardousChemicals> listHc = hazardousChemicalsDaoImpl.selectWork(searchCp);//根据工厂查询危化品表
		return storageHouseDao.selectExcel(str);
	}
	
	@Override
	public List<Storehouse> searchExcelByJt(String str,String date) {
		// TODO Auto-generated method stub
		//List<HazardousChemicals> listHc = hazardousChemicalsDaoImpl.selectWork(searchCp);//根据工厂查询危化品表
		return storageHouseDao.selectExcelByName(str,date);
	}
	@Override
	public List selectSize() {
		// TODO Auto-generated method stub
		//List<HazardousChemicals> listHc = hazardousChemicalsDaoImpl.selectWork(searchCp);//根据工厂查询危化品表
		return storageHouseDao.selectSize();
	}
	
	@Override
	public List selectSizeByName() {
		// TODO Auto-generated method stub
		//List<HazardousChemicals> listHc = hazardousChemicalsDaoImpl.selectWork(searchCp);//根据工厂查询危化品表
		return storageHouseDao.selectSizeByName();
	}
	
	@Override
	public List<Storehouse> selectExcel(String date,String work) {
		// TODO Auto-generated method stub
		//List<HazardousChemicals> listHc = hazardousChemicalsDaoImpl.selectWork(searchCp);//根据工厂查询危化品表
		System.out.println("----ssaa");
		return storageHouseDao.searchExcel(date,work);
	}

	@Override
	public List<Storehouse> searchExcelByJtAndWork(String str) {
		// TODO Auto-generated method stub
		return storageHouseDao.selectExcelByNameAndWork(str);
	}

	@Override
	public List<Storehouse> selectDetail(String name, String date, String work,String flax) {
		// TODO Auto-generated method stub
		List<Storehouse> list = null;
		if(flax.equals("zs")){
			list = storageHouseDao.selectdetailZS(name, date, work);
			
		}
		if(flax.equals("jt")){
			list = storageHouseDao.selectdetailJT(name, date, work);
			
		}
		return list;
	}
	
	@Override
	public List<Storehouse> searchOrder() {
		// TODO Auto-generated method stub
		return storageHouseDao.searchOrder();
	}
	

}
