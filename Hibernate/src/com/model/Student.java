package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student
{
@Id

private int Rollno;
private String Name;
private String Addr;
public int getRollno() 
{
	return Rollno;
}
public void setRollno(int rollno) {
	Rollno = rollno;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddr() {
	return Addr;
}
public void setAddr(String addr) {
	Addr = addr;
}


}