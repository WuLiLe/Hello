package com.qf.theOther;

import java.io.*;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*	��������ϲ���һ�� 
 * SequenceInputStream(Enumeration<? extends InputStream> e) 
 * */
public class Demo_Sequence_2 {

	public static void main(String[] args) throws IOException{
		//���� Vector���� ��ȡ�����ļ����� ���뼯����
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(new FileInputStream("a.txt"));
		v.add(new FileInputStream("b.txt"));
		v.add(new FileInputStream("c.txt"));
		
		Enumeration<FileInputStream> en = v.elements();
		//������ֽ��������Ĵ洢�������� ��ȡ��ö�ٶ��� ���뵽 SequenceInputStream�� ���кϲ�
		SequenceInputStream sis = new SequenceInputStream(en);
		//������ս��
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
