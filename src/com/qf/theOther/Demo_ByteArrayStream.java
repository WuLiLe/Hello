package com.qf.theOther;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_ByteArrayStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//数据源
		ByteArrayInputStream bis = new ByteArrayInputStream("ABC".getBytes());
		//数据目的
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int by = 0;
		while((by=bis.read())!=-1) {
			bos.write(by);
		}
		System.out.println(bos.size());
		System.out.println(bos.toString());
		//写出到文件中
		bos.writeTo(new FileOutputStream("x.txt"));
		//将内存缓冲区中所有的字节存储到数组中
		byte[] newArr = bos.toByteArray();
	}

}
