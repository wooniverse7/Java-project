class Circle{
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	double findArea() {
		return 3.14 * radius * radius;	//static�� ���̸� static�� ���� �ֵ鸸 �� �� �ִ�.
	}
	void show(double x, double y) {
		System.out.printf("������ = %.1f, ���� = %.1f\n", x, y);
	}
	Circle(double radius){
		this.radius = radius;	//������ �̸��� �Ȱ��� ��, �ʵ带 ȣ���� ��.
		//���� ���� �ٲ���. this = ������ �ڱ��ڽ��� �ּҰ�
	}

}

public class Src04_29p {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(10);
		c.setRadius = 10;	
		c.show(c.radius,c.findArea());
	}

}
