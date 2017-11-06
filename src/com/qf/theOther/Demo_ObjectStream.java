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
		 * java.io.NotSerializableException 提示需要将对象序列化 如何序列化呢?
		 * 实现 Serializable 接口
		 * 生成的文件看不懂 里面存的对象是给内存看的
		 * .txt 显示的是字符
		 * */
		oos.close();
	}
}
