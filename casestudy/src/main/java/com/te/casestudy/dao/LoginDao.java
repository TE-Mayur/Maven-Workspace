package com.te.casestudy.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.casestudy.beans.EmployeesInfo;

public class LoginDao {

	public static boolean validate(Integer id, String password) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;

		factory = Persistence.createEntityManagerFactory("console");
		manager = factory.createEntityManager();

		String que = "select count(*) from EmployeesInfo where empno=:id and password=:password";
		Query query = manager.createQuery(que);

		query.setParameter("id", id);
		query.setParameter("password", password);
 
		EmployeesInfo info = null;
//
//		try {
//			info = (EmployeesInfo) query.getSingleResult();
//
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	
		Object ref = query.getSingleResult();
		int x =((Number)ref).intValue();
		
		if(x==1) {
			return true;
		}else {
			return false;
		}
	
	}

}
