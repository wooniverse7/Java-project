package ColHome01;

import java.util.ArrayList;
import java.util.Scanner;

public class ColHW01 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		ArrayList<ScrCol> slist = new ArrayList<ScrCol>();
	
			//System.out.print("1.입력  2.출력 3.종료 : ");
			//String input = in.next();
			//System.out.println("               ");
			System.out.println("----------입력----------");
			while(true) {
				ScrCol st = new ScrCol();

				System.out.print("학생의 이름을 입력하세요 : ");
				st.setName(in.next());
				if(in.next().equals("exit")){
					break;
				}
				System.out.print("학생의 점수를 입력하세요 : ");
				st.setScore(in.nextInt());
			slist.add(st);
			}
			
				for(ScrCol n : slist) {
			System.out.println(n.getName()+"의 등급은"+n.makeGrade()+"입니다.");	
				
		}
	}
}

