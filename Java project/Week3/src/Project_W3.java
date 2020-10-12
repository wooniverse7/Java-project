import java.util.Scanner;

public class Project_W3 {

	public static void main(String[] argS) {
		
		while(true) {
			//질문을 계속 받기 위해 while문 안에 입력받는 것을 넣음
		Scanner in = new Scanner(System.in);
		System.out.print("질문 : ");
		String Q = in.next();
				
		if(Q.equals("밥먹었니?"))
			System.out.println("아니.");
		else if(Q.equals("날씨어때?"))
			System.out.println("좋아.");
		else if(Q.equals("잘지내?"))
			System.out.println("Not bad.");
		else if(Q.equals("운동했어?"))
			System.out.println("아침에 했지.");
		else if(Q.equals("어디야?"))
			System.out.println("집이야.");
		else if(Q.equals("Exit"))	//무한 루프를 빠져나오기 위해 break;
			break;
		//예외 케이스는 모두 else로 처리
		else
			System.out.println("먼소리야.");	
		
		}

	}
}

