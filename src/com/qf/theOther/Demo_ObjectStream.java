package com.qf.theOther;
import java.io.*;
public class Demo_ObjectStream {

	public static void main(String[] args) throws Exception {
		
		readObj();
	}
	public static void readObj() throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("obj.txt"));
		Person p = (Person)ois.readObject();
		Person p2 = (Person)ois.readObject();
		System.out.println(p+"---"+Person.country);
		System.out.println(p2+"---"+Person.country);
		ois.close();
	}
	
	public static void writeObj() throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("obj.txt"));
		oos.writeObject(new Person("lisi",24,"ccc","man"));
		oos.writeObject(new Person("wangwu",24,"ccc","man"));
		/*
		 * java.io.NotSerializableException ��ʾ��Ҫ���������л� ������л���?
		 * ʵ�� Serializable �ӿ�
		 * ���ɵ��ļ������� �����Ķ����Ǹ��ڴ濴��
		 * .txt ��ʾ�����ַ�
		 * */
		oos.close();
	}
}
