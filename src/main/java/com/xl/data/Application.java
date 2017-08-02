package com.xl.data;

import java.util.Date;

import org.hibernate.Session;

import com.xl.data.entities.User;

public class Application {
	
	public static void main(String[] args){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		User user = new User();
		user.setBirthDate(new Date("1987/11/14"));
		user.setCreatedBy("me");
		user.setEmailAddress("test@test.com");
		user.setFirstName("first");
		user.setLastName("last");
		user.setCreatedDate(new Date());
		user.setLastUpdatedDate(new Date());
		user.setLastUpdatedBy("me");
		session.save(user);
		session.getTransaction().commit();		
		
		session.refresh(user);
		System.out.println("age: " + user.getAge());
		session.close();
	}
}
