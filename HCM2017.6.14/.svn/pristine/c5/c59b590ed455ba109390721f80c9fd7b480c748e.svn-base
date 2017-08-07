package com.ssh.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.HazardousChemicalsDaoImpl;
import com.ssh.dao.impl.PositionDaoImpl;
import com.ssh.dao.impl.PurchaseDaoImpl;
import com.ssh.dao.impl.StoragehouseDaoImpl;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Purchase;
import com.ssh.entity.Storehouse;
import com.ssh.service.PurchaseService;
import com.ssh.util.ChooseRole;
import com.ssh.util.GetDate;
@Transactional
@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Resource
	PurchaseDaoImpl purchaseDao;
	@Resource
	StoragehouseDaoImpl storagehouseDaoImpl;
	@Resource
	PositionDaoImpl positionDaoImpl;
	@Resource
	HazardousChemicalsDaoImpl hazardousChemicalsDaoImpl;
	@Override
	public List<Purchase> search(String page, String rows,String work) {
		// TODO Auto-generated method stub
		return purchaseDao.select(page, rows,work);
	}
	/**
	 * 采购
	 * 思路：查询采购危化品的名称，查出编码，通过危化品名称查询库存表，当库存表中已经存在该危化物（必须危化物名称存在且对应的工厂的编号也一致，才可以），
	 * 更新库存表中危化物的量。不存在的条件：危化物名称不存在或危化物名称存在，但是对应的工厂编码不存在
	 * 
	 * 	1危化物名称，单位，月份,单位，使用场合相同
	 *	危化物已经存在，直接添加数量
	 *	2危化物名称，单位存在，月份不同
	 *	不同月份采购的危化物，需要保存为新的记录
	 *	3危化物名称不存在
	 *	添加新纪录
	 *	4危化物名称存在，单位不存在
	 *	添加新纪录
	 *  5危化物名称，单位，月份都不存在
	 *  添加新纪录
	 *  6
	 */
	@Override
	public void save(Purchase purchase,String work) {
		// TODO Auto-generated method stub
		purchaseDao.save(purchase);
		
		String pname = purchase.getPname();	//危化物名称
		//String pcompany = purchase.getPcompany();	//单位
		//String ptype = purchase.getPdensity();	//
		String pnum = purchase.getPnum();	//数量
		//String pposition = purchase.getPposition();	//库位
		String punit = purchase.getPunit();//取得单位
		String pother = purchase.getPother();//使用途径
		String ptype = purchase.getPtype();//使用途径
		String position = purchase.getPposition();
		String hazcoding = ""; //危化物编码
		HazardousChemicals hazardousChemicals = hazardousChemicalsDaoImpl.selectHCByName(pname); //根据危化物名称查询出危化物
		Storehouse storHouse = new Storehouse();
		if(hazardousChemicals!=null){
			hazcoding = hazardousChemicals.getHnum();//得到危化物编码	
		}
		Storehouse storehouse = storagehouseDaoImpl.selectSHByName(purchase.getPname(),work,GetDate.Getdate(),pother);
		
		//1危化物名称，单位，月份相同
		if(storehouse!=null){
			int Snum = Integer.parseInt(storehouse.getSmonth()); //取的当前危化物的当月购入量
			int Pnum = Integer.parseInt(pnum);//取得当前采购的危化物的数量
			int Stotal = Integer.parseInt(storehouse.getStotal());//取得该危化物的当前库存总量
			int Sall = Integer.parseInt(storehouse.getSall());//取得该危化物的库存总量
			int SPnum = Snum+Pnum;	//当月购入量
			int SPtotal = Pnum + Stotal;//当月库存总量 = 库存量+采购数量
			int SPall = Sall+Pnum;//危化物总量=危化物库存当前数量+采购量
			String spNum = String.valueOf(SPnum);
			String spTotal = String.valueOf(SPtotal);
			String spAll = String.valueOf(SPall);
			System.out.println("数----------量："+spNum);
			storehouse.setSmonth(spNum);
			storehouse.setStotal(spTotal);
			storehouse.setSall(spAll);
			storagehouseDaoImpl.update(storehouse);	
		//添加新纪录
		}else{
			int Stotal = 0;
			int Sbefor = 0;
			Storehouse storehouseBefor = storagehouseDaoImpl.selectSHByName(purchase.getPname(),work,GetDate.GetBefordate(),pother);
			if(storehouseBefor!=null){//库存量=上月剩余量+采购量
				Stotal = Integer.parseInt(storehouseBefor.getStotal());//取得该危化物的上月总量
				Sbefor = Integer.parseInt(storehouseBefor.getSall());//取得该危化物的上月库存量
			}else{
				Sbefor = 0;
			}
			int Pnum = Integer.parseInt(pnum);//取得当前采购的危化物的数量
			int stotal = Pnum+Sbefor;//危化物的库存总量
			String spTotal = String.valueOf(stotal);
			String spBefor = String.valueOf(Sbefor);
			storHouse.setSname(pname);	//危化物名称 
			storHouse.setSnum(hazcoding);	//危化物编码
			storHouse.setSmonth(pnum);	//危化物数量
			storHouse.setSdate(GetDate.Getdate());	//月份
			System.out.println("position:----------------------"+position);
			storHouse.setSpoint(position);	//库位
			storHouse.setSbeforeSurplus(spBefor);
			storHouse.setSwork(work);	//工作单位
			storHouse.setStype(ptype);
			storHouse.setSimg((positionDaoImpl.selectByImage(purchase.getPcompany())).getIimage());
			Map<String,String> map = ChooseRole.chooseRole(work);
			if(map.get("jt")!=null){
				storHouse.setJt(map.get("jt"));
			}
			if(map.get("zs")!=null){
				storHouse.setZs(map.get("zs"));
			}
			if(map.get("sc")!=null){
				storHouse.setSc(map.get("sc"));
			}
			storHouse.setStotal(pnum);  //当月库存总量 	
			storHouse.setSall(spTotal);//当前危化物总量
			storHouse.setSunit(punit);//使用计量单位
			storHouse.setSother(pother);//使用场合
			storagehouseDaoImpl.save(storHouse);	
		}	
	}

	@Override
	public void update(Purchase purchase) {
		// TODO Auto-generated method stub
		System.out.println("更新");
		purchaseDao.update(purchase);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		purchaseDao.delete(id);
	}

	@Override
	public Purchase select(Long id) {
		// TODO Auto-generated method stub
		return purchaseDao.getById(id);
	}

	@Override
	public int selectall(String work) {
		// TODO Auto-generated method stub
		return purchaseDao.selectall(work);
	}

	@Override
	public List<Purchase> searchPc(String page, String rows, String psdate, String pedate,Map map) {
		// TODO Auto-generated method stub
		return purchaseDao.searchPc(page, rows, psdate, pedate,map);
	}
	
	
	@Override
	public int selectallPc(String psdate, String pedate,Map map) {
		// TODO Auto-generated method stub
		return purchaseDao.selectallPc(psdate, pedate,map);
	}
	
	//每次记录采购信息时同时将库位信息添加到库存表中
	/*public void addStorehouse(Purchase purchase,String work){
		String pname = purchase.getPname();	//危化物名称
		//String pcompany = purchase.getPcompany();	//单位
		//String ptype = purchase.getPdensity();	//
		String pnum = purchase.getPnum();	//数量
		String pposition = purchase.getPposition();	//库位
		String hazcoding = ""; //危化物编码
		
		if()
		
	}*/
	@Override
	public List<Purchase> selectOrder(){
		return purchaseDao.selectOrder();
	}


}
