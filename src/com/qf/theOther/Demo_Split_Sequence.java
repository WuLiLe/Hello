package com.qf.theOther;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* �ϲ� ��������ϲ���һ�� 
 * SequenceInputStream(Enumeration<? extends InputStream> e) 
 * */
public class Demo_Split_Sequence {

	public static void main(String[] args) throws IOException{
		File file = new File("d:\\splitFile");//��ȡ�ļ�
		File[] files = file.listFiles();//�õ�����
		System.out.println(files.length);
		//���ֽ���������ӵ�������
		ArrayList<FileInputStream> al = new ArrayList<>();
		for(int x=1;x<=files.length;x++) {
			al.add(new FileInputStream("d:\\splitFile\\cp_"+x+".mp3"));
		}
		//��ȡ Iterator������
		Iterator<FileInputStream> it = al.iterator();
		//��ȡ Enumerationö�� �����ڲ��� �޸� hasMoreElements nextElement �ķ�������ֵ
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
		//����ȡ����ö��(��ŵ�������������)���кϲ�
		SequenceInputStream sis = new SequenceInputStream(en);
		//�����ָ��Ŀ�ĵ�
		FileOutputStream fos = new FileOutputStream("d:\\lala.mp3");
		//����ȡ�������� д���� Ŀ�ĵ��ļ�
		byte[] buf = new byte[1024*1024];
		int len = 0;
		while((len=sis.read(buf))!=-1) {
			fos.write(buf, 0, len);
		}
		fos.close();//�ر���Դ �ͷ���
		sis.close();//�ر���Դ �ͷ���
	}

}
