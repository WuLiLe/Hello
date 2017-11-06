package com.qf.theOther;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_Data {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//writeData();
		readData();
	}
	public static void readData() throws IOException{
		DataInputStream dis = new DataInputStream(
				new FileInputStream("data.txt"));
		int num = dis.readInt();
		boolean b = dis.readBoolean();
		double d = dis.readDouble();
		System.out.println(num);
		System.out.println(b);
		System.out.println(d);
		dis.close();
	}
	public static void writeData() throws IOException {
		DataOutputStream dos = new DataOutputStream
				(new FileOutputStream("data.txt"));
		dos.writeInt(234);//4个字节
		dos.writeBoolean(true);//1个字节
		dos.writeDouble(980.78);//8个字节
		dos.write(98);
		dos.close();
	}
}
