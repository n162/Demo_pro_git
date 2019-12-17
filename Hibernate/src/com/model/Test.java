package com.model;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test 
{
public static void main(String[] args) 
{
	StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	
	MetadataSources mds=new MetadataSources(registry);
	Metadata md=mds.getMetadataBuilder().build();
	
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	
	Session session=sf.openSession();
	
	//Student stu=new Student();
//	stu.setRollno(1);
//	stu.setName("Ajinkya");
//	stu.setAddr("KarveNagar");
	
	
//	session.save(stu);
	//session.beginTransaction().commit();
	
	
Student stu=session.load(Student.class,1);
	
	
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAddr());
	
}
}
