
public class Source7_10000000 {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		//���� ���ϴ� ���α׷��� �ۼ�
		long sum = 0;
		
		int num = 10000000;
		sum = (long)(num+1)*(num/2);	//����ȯ�� ����� �Ѵ�.
			
		long endTime=System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(endTime-startTime);
		
		//�켺��
	}

}
