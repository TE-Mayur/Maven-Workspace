package com.te.casestudy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.casestudy.beans.EmployeesInfo;

public class ShowDetails {

	public List<EmployeesInfo> showRecord(Integer id) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		List<EmployeesInfo> result = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("console");
			manager = factory.createEntityManager();

			String fetch = " from EmployeeInfo where id=:id";
			Query query = manager.createQuery(fetch);
			query.setParameter("id", id);
			result = query.getResultList();
			
			if (result != null) {
				return result;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		factory.close();
		manager.close();
		
		return null;
	}

}

