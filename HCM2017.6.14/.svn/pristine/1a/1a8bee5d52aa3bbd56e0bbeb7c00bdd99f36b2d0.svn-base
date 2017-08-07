package com.ssh.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.LogDaoImpl;
import com.ssh.dao.impl.UserDaoImpl;
import com.ssh.entity.Consumer;
import com.ssh.entity.Logg;
import com.ssh.entity.Logs;
import com.ssh.service.LogService;
import com.ssh.util.ChooseRole;
@Transactional
@Service
public class LogServiceImpl implements LogService {

	@Resource
	LogDaoImpl logDao;
	
	@Resource
	private UserDaoImpl userDaoImpl;
	@Override
	public List<Logg> search(String page, String rows) {
		// TODO Auto-generated method stub
		return logDao.select(page, rows);
	}

	@Override
	public void save(Logg purchase) {
		// TODO Auto-generated method stub
		logDao.save(purchase);
	}

	@Override
	public void update(Logg purchase) {
		// TODO Auto-generated method stub
		logDao.update(purchase);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		logDao.delete(id);

	}

	@Override
	public Logg select(Long id) {
		// TODO Auto-generated method stub
		return logDao.getById(id);
	}

	@Override
	public int selectall() {
		// TODO Auto-generated method stub
		return logDao.selectall();
	}

	@Override
	public List<Logg> searchPc(String page, String rows, String psdate, String pedate,String work) {
		// TODO Auto-generated method stub
		saveLog(work);
		return logDao.searchPc(page, rows, psdate, pedate,work);
	}

	@Override
	public int selectallPc(String psdate, String pedate,String work) {
		// TODO Auto-generated method stub
		saveLog(work);
		return logDao.selectallPc(psdate, pedate,work);
	}

	public void saveLog(String work){
		 List<Logg> list = logDao.selectLog();
		
		 for(int i = 0;i<list.size();i++){
			 Logg log = list.get(i);
			 if(log.getLcontain().contains("-")){
				 String contain = log.getLcontain();
				 System.out.println(contain);
				 String str[] = contain.split("-");
				 String Luser = str[0];
				 Consumer consumer =  userDaoImpl.login(Luser);
				 if(Luser.equals("null")||consumer==null){
					 logDao.delete(log.getLid());
				 }else{
					 
					 String LSTR = "";
					 consumer.getCjt();
					 if(consumer.getCjt()!=null&&!"".equals(consumer.getCjt())){
						 LSTR = consumer.getCjt();
					 }
					 if(consumer.getCzs()!=null&&!"".equals(consumer.getCzs())){
						 LSTR = consumer.getCzs();
						 }
					 if(consumer.getCsc()!=null&&!"".equals(consumer.getCsc())){
						 LSTR = consumer.getCsc();
						 }
					 Map<String,String> map = ChooseRole.chooseRole(LSTR);
					 String Lcontains = str[1];
					 log.setLcontains(Lcontains);
					 log.setLuser(Luser);
					 if(map.get("jt")!=null){
						 log.setJt(consumer.getCjt());
					 }
					 if(map.get("zs")!=null){
						log.setZs(consumer.getCzs());
					 }
					 if(map.get("sc")!=null){
						log.setSc(consumer.getCsc());
					}
					logDao.save(log);
				 }
				 
		}else{
				logDao.delete(log.getLid());
		}	 
	}
	}
	
	@Override
	public List<Logs> selectOrder(){
		List<Logg> list = logDao.selectLog();
		//Lcontain:zcm-查询xxx    Ldate:2017-05-23 14:05:58   分离 : zcm   查询xxx   2017-05-23   14:05:58
		List<Logs> ll = new ArrayList<>();
		for(Logg log:list){
			Logs logs = new Logs();
			String Lcontain = log.getLcontain();
			if(!Lcontain.contains("-")){				 
					 logDao.delete(log.getLid());
			}else{
				String Ldate = log.getLdate();
				String[] str1 = Lcontain.split("-");
				String[] str2 = Ldate.split("\\s+");//以空格分割
				String name = str1[0];
				String contain = str1[1];
				String date = str2[0];
				String minute = str2[1];
				logs.setContain(contain);
				logs.setDate(date);
				logs.setMinute(minute);
				logs.setUser(name);
				ll.add(logs);	
			}
			
		}
		return ll;
		
	}

}
