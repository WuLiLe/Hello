package com.qf.theOther;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/*������洢�������� ������д�� Ȼ�� ���뵽����̨
 * */
public class Test_ObjectStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		readObj();
	}
	public static void writeObj() throws IOException{
		Person p1 = new Person("����",23);
		Person p2 = new Person("����",24);
		Person p3 = new Person("����",25);
		Person p4 = new Person("����",26);
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("obj2.txt"));
		oos.writeObject(list);
		oos.close();
	}
	public static void readObj() throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("obj2.txt"));
		ArrayList<Person> list = (ArrayList<Person>)ois.readObject();
		for(Person p : list) {
			System.out.println(p);
		}
		ois.close();
	}
}
