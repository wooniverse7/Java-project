
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
			System.out.println("�߸��� ���Դϴ�.");
			break;
			
		
		}
		System.out.println("2�� ���� " + numDays + "���Դϴ�.");		
		*/
		
		//Switch�� if������ �ٲٱ�
		String english = "even";
		
		/*
		switch (english) {
		case "odd":
			System.out.println("Ȧ���Դϴ�.");
			break;
		case "even":
			System.out.println("¦���Դϴ�.");
			break;
		default:
			System.out.println("¦���� Ȧ���� �ƴմϴ�.");
		}
		*/
		
		if(english.equals("odd"))	//String �� �ż���
			System.out.println("Ȧ���Դϴ�.");
		else if(english == "even")
			System.out.println("¦���Դϴ�.");
		else
			System.out.println("¦���� Ȧ���� �ƴմϴ�.");
		
	}
}


