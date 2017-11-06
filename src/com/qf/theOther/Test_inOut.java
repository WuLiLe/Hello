package com.qf.theOther;

import java.io.*;
import java.io.PrintStream;

/*练习: 修改标准输入输出流 拷贝图片
 * */
public class Test_inOut {

	public static void main(String[] args) throws IOException{
		System.setIn(new FileInputStream("1.jpg"));//改变标准输入流 源
		System.setOut(new PrintStream("copy.jpg"));//改变标准输出流 目的地
		InputStream in = System.in;//获取标准输入流
		PrintStream out = System.out;//获取标准输出流
		int len;
		byte[] arr = new byte[1024*8];//创建数组缓冲区
		while((len=in.read(arr))!=-1) {//读取源 流中的内容
			out.write(arr,0,len);//将读到的内容 写出到目的地
		}
		in.close();//关闭流 释放资源
		out.close();//关闭流 释放资源
	}

}
