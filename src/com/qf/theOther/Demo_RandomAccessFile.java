package com.qf.theOther;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo_RandomAccessFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writeFile();
		writeFile_2();
	//	readFile();
	}
	public static void writeFile() throws IOException{
		RandomAccessFile saf = new RandomAccessFile("ran.txt", "rw");
		saf.write("李四".getBytes());
		saf.writeInt(97);
		saf.write("王五".getBytes());
		saf.writeInt(99);
		/* writeInt 写出4个字节 
		 * write 1个字节 一个int 的后八位
		 * */
		
		saf.close();
	}
	public static void writeFile_2() throws IOException{
		RandomAccessFile saf = new RandomAccessFile("ran.txt", "rw");
		saf.seek(8*3);
		saf.write("张三".getBytes());
		saf.writeInt(103);
		saf.close();
	}
	public static void readFile() throws IOException{
		RandomAccessFile saf = new RandomAccessFile("ran.txt", "rw");
		//跳过指定的字节数 向后 这个方法只能向后 不能向前
		//saf.skipBytes(8);
		//可以向前 也可以向后
		saf.seek(8);
		byte[] buf = new  byte[4];
		saf.read(buf);
		String name = new String(buf);
		int age = saf.readInt();
		System.out.println("name==="+name);
		System.out.println("age==="+age);
		saf.close();
	}
}
