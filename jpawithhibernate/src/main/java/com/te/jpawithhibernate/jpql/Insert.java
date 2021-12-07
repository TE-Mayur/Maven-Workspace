package com.te.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.jpawithhibernate.beans.InternsInfo;

public class Insert {

	public static void main(String[] args) {
		InternsInfo info= new InternsInfo();
		info.setId(10);
		info.setName("ram");
		info.setSalary("1000.00");
      EntityManagerFactory emf=Persistence.createEntityManagerFactory("interns");
      EntityManager em=emf.createEntityManager();
      EntityTransaction transaction= em.getTransaction();
      String

	}

}
