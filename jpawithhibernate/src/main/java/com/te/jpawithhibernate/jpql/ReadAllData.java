package com.te.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.jpawithhibernate.beans.InternsInfo;


public class ReadAllData {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("interns");
		EntityManager manager = factory.createEntityManager();
		
		String read = "from InternsInfo";
		
		Query query = manager.createQuery(read);
		
		List<InternsInfo> internsInfo = query.getResultList();
		
		for (InternsInfo info : internsInfo) {
			System.out.println(info.getName());
			System.out.println(info.getId());
			System.out.println(info.getGender());
			System.out.println(info.getDateOfBirth());
			System.out.println(info.getMobile());
			System.out.println(info.getSalary());
			System.out.println(info.getDesignation());
			System.out.println(info.getDeptId());
			System.out.println("------------------");
		}
		manager.close();
		factory.close();
	
	}

}
