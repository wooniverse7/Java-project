import java.util.Scanner;

public class Source3_IFelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("������ �Է��ϼ��� : ");
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
		
	//���� if���� ���� 93�� �Է��ϸ� grade�� ��� ����Ǿ� D�ϳ��� ��µȴ�.
	//if������ ���� ������ ������ �ҷ��� ������ 10������ �����߰ڴ�.
	//������ �ٲٸ� �ȴ�.				
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
		/*	��ø if��, String�� +���� �̿�
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
		
		//���׿����� 
		grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
		
		System.out.println("����� ������ " + grade + "�Դϴ�.");
		//�����ϴ� ����. �ſ� �߿�.
	}

}
