import java.util.Scanner;

public class Source3_IFelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("점수를 입력하세요 : ");
		int score = in.nextInt();
		/*
		if(score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if(score >= 70)
			grade = "C";
		else if(score >= 60)
			grade = "D";
		else
			grade = "F";
		*/
		
	//전부 if문을 쓰고 93을 입력하면 grade가 계속 변경되어 D하나만 출력된다.
	//if문만을 쓰고 정답을 나오게 할려면 범위를 10단위로 좁혀야겠다.
	//순서를 바꾸면 된다.				
		/*if(score >= 60)
			grade = "D";
		else
			grade = "F";
		if(score >= 70)
			grade = "C";
		if (score >= 80)
			grade = "B";
		if(score >= 90)
			grade = "A";
		*/
		/*	중첩 if문, String에 +연상 이용
		if(score >= 60)
			grade = "D";	
		else
			grade = "F";
		if(score >= 70)
			grade = "C";
		if (score >= 80)
			grade = "B";
		if(score >= 90) {
			grade = "A";
			if(score >= 95)
				grade += "+";
		}
		*/
		
		//삼항연산자 
		grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		//생각하는 습관. 매우 중요.
	}

}
