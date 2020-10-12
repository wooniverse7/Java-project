package kr.ac.inha01;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Src07 {

	public static void main(String[] args) {
		//ctrl + 마우스 클릭 : 소스코드 보기
		Src06 s6 = new Src06();
		Src06.main(args);//main의 소스코드로 링크
		
		Queue<String> q = new LinkedList<>();
		
		//q.remove();
		
		System.out.println(q.poll());
		q.offer("사과");
		System.out.println("바나나를 추가했나요? " + q.offer("바나나"));
		
		try {
			q.add("체리");
		} catch (IllegalStateException e) {
		}
		System.out.println("헤드 엿보기 : " + q.peek());
		
		String head = null;
		try {
			head = q.remove();
			System.out.println(head + " 제거하기");
			System.out.println("새로운 헤드 : " + q.element());	
		}catch(NoSuchElementException e) {
		}
		
		head = q.poll();
		System.out.println(head + " 제거하기");
		System.out.println("새로운 헤드 : " + q.peek());
		
		System.out.println("체리를 포함하고 있나요? " + q.contains("체리"));
		System.out.println("사과를 포함하고 있나요? " + q.contains("사과"));
	}
}
		





