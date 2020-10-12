package kr.ac.inha01;

import java.util.Scanner;

public class Src01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int scores[] = new int[7];	
		scores = new int[5];	//배열 재선언 : 앞의 내용이 다 날라감
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
			sum += scores[i];
		}
		
		System.out.println("평균 = " + sum/5.0);	//소숫점 나머지를 위해
	}

}
