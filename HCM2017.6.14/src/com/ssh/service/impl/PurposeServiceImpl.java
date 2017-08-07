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
	 * ����ʹ�ã����⣩
	 *1���֮ǰ��Ҫ�Ȳ�ѯ�ֿ����Ƿ��д��
	 *2ÿ�����ʹ�ü�¼��ʱ����Ҫͬ����������
	 *3����Σ�������ƣ�������λ�����µ��·ݲ�ѯ���ֿ��еļ�¼
	 *���ڳ������������ֻ���ڸ��²���
	 */
	@Override
	public void save(Purpose purpose,String work) {
		// TODO Auto-generated method stub
		System.out.println("----------zcm");
		purposeDaoImpl.save(purpose);
		//��ȡ����е�
		Storehouse storehouse = storagehouseDaoImpl.selectSHByName(purpose.getPname(),work,GetDate.Getdate(),purpose.getPother());
		if(storehouse!=null){
			int Pnum = Integer.valueOf(purpose.getPnum());//ȡ��ʹ������
			
			if(storehouse.getSall()!=null){
				int Snum = Integer.valueOf(storehouse.getStotal());//ȡ�ÿ���е�Σ��Ʒ�ĵ�������
				int Sallnum = Integer.valueOf(storehouse.getSall());//ȡ�ÿ���е�Σ��Ʒ������
				int SPnum = Snum - Pnum;//���¿������
				int SAllnum = Sallnum - Pnum;//Σ��Ʒ�������
				String spNum = String.valueOf(SPnum);
				String sAllNum = String.valueOf(SAllnum);
				storehouse.setStotal(spNum);
				storehouse.setSall(sAllNum);
			}else{
				storehouse.setStotal("0");
			}
			if(storehouse.getSapply()!=null){
				int Sapply = Integer.valueOf(storehouse.getSapply());//ȡ�ÿ���е�ʹ����
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
