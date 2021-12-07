package com.te.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.jpawithhibernate.beans.InternsInfo;

public class FindNames {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("interns");
		EntityManager manager = factory.createEntityManager();
		
		String findName = "select name from InternsInfo";
		
		Query query = manager.createQuery(findName);
		
		List<String> names = query.getResultList();
		
		for (String name: names) {
			System.out.println(name);
			System.out.println("------------------------");
			
		}
		
		String des = "select designation,id from InternsInfo";
		
		Query query2 = manager.createQuery(des);
		
		List<Object[]> list = query2.getResultList();
		
		for (Object[] obj : list) {
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println("--------------------------------------------");
			
		}
	
		manager.close();
		factory.close();
	}
}