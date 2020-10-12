import javax.swing.JOptionPane;

class Calculator{
	String op = ""; //다이얼로그 박스에 값을 저장할 변수
	String bufOp = ""; //연산자 입력값을 저장할 변수
	String showData = "0";//다이얼로그 박스에 보여질 값. 계산기 처음 실행시 "0"
	boolean set=false;//바로전에 입력 받은 것이 숫자인지 연산자인지 알기위한 변수, 연산자는 t, 숫자 f
	int CalNum = 0;//계산이 이루어진 값을 저장할 임시변수, 계산은 숫자로 이루어져야 하므로, double형으로 바꾸면 소숫점까지 계산이 됨.
	
	void run() {
		while(true) { 
			op=JOptionPane.showInputDialog(showData); //입력 받기
			if(op.equals("exit"))	//입력이 exit일 때.
				break;//탈출
			//연산자일 경우
			else if((op.equals("*"))||(op.equals("+"))||(op.equals("-"))||(op.equals("/"))||(op.equals("%"))||(op.equals("="))) {
				set=true;	//입력받은 것을 연산자라고 표시, 다음번에 입력받을 때 이용
				if(bufOp.equals(""))
					CalNum=Integer.parseInt(showData);	//입력받은게 없을 때 그냥 표시
				else if(bufOp.equals("*"))
					CalNum=CalNum*Integer.parseInt(showData);
				else if(bufOp.equals("-"))
					CalNum=CalNum-Integer.parseInt(showData);
				else if(bufOp.equals("+"))
					CalNum=CalNum+Integer.parseInt(showData);
				else if(bufOp.equals("/"))	//나누기
					CalNum=CalNum/Integer.parseInt(showData);
				else if(bufOp.equals("%"))	//나머지
					CalNum=CalNum%Integer.parseInt(showData);
				showData =""+CalNum;	//계산된 값을 showData에 넣는다
				bufOp=op;	//현재 입력받은 연산자를 연산자 buf에 넣는다(현재 계산값을 이전 계산값에 업데이트해줌)
			}
			else {	
				if((showData.equals("0"))||(set=true))
					showData = ""+op;	//0을 입력할 때는 0을 지우고 입력 05 -> 5
				else
					showData=showData+op;	//숫자 붙임 기능
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
