package com.qf.theOther;

import java.io.*;
import java.io.SequenceInputStream;

/*	���������ϲ���һ�� 
 * SequenceInputStream(InputStream s1, InputStream s2) 
 * */
public class Demo_Sequence_1 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis1 = new FileInputStream("1.jpg"); //�����ֽ����������� 
		FileInputStream fis2 = new FileInputStream("copy.jpg"); //�����ֽ����������� 
		//�� �����ֽ������� �ϲ���һ��
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		//�����c.txt�ļ���
		FileOutputStream fos = new FileOutputStream("copy1.jpg");
		
		int b;
		while((b=sis.read())!=-1) {
			fos.write(b);
		}
		sis.close();
		fos.close();
	}

}
