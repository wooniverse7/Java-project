
public class Source5_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int row = 2;
		while(row < 10) {
			int column = 1;
			while(column < 10) {
				System.out.printf("%4d", row * column);
				column++;
			}
			System.out.println();
			row++;
		}
		*/	
	
			
		//for������ �ٲٱ�
		name: for(int i = 2; i < 10; i++) {	//���̺� ����
			for (int j = 1; j < 10; j++) {
				System.out.printf("%4d", i * j);
				continue;
				}
		System.out.println();
		}

	}

}
