package kr.ac.inha01;

import java.util.Scanner;

public class Src01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int scores[] = new int[7];	
		scores = new int[5];	//�迭 �缱�� : ���� ������ �� ����
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
			sum += scores[i];
		}
		
		System.out.println("��� = " + sum/5.0);	//�Ҽ��� �������� ����
	}

}
