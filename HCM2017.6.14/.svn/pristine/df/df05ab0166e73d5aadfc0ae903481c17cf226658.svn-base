package com.ssh.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.PurposeDaoImpl;
import com.ssh.dao.impl.StoragehouseDaoImpl;
import com.ssh.entity.Purchase;
import com.ssh.entity.Purpose;
import com.ssh.entity.Storehouse;
import com.ssh.service.PurposeService;
import com.ssh.util.GetDate;
@Transactional
@Service
public class PurposeServiceImpl implements PurposeService {
	@Resource
	private PurposeDaoImpl purposeDaoImpl;
	@Resource
	StoragehouseDaoImpl storagehouseDaoImpl;
	@Override
	public List<Purpose> search(String page, String rows,String work) {
		// TODO Auto-generated method stub
		return purposeDaoImpl.select(page, rows,work);	
	}
	/**
	 * 关于使用（出库）
	 *1添加之前需要先查询仓库中是否有存货
	 *2每次添加使用记录的时候需要同步到库存表中
	 *3根据危化物名称，工作单位，当月的月份查询出仓库中的记录
	 *对于出库操作，库存表只存在更新操作
	 */
	@Override
	public void save(Purpose purpose,String work) {
		// TODO Auto-generated method stub
		System.out.println("----------zcm");
		purposeDaoImpl.save(purpose);
		//获取库存中的
		Storehouse storehouse = storagehouseDaoImpl.selectSHByName(purpose.getPname(),work,GetDate.Getdate(),purpose.getPother());
		if(storehouse!=null){
			int Pnum = Integer.valueOf(purpose.getPnum());//取得使用数量
			
			if(storehouse.getSall()!=null){
				int Snum = Integer.valueOf(storehouse.getStotal());//取得库存中的危化品的当月总量
				int Sallnum = Integer.valueOf(storehouse.getSall());//取得库存中的危化品的总量
				int SPnum = Snum - Pnum;//当月库存总量
				int SAllnum = Sallnum - Pnum;//危化品库存总量
				String spNum = String.valueOf(SPnum);
				String sAllNum = String.valueOf(SAllnum);
				storehouse.setStotal(spNum);
				storehouse.setSall(sAllNum);
			}else{
				storehouse.setStotal("0");
			}
			if(storehouse.getSapply()!=null){
				int Sapply = Integer.valueOf(storehouse.getSapply());//取得库存中的使用量
				int sApply = Sapply+Pnum;
				String spApply = String.valueOf(sApply);
				storehouse.setSapply(spApply);
			}else{
				storehouse.setSapply(String.valueOf(Pnum));
			}
			storagehouseDaoImpl.update(storehouse);		
		}
	}

	@Override
	public void update(Purpose purpose) {
		// TODO Auto-generated method stub
		purposeDaoImpl.update(purpose);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		purposeDaoImpl.delete(id);

	}

	@Override
	public Purpose select(Long id) {
		// TODO Auto-generated method stub
		return purposeDaoImpl.getById(id);
	}

	@Override
	public int selectall(String work) {
		// TODO Auto-generated method stub
		return purposeDaoImpl.selectall(work);
	}

	@Override
	public List<Purpose> searchPc(String page, String rows, String psdate, String pedate,Map map) {
		// TODO Auto-generated method stub
		return purposeDaoImpl.searchPc(page, rows, psdate, pedate,map);
	}

	@Override
	public int selectallPc(String psdate, String pedate,Map map) {
		// TODO Auto-generated method stub
		return purposeDaoImpl.selectallPc(psdate, pedate,map);
	}
	@Override
	public List<Purpose> selectOrder(){
		return purposeDaoImpl.selectOrder();
	}
	

}
