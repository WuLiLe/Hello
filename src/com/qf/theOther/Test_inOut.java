package com.qf.theOther;

import java.io.*;
import java.io.PrintStream;

/*��ϰ: �޸ı�׼��������� ����ͼƬ
 * */
public class Test_inOut {

	public static void main(String[] args) throws IOException{
		System.setIn(new FileInputStream("1.jpg"));//�ı��׼������ Դ
		System.setOut(new PrintStream("copy.jpg"));//�ı��׼����� Ŀ�ĵ�
		InputStream in = System.in;//��ȡ��׼������
		PrintStream out = System.out;//��ȡ��׼�����
		int len;
		byte[] arr = new byte[1024*8];//�������黺����
		while((len=in.read(arr))!=-1) {//��ȡԴ ���е�����
			out.write(arr,0,len);//������������ д����Ŀ�ĵ�
		}
		in.close();//�ر��� �ͷ���Դ
		out.close();//�ر��� �ͷ���Դ
	}

}
