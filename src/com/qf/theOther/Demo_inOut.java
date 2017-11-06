package com.qf.theOther;

import java.io.*;

/*�޸ı�׼���������
 *      �޸�������: System.setIn(InputStream)
		�޸������: System.setOut(PrintStream)
 * */
public class Demo_inOut {

	public static void main(String[] args) throws IOException{
		File file = new File("a.txt");
		if(!file.exists())
			file.createNewFile();
		//���ñ�׼������ Ϊָ�����ļ� ��������� Ĭ�ϻ��ǿ���̨
		System.setIn(new FileInputStream(file));
		//���ñ�׼����� Ϊָ�����ļ� ��������� Ĭ�ϻ��ǿ���̨ �������ڿ���
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
