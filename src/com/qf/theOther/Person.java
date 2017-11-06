package com.qf.theOther;

import java.io.Serializable;

public class Person implements Serializable{
	String name;
	int age;
	static String country = "CN";
	transient String sex;
	/*为了避免改过后 序列号发生变化 直接手动添加序列号 即可*/
	public static final long serialVersionUID = 42L;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	Person(String name,int age,String country,String sex){
		this.name = name;
		this.age = age;
		this.country = country;
		this.sex = sex;
	}
	public String toString() {
		return name+"::"+age+"::"+country+"::"+sex;
	}
}
