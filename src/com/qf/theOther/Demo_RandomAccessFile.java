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
		saf.write("����".getBytes());
		saf.writeInt(97);
		saf.write("����".getBytes());
		saf.writeInt(99);
		/* writeInt д��4���ֽ� 
		 * write 1���ֽ� һ��int �ĺ��λ
		 * */
		
		saf.close();
	}
	public static void writeFile_2() throws IOException{
		RandomAccessFile saf = new RandomAccessFile("ran.txt", "rw");
		saf.seek(8*3);
		saf.write("����".getBytes());
		saf.writeInt(103);
		saf.close();
	}
	public static void readFile() throws IOException{
		RandomAccessFile saf = new RandomAccessFile("ran.txt", "rw");
		//����ָ�����ֽ��� ��� �������ֻ����� ������ǰ
		//saf.skipBytes(8);
		//������ǰ Ҳ�������
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
