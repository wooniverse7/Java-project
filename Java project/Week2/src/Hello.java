import java.util.Scanner;

public class Hello {
	//static int radius, Radius;	//static을 쓰면 초기화를 안해줘도 실행은 된다.(기본값 0 출력)
	public static void main(String[] args) {
		
		/*두번째 예제
		 * int i; double d; byte b;
		 * 
		 * i = 7 / 4; System.out.println(i); d = 7 / 4; System.out.println(d); d = 7 /
		 * (double) 4; System.out.println(d);
		 * 
		 * i = 300; if ( i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
		 * System.out.println("byte 타입으로 변환할 수 없습니다."); else b = (byte) i;
		 */
		
		/*
		 * byte b = 127; //b = b + 1; 정수 1을 더해서 int타입으로 자동 형변환되서 에러 b = (byte)(b + 1);
		 * //-128출력
		 */		
		
		/*
		 * int i = 97; String s = "Java"; double f = 3.14f; System.out.printf("%d\n",
		 * i); System.out.printf("%o\n", i); System.out.printf("%x\n", i);
		 * System.out.printf("%c\n", i); System.out.printf("%5d\n", i);
		 * System.out.printf("%05d\n", i); System.out.printf("%s\n", s);
		 * System.out.printf("%5s\n", s); System.out.printf("%-5s\n", s);
		 * System.out.printf("%f\n", f); System.out.printf("%e\n", f);
		 * System.out.printf("%4.1\n", f); System.out.printf("%04.1\n", f);
		 * System.out.printf("%-4.1\n", f);
		 */
		
		/* 자신이 친 문자 출력
		 * //Scanner Class Scanner in = new Scanner(System.in); int x = in.nextInt();
		 * int y = in.nextInt(); System.out.printf("%d * %d은(는) %d입니다\n", x, y, x * y);
		 * 
		 * String str = ""; str = in.next(); System.out.println(str);
		 */
		
		//자신이 친 문자열 출력
		//String s1 = "";
		/*	String은 아무거나 붙여도 한묶음으로 String이 된다.
		 * String s1 = "A" + "B"; s1 = s1 + 7; System.out.println(s1);
		 */
		
		/* OR연산자
		 * int x = 0, y = 1; System.out.println((x<1) || (y-- < 1));
		 * System.out.println("x = " + x + ", y = " + y);
		 * 
		 * x = 0; y = 1; System.out.println((x<1) | (y-- < 1));
		 * System.out.println("x = " + x + ", y = " + y);
		 */
		
		/* 비트 연산자
		 * System.out.printf("%x\n", 0b0101 & 0b0011); System.out.printf("%x\n", 0b0101
		 * | 0b0011); System.out.printf("%x\n", 0b0101 ^ 0b0011);
		 * System.out.printf("%x\n", (byte) ~0b000000011); System.out.printf("%x\n",
		 * 0b0110 >> 2); System.out.printf("%x\n", 0b0110 << 2);
		 */
		
		/* 단순 산수
		 * int x = 10; int y = 5; System.out.println(-x + 3); System.out.println(x + 3 *
		 * y); System.out.println(x + 3 > y - 2); System.out.println(x > 3 && x < 5);
		 * int result = x + y * 3; System.out.println(result); System.out.println(x < -1
		 * || x > 3 && x < 5);
		 */
		
		/*
		 * char a = 'A'; int aa = a; a = (char)(aa+1)
		 */;
		
		//연습문제
		int num = 456;
		System.out.println(num - num%100);
		
	}

}
