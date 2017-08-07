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
	 * �ɹ�
	 * ˼·����ѯ�ɹ�Σ��Ʒ�����ƣ�������룬ͨ��Σ��Ʒ���Ʋ�ѯ�������������Ѿ����ڸ�Σ�������Σ�������ƴ����Ҷ�Ӧ�Ĺ����ı��Ҳһ�£��ſ��ԣ���
	 * ���¿�����Σ��������������ڵ�������Σ�������Ʋ����ڻ�Σ�������ƴ��ڣ����Ƕ�Ӧ�Ĺ������벻����
	 * 
	 * 	1Σ�������ƣ���λ���·�,��λ��ʹ�ó�����ͬ
	 *	Σ�����Ѿ����ڣ�ֱ���������
	 *	2Σ�������ƣ���λ���ڣ��·ݲ�ͬ
	 *	��ͬ�·ݲɹ���Σ�����Ҫ����Ϊ�µļ�¼
	 *	3Σ�������Ʋ�����
	 *	����¼�¼
	 *	4Σ�������ƴ��ڣ���λ������
	 *	����¼�¼
	 *  5Σ�������ƣ���λ���·ݶ�������
	 *  ����¼�¼
	 *  6
	 */
	@Override
	public void save(Purchase purchase,String work) {
		// TODO Auto-generated method stub
		purchaseDao.save(purchase);
		
		String pname = purchase.getPname();	//Σ��������
		//String pcompany = purchase.getPcompany();	//��λ
		//String ptype = purchase.getPdensity();	//
		String pnum = purchase.getPnum();	//����
		//String pposition = purchase.getPposition();	//��λ
		String punit = purchase.getPunit();//ȡ�õ�λ
		String pother = purchase.getPother();//ʹ��;��
		String ptype = purchase.getPtype();//ʹ��;��
		String position = purchase.getPposition();
		String hazcoding = ""; //Σ�������
		HazardousChemicals hazardousChemicals = hazardousChemicalsDaoImpl.selectHCByName(pname); //����Σ�������Ʋ�ѯ��Σ����
		Storehouse storHouse = new Storehouse();
		if(hazardousChemicals!=null){
			hazcoding = hazardousChemicals.getHnum();//�õ�Σ�������	
		}
		Storehouse storehouse = storagehouseDaoImpl.selectSHByName(purchase.getPname(),work,GetDate.Getdate(),pother);
		
		//1Σ�������ƣ���λ���·���ͬ
		if(storehouse!=null){
			int Snum = Integer.parseInt(storehouse.getSmonth()); //ȡ�ĵ�ǰΣ����ĵ��¹�����
			int Pnum = Integer.parseInt(pnum);//ȡ�õ�ǰ�ɹ���Σ���������
			int Stotal = Integer.parseInt(storehouse.getStotal());//ȡ�ø�Σ����ĵ�ǰ�������
			int Sall = Integer.parseInt(storehouse.getSall());//ȡ�ø�Σ����Ŀ������
			int SPnum = Snum+Pnum;	//���¹�����
			int SPtotal = Pnum + Stotal;//���¿������ = �����+�ɹ�����
			int SPall = Sall+Pnum;//Σ��������=Σ�����浱ǰ����+�ɹ���
			String spNum = String.valueOf(SPnum);
			String spTotal = String.valueOf(SPtotal);
			String spAll = String.valueOf(SPall);
			System.out.println("��----------����"+spNum);
			storehouse.setSmonth(spNum);
			storehouse.setStotal(spTotal);
			storehouse.setSall(spAll);
			storagehouseDaoImpl.update(storehouse);	
		//����¼�¼
		}else{
			int Stotal = 0;
			int Sbefor = 0;
			Storehouse storehouseBefor = storagehouseDaoImpl.selectSHByName(purchase.getPname(),work,GetDate.GetBefordate(),pother);
			if(storehouseBefor!=null){//�����=����ʣ����+�ɹ���
				Stotal = Integer.parseInt(storehouseBefor.getStotal());//ȡ�ø�Σ�������������
				Sbefor = Integer.parseInt(storehouseBefor.getSall());//ȡ�ø�Σ��������¿����
			}else{
				Sbefor = 0;
			}
			int Pnum = Integer.parseInt(pnum);//ȡ�õ�ǰ�ɹ���Σ���������
			int stotal = Pnum+Sbefor;//Σ����Ŀ������
			String spTotal = String.valueOf(stotal);
			String spBefor = String.valueOf(Sbefor);
			storHouse.setSname(pname);	//Σ�������� 
			storHouse.setSnum(hazcoding);	//Σ�������
			storHouse.setSmonth(pnum);	//Σ��������
			storHouse.setSdate(GetDate.Getdate());	//�·�
			System.out.println("position:----------------------"+position);
			storHouse.setSpoint(position);	//��λ
			storHouse.setSbeforeSurplus(spBefor);
			storHouse.setSwork(work);	//������λ
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
			storHouse.setStotal(pnum);  //���¿������ 	
			storHouse.setSall(spTotal);//��ǰΣ��������
			storHouse.setSunit(punit);//ʹ�ü�����λ
			storHouse.setSother(pother);//ʹ�ó���
			storagehouseDaoImpl.save(storHouse);	
		}	
	}

	@Override
	public void update(Purchase purchase) {
		// TODO Auto-generated method stub
		System.out.println("����");
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
	
	//ÿ�μ�¼�ɹ���Ϣʱͬʱ����λ��Ϣ��ӵ�������
	/*public void addStorehouse(Purchase purchase,String work){
		String pname = purchase.getPname();	//Σ��������
		//String pcompany = purchase.getPcompany();	//��λ
		//String ptype = purchase.getPdensity();	//
		String pnum = purchase.getPnum();	//����
		String pposition = purchase.getPposition();	//��λ
		String hazcoding = ""; //Σ�������
		
		if()
		
	}*/
	@Override
	public List<Purchase> selectOrder(){
		return purchaseDao.selectOrder();
	}


}
