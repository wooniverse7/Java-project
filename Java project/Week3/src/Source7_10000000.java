
public class Source7_10000000 {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		//합을 구하는 프로그래을 작성
		long sum = 0;
		
		int num = 10000000;
		sum = (long)(num+1)*(num/2);	//형변환을 해줘야 한다.
			
		long endTime=System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(endTime-startTime);
		
		//우성일
	}

}
