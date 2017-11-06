package com.qf.theOther;

import java.io.*;

public class Demo_Print {

	public static void main(String[] args) throws IOException{
		BufferedReader bur = new BufferedReader(
				new InputStreamReader(System.in));
		
		//PrintWriter out = new PrintWriter("abc.txt",true);
		PrintWriter out = new PrintWriter(new FileWriter("abc.txt"),true);
		String line = null;
		while((line = bur.readLine())!=null) {
			if("break".equals(line)) {
				break;
			}
			out.println(line.toUpperCase());
			//out.flush();
		}
		out.close();
		bur.close();
	}

}
