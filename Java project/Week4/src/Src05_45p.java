class Circle2{
	double r;
	static int numOfCircles = 0;
	int numCircles = 0;
	
	public Circle2(double r) {
		this.r = r;
		numOfCircles++;
		numCircles++;
	}
}

public class Src05_45p {
	
	public static void main(String[] args) {
		Circle2 myCircle = new Circle2(10.0);
		Circle2 yourCircle = new Circle2(5.0);
		
		System.out.println("���� ���� : " + Circle2.numOfCircles);
		System.out.println("���� ���� : " + yourCircle.numCircles);
	}
	
	void print() {
		System.out.println("�ν��Ͻ� �޼����Դϴ�.");
	}
}
\