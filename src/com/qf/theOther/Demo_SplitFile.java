package com.qf.theOther;

import java.io.*;

/*切割:
 * 将一个文件分成多份 一个读取流 对应多个输出流
 * 切割mp3 按照1m来切割
 * */
public class Demo_SplitFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("致青春.mp3");
		
		FileOutputStream fos = null;
		
		byte[] buf = new byte[1024*1024];
		int len = 0;
		int count = 1; 
		while((len=fis.read(buf))!=-1) {
			fos = new FileOutputStream("d:\\splitFile\\cp_"+(count++)+".mp3");
			fos.write(buf,0,len);
			fos.close();
		}
		fis.close();
		System.out.println("结束了");
	}

}
