import javax.swing.JOptionPane;

class Calculator{
	String op = ""; //���̾�α� �ڽ��� ���� ������ ����
	String bufOp = ""; //������ �Է°��� ������ ����
	String showData = "0";//���̾�α� �ڽ��� ������ ��. ���� ó�� ����� "0"
	boolean set=false;//�ٷ����� �Է� ���� ���� �������� ���������� �˱����� ����, �����ڴ� t, ���� f
	int CalNum = 0;//����� �̷���� ���� ������ �ӽú���, ����� ���ڷ� �̷������ �ϹǷ�, double������ �ٲٸ� �Ҽ������� ����� ��.
	
	void run() {
		while(true) { 
			op=JOptionPane.showInputDialog(showData); //�Է� �ޱ�
			if(op.equals("exit"))	//�Է��� exit�� ��.
				break;//Ż��
			//�������� ���
			else if((op.equals("*"))||(op.equals("+"))||(op.equals("-"))||(op.equals("/"))||(op.equals("%"))||(op.equals("="))) {
				set=true;	//�Է¹��� ���� �����ڶ�� ǥ��, �������� �Է¹��� �� �̿�
				if(bufOp.equals(""))
					CalNum=Integer.parseInt(showData);	//�Է¹����� ���� �� �׳� ǥ��
				else if(bufOp.equals("*"))
					CalNum=CalNum*Integer.parseInt(showData);
				else if(bufOp.equals("-"))
					CalNum=CalNum-Integer.parseInt(showData);
				else if(bufOp.equals("+"))
					CalNum=CalNum+Integer.parseInt(showData);
				else if(bufOp.equals("/"))	//������
					CalNum=CalNum/Integer.parseInt(showData);
				else if(bufOp.equals("%"))	//������
					CalNum=CalNum%Integer.parseInt(showData);
				showData =""+CalNum;	//���� ���� showData�� �ִ´�
				bufOp=op;	//���� �Է¹��� �����ڸ� ������ buf�� �ִ´�(���� ��갪�� ���� ��갪�� ������Ʈ����)
			}
			else {	
				if((showData.equals("0"))||(set=true))
					showData = ""+op;	//0�� �Է��� ���� 0�� ����� �Է� 05 -> 5
				else
					showData=showData+op;	//���� ���� ���
				set=false;
			}
		}
	}
}

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.run();

	}

}
