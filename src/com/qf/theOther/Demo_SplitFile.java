package com.qf.theOther;

import java.io.*;

/*�и�:
 * ��һ���ļ��ֳɶ�� һ����ȡ�� ��Ӧ��������
 * �и�mp3 ����1m���и�
 * */
public class Demo_SplitFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("���ഺ.mp3");
		
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
		System.out.println("������");
	}

}
