//���⿡ ����б� Ŭ������ ���б� Ŭ���� �߰��ؼ� �ϸ� �ɵ�

public class Print {

	public static void main(String[] args) {
		// ����б��� ���б� Ŭ���� ���� �迭�� �ֱ�
		Grade[] grade = {new Middle()};
		
		for(Grade g : grade) {
			g.setGrade();
			g.getGrade();
			
		}
	}
}
