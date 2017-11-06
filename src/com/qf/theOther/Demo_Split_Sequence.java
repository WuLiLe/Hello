package com.qf.theOther;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* 合并 将多个流合并成一个 
 * SequenceInputStream(Enumeration<? extends InputStream> e) 
 * */
public class Demo_Split_Sequence {

	public static void main(String[] args) throws IOException{
		File file = new File("d:\\splitFile");//获取文件
		File[] files = file.listFiles();//得到长度
		System.out.println(files.length);
		//将字节输入流添加到集合中
		ArrayList<FileInputStream> al = new ArrayList<>();
		for(int x=1;x<=files.length;x++) {
			al.add(new FileInputStream("d:\\splitFile\\cp_"+x+".mp3"));
		}
		//获取 Iterator迭代器
		Iterator<FileInputStream> it = al.iterator();
		//获取 Enumeration枚举 匿名内部类 修改 hasMoreElements nextElement 的方法返回值
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
			@Override
			public boolean hasMoreElements() {			
				return it.hasNext();
			}
			@Override
			public FileInputStream nextElement() {
				return it.next();
			}
		};
		//将获取到的枚举(存放的是输入流对象)进行合并
		SequenceInputStream sis = new SequenceInputStream(en);
		//输出到指定目的地
		FileOutputStream fos = new FileOutputStream("d:\\lala.mp3");
		//将获取到的内容 写出到 目的地文件
		byte[] buf = new byte[1024*1024];
		int len = 0;
		while((len=sis.read(buf))!=-1) {
			fos.write(buf, 0, len);
		}
		fos.close();//关闭资源 释放流
		sis.close();//关闭资源 释放流
	}

}
