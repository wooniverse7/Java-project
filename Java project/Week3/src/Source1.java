import java.util.Scanner;

public class Source1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String str = s.next();	//string �Է¹��
		char c = s.next().charAt(0);	//char�Է� ���, 0��° idx ��ȯ.
		
		System.out.println(a + str + c);
		
	}

}
