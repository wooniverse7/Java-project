import java.util.Scanner;

public class Project_W3 {

	public static void main(String[] argS) {
		
		while(true) {
			//������ ��� �ޱ� ���� while�� �ȿ� �Է¹޴� ���� ����
		Scanner in = new Scanner(System.in);
		System.out.print("���� : ");
		String Q = in.next();
				
		if(Q.equals("��Ծ���?"))
			System.out.println("�ƴ�.");
		else if(Q.equals("�����?"))
			System.out.println("����.");
		else if(Q.equals("������?"))
			System.out.println("Not bad.");
		else if(Q.equals("��߾�?"))
			System.out.println("��ħ�� ����.");
		else if(Q.equals("����?"))
			System.out.println("���̾�.");
		else if(Q.equals("Exit"))	//���� ������ ���������� ���� break;
			break;
		//���� ���̽��� ��� else�� ó��
		else
			System.out.println("�ռҸ���.");	
		
		}

	}
}

