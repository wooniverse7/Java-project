class Circle{
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	double findArea() {
		return 3.14 * radius * radius;	//static을 붙이면 static이 붙은 애들만 쓸 수 있다.
	}
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
	Circle(double radius){
		this.radius = radius;	//변수의 이름이 똑같을 때, 필드를 호출해 줌.
		//위의 값을 바꿔줌. this = 생성된 자기자신의 주소값
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
