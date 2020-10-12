//여기에 고등학교 클래스와 대학교 클래스 추가해서 하면 될듯

public class Print {

	public static void main(String[] args) {
		// 고등학교와 대학교 클래스 만들어서 배열에 넣기
		Grade[] grade = {new Middle()};
		
		for(Grade g : grade) {
			g.setGrade();
			g.getGrade();
			
		}
	}
}
