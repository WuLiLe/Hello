package com.qf.theOther;

import java.io.*;

/*修改标准输入输出流
 *      修改输入流: System.setIn(InputStream)
		修改输出流: System.setOut(PrintStream)
 * */
public class Demo_inOut {

	public static void main(String[] args) throws IOException{
		File file = new File("a.txt");
		if(!file.exists())
			file.createNewFile();
		//设置标准输入流 为指定的文件 如果不设置 默认还是控制台
		System.setIn(new FileInputStream(file));
		//设置标准输出流 为指定的文件 如果不设置 默认还是控制台 很类似于拷贝
		System.setOut(new PrintStream("b.txt"));
		InputStream in = System.in;
		PrintStream out = System.out;
		int b;
		while((b=in.read())!=-1) {
			out.write(b);
			out.flush();
		}
		in.close();
		out.close();
	}

}
