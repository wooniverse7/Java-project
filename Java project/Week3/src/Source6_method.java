
public class Source6_method {
	public static void main(String[] args) {
		sum(1, 10);
		sum(1, 100);
		sum(1, 1000);
	}
	
	// �ڷ��� �ż����̸�  (�ź���) {�ż��� ����}
	//public static�� ���� �������̴�.
	public static void sum(int i1, int i2) {
		int sum = 0;
		for(int i = i1; i <= i2; i++)
			sum += i;
		
		//sum(i1, i2)�� �ƴ϶� �׳� +sum
		System.out.println("��(" + i1 + "~" + i2 + ") : " + sum);
		
		//return sum;
	}
	
	//System.out.println ���嵵 ó���ϴ� �޼��� �����
	
	
}
