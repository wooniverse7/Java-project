package collec.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionHomework {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ScoreCollection> slist = new ArrayList<ScoreCollection>();
	
		while(true) {
			//3���� ����� ��
			System.out.print("1.�Է�  2.��� 3.���� : ");
			int input = in.nextInt();
			
			//�л��� �̸��� ���� �Է�
			if(input == 1) {
				ScoreCollection st = new ScoreCollection();
				//System.out.println("----------�Է�----------");
				System.out.print("�л��� �̸��� �Է��ϼ��� : ");
				st.setName(in.next());
				System.out.print("�л��� ������ �Է��ϼ��� : ");
				st.setScore(in.nextInt());
			slist.add(st);	//List�� �߰�
			}
			//��� �л��� ���� ���
			else if(input == 2) {
				for(ScoreCollection n : slist) {//�迭 ũ�⸸ŭ �ݺ� �� ��������
			System.out.println(n.getName()+"�� �����"+n.makeGrade()+"�Դϴ�.");	
				}
			}
			//����
			else if(input == 3) {
				System.out.println("�����մϴ�.");
				break;
			}
			//���� ó��
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}
