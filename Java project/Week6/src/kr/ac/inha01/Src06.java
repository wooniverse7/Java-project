package kr.ac.inha01;

import java.util.ArrayList;
import java.util.LinkedList;

public class Src06 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		Long start = System.nanoTime();
		for(int i = 0; i < 100000; i++)
			al.add(0, i);
		Long end = System.nanoTime();
		Long duration = end - start;
		System.out.println("ArrayList�� ó���� �ð� : " + duration);
		
		start = System.nanoTime();
		for(int i = 0; i < 100000; i++)
			ll.addFirst(i);
		end=System.nanoTime();
		duration = end - start;
		System.out.println("LinkedList�� ó���� �ð� : " + duration);
		
		//get ���� ��
		start = System.nanoTime();
		for(int i = 0; i < 100000; i++)
			al.get(i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("ArrayList�� ó���� �ð� : " + duration);
		
		start = System.nanoTime();
		for(int i = 0; i < 100000; i++)
			ll.get(i);
		end=System.nanoTime();
		duration = end - start;
		System.out.println("LinkedList�� ó���� �ð� : " + duration);
	}
}
