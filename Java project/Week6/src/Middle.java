import javax.swing.JOptionPane;

public class Middle implements Grade {
	//�ʵ忡 private �� ���̱�
	private String math;
	private String english;
	private String science;
	
	@Override
	public void setGrade() {
		// TODO Auto-generated method stub
		math = JOptionPane.showInputDialog("���������� �Է��ϼ���.");
		english = JOptionPane.showInputDialog("���������� �Է��ϼ���.");
		science = JOptionPane.showInputDialog("���������� �Է��ϼ���.");
	}

	@Override
	public void getGrade() {
		// ���Ŀ� �°� ���
		System.out.println("���� ���� : " + math);
		System.out.println("���� ���� : " + english);
		System.out.println("���� ���� : " + science);
	}

	//setter, getter �⺻���̳� ���⼭�� ������
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
