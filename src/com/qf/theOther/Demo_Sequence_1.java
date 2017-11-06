package com.qf.theOther;

import java.io.*;
import java.io.SequenceInputStream;

/*	将两个流合并成一个 
 * SequenceInputStream(InputStream s1, InputStream s2) 
 * */
public class Demo_Sequence_1 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis1 = new FileInputStream("1.jpg"); //创建字节输入流对象 
		FileInputStream fis2 = new FileInputStream("copy.jpg"); //创建字节输入流对象 
		//将 两个字节数入流 合并成一个
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		//输出到c.txt文件中
		FileOutputStream fos = new FileOutputStream("copy1.jpg");
		
		int b;
		while((b=sis.read())!=-1) {
			fos.write(b);
		}
		sis.close();
		fos.close();
	}

}
