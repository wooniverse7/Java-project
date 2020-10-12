package collec.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionHomework {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ScoreCollection> slist = new ArrayList<ScoreCollection>();
	
		while(true) {
			//3가지 경우의 수
			System.out.print("1.입력  2.출력 3.종료 : ");
			int input = in.nextInt();
			
			//학생의 이름과 점수 입력
			if(input == 1) {
				ScoreCollection st = new ScoreCollection();
				//System.out.println("----------입력----------");
				System.out.print("학생의 이름을 입력하세요 : ");
				st.setName(in.next());
				System.out.print("학생의 점수를 입력하세요 : ");
				st.setScore(in.nextInt());
			slist.add(st);	//List에 추가
			}
			//모든 학생의 정보 출력
			else if(input == 2) {
				for(ScoreCollection n : slist) {//배열 크기만큼 반복 및 순차증가
			System.out.println(n.getName()+"의 등급은"+n.makeGrade()+"입니다.");	
				}
			}
			//종료
			else if(input == 3) {
				System.out.println("종료합니다.");
				break;
			}
			//예외 처리
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
