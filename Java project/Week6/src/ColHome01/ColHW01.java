package ColHome01;

import java.util.ArrayList;
import java.util.Scanner;

public class ColHW01 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		ArrayList<ScrCol> slist = new ArrayList<ScrCol>();
	
			//System.out.print("1.�Է�  2.��� 3.���� : ");
			//String input = in.next();
			//System.out.println("               ");
			System.out.println("----------�Է�----------");
			while(true) {
				ScrCol st = new ScrCol();

				System.out.print("�л��� �̸��� �Է��ϼ��� : ");
				st.setName(in.next());
				if(in.next().equals("exit")){
					break;
				}
				System.out.print("�л��� ������ �Է��ϼ��� : ");
				st.setScore(in.nextInt());
			slist.add(st);
			}
			
				for(ScrCol n : slist) {
			System.out.println(n.getName()+"�� �����"+n.makeGrade()+"�Դϴ�.");	
				
		}
	}
}

