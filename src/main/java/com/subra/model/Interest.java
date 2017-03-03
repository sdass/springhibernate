package com.subra.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@Entity
public class Interest {

	@Id
	private CompoundKey id;
	
	private Float rate;
	
	
	public Interest() {
		// TODO Auto-generated constructor stub
	}


	public CompoundKey getId() {
		return id;
	}


	public void setId(CompoundKey id) {
		this.id = id;
	}


	public Float getRate() {
		return rate;
	}


	public void setRate(Float rate) {
		this.rate = rate;
	}
	

	public static void main(String [] args){
		Interest rate1 = new Interest();
		rate1.setRate(5.35F);
		
		CompoundKey compoundKey = new CompoundKey(77, 15);
		rate1.setId(compoundKey);
		
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Interest.class);
		config.configure();
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.getCurrentSession();
		System.out.println("saving Interest object . . . ");
		session.beginTransaction();
		session.save(rate1);
		System.out.println("saved Interest object . . . ");
		session.getTransaction().commit();
		
		
		
		
	}
	

}
