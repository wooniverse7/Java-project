import javax.swing.JOptionPane;

public class Middle implements Grade {
	//필드에 private 다 붙이기
	private String math;
	private String english;
	private String science;
	
	@Override
	public void setGrade() {
		// TODO Auto-generated method stub
		math = JOptionPane.showInputDialog("수학점수를 입력하세요.");
		english = JOptionPane.showInputDialog("영어점수를 입력하세요.");
		science = JOptionPane.showInputDialog("과학점수를 입력하세요.");
	}

	@Override
	public void getGrade() {
		// 형식에 맞게 출력
		System.out.println("수학 점수 : " + math);
		System.out.println("영어 점수 : " + english);
		System.out.println("과학 점수 : " + science);
	}

	//setter, getter 기본적이나 여기서는 무쓸모
	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}

}
