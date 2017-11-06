package com.qf.theOther;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_Data_writeUtf {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		writeUTFDemo();
	}
	public static void writeUTFDemo() throws IOException {
		DataOutputStream dos = new DataOutputStream
				(new FileOutputStream("writeUTF.txt"));
		dos.writeUTF("ÄãºÃ");
		dos.close();
	}
	public static void readUTFDemo() throws IOException{
		DataInputStream dis = new DataInputStream(
				new FileInputStream("writeUTF.txt"));
		String s = dis.readUTF();
		System.out.println(s);
		dis.close();
	}
	
}
