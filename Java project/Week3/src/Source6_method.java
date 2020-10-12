
public class Source6_method {
	public static void main(String[] args) {
		sum(1, 10);
		sum(1, 100);
		sum(1, 1000);
	}
	
	// 자료형 매서드이름  (매변수) {매서드 내용}
	//public static은 접근 제어자이다.
	public static void sum(int i1, int i2) {
		int sum = 0;
		for(int i = i1; i <= i2; i++)
			sum += i;
		
		//sum(i1, i2)가 아니라 그냥 +sum
		System.out.println("합(" + i1 + "~" + i2 + ") : " + sum);
		
		//return sum;
	}
	
	//System.out.println 문장도 처리하는 메서드 만들기
	
	
}
