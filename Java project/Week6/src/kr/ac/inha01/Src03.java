package kr.ac.inha01;

import java.util.ArrayList;
import java.util.Scanner;

//ctrl + shift + f : �ڵ� �鿩����
public class Src03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			//�ڵ��ϼ����� �����ϱ�, <�ڹ� Ŭ����>�Է�
		ArrayList<Integer> scores = new ArrayList<>(); //
		int data;
		int sum = 0;

		while ((data = in.nextInt()) >= 0)
			scores.add(data);
		
		
		for (int i = 0; i < scores.size(); i++)
			sum += scores.get(i);
		
		//�� for���� for~each������ ����
		//index�� ���� �ڵ忡 �� �� ����
		for(int i : scores)	//scores�� ���� i��� ������ �־ �Ʒ� �ڵ带 ����
			sum += i;
		
		System.out.println("��� = " + sum / scores.size());

	}

}
//0���� ���� ���� �־��� �� �� �������� ����� ���ϴ� �Լ�