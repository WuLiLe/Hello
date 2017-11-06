package com.qf.theOther;

import java.io.*;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*	将多个流合并成一个 
 * SequenceInputStream(Enumeration<? extends InputStream> e) 
 * */
public class Demo_Sequence_2 {

	public static void main(String[] args) throws IOException{
		//创建 Vector集合 读取三个文件内容 存入集合中
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(new FileInputStream("a.txt"));
		v.add(new FileInputStream("b.txt"));
		v.add(new FileInputStream("c.txt"));
		
		Enumeration<FileInputStream> en = v.elements();
		//将多个字节数入流的存储到集合中 获取的枚举对象 传入到 SequenceInputStream中 进行合并
		SequenceInputStream sis = new SequenceInputStream(en);
		//输出最终结果
		FileOutputStream fos = new FileOutputStream("d.txt");
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=sis.read(buf))!=-1) {
			fos.write(buf, 0, len);
		}
		fos.close();
		sis.close();
	}

}
