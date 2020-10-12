
public class Source4_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int month = 2;
		int year = 2016;
		int numDays = 0;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
				numDays = 29;
			else
				numDays = 28;
			break;
		default:
			System.out.println("잘못된 달입니다.");
			break;
			
		
		}
		System.out.println("2월 달은 " + numDays + "일입니다.");		
		*/
		
		//Switch를 if문으로 바꾸기
		String english = "even";
		
		/*
		switch (english) {
		case "odd":
			System.out.println("홀수입니다.");
			break;
		case "even":
			System.out.println("짝수입니다.");
			break;
		default:
			System.out.println("짝수도 홀수도 아닙니다.");
		}
		*/
		
		if(english.equals("odd"))	//String 비교 매서드
			System.out.println("홀수입니다.");
		else if(english == "even")
			System.out.println("짝수입니다.");
		else
			System.out.println("짝수도 홀수도 아닙니다.");
		
	}
}


