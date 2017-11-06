package com.qf.theOther;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_ByteArrayStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//����Դ
		ByteArrayInputStream bis = new ByteArrayInputStream("ABC".getBytes());
		//����Ŀ��
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int by = 0;
		while((by=bis.read())!=-1) {
			bos.write(by);
		}
		System.out.println(bos.size());
		System.out.println(bos.toString());
		//д�����ļ���
		bos.writeTo(new FileOutputStream("x.txt"));
		//���ڴ滺���������е��ֽڴ洢��������
		byte[] newArr = bos.toByteArray();
	}

}
