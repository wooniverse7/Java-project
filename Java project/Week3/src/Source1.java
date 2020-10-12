import java.util.Scanner;

public class Source1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String str = s.next();	//string 입력방법
		char c = s.next().charAt(0);	//char입력 방법, 0번째 idx 반환.
		
		System.out.println(a + str + c);
		
	}

}
