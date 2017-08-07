package com.ssh.test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.CompanyDaoImpl;
import com.ssh.dao.impl.StoragehouseDaoImpl;
import com.ssh.entity.Company;
import com.ssh.entity.ZS;
import com.ssh.service.impl.CompanyServiceImpl;
import com.ssh.service.impl.StoragehouseServiceImpl;


@Transactional
public class HibernateTest {
	/**
	 * 
	 */
	@Resource
	private CompanyDaoImpl cdi;

	/*@Test
	public void testBean() throws Exception{
		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		CompanyServiceImpl companyServiceImpl = (CompanyServiceImpl) factory.getBean("companyServiceImpl");
		
		//bean的名字 首字母小写
		//List<Company> list= companyServiceImpl.search("5","3");
		System.out.println("----");
		Company company = new Company();
		company.setCname("cc");
		company.setCaddress("bb");
		company.setCtel("aa");
		company.setEmergencyPerson("dd");
		company.setEmergencyCalls("ee");
		company.setEmil("ff");
		System.out.println(company);
		companyServiceImpl.save(company);
		//System.out.println(list);
		System.out.println(company);
	}*/
	@Test
	public void test() throws Exception{
		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");
		Map<String, String> map = new HashMap();
		 List<ZS> list = storagehouseServiceImpl.searchAllZS("1", "10", "2017年05月", map, "氨基磺酸");
		 for(ZS zs:list){
			 System.out.println("all----"+zs.getSall());
			 System.out.println("ZS----"+zs.getZs());

		 }
		 System.out.println(list.size());
		
	}
}
