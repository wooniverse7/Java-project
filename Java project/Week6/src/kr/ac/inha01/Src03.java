package kr.ac.inha01;

import java.util.ArrayList;
import java.util.Scanner;

//ctrl + shift + f : 자동 들여쓰기
public class Src03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			//자동완성으로 생성하기, <자바 클래스>입력
		ArrayList<Integer> scores = new ArrayList<>(); //
		int data;
		int sum = 0;

		while ((data = in.nextInt()) >= 0)
			scores.add(data);
		
		
		for (int i = 0; i < scores.size(); i++)
			sum += scores.get(i);
		
		//위 for문을 for~each문으로 변경
		//index가 없는 코드에 쓸 때 편함
		for(int i : scores)	//scores의 값을 i라는 변수에 넣어서 아래 코드를 수행
			sum += i;
		
		System.out.println("평균 = " + sum / scores.size());

	}

}
//0보다 작은 값을 넣었을 때 그 전까지의 평균을 구하는 함수