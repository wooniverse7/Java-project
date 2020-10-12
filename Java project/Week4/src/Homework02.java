//¼º°ø
import javax.swing.JOptionPane;

class Calculator{
	String op="";
	String bufOp="";
	String showData="0";
	boolean set=false;
	int CalNum =0;
	
	void run() {
		while(true) {
			op=JOptionPane.showInputDialog(showData);
			if(op.equals("exit"))
				break;
			else if((op.equals("*"))||(op.equals("+"))||(op.equals("-"))||(op.equals("/"))||(op.equals("%"))||(op.equals("="))) {
				set=true;
				if(bufOp.equals(""))
					CalNum=Integer.parseInt(showData);
				else if(bufOp.equals("*"))
					CalNum=CalNum*Integer.parseInt(showData);
				else if(bufOp.equals("-"))
					CalNum=CalNum-Integer.parseInt(showData);
				else if(bufOp.equals("+"))
					CalNum=CalNum-Integer.parseInt(showData);
				else if(bufOp.equals("/"))
					CalNum=CalNum-Integer.parseInt(showData);
				else if(bufOp.equals("%"))
					CalNum=CalNum-Integer.parseInt(showData);
				showData=""+CalNum;
				bufOp=op;
			}
			else {
				if((showData.equals("0"))||(set=true))
					showData=""+op;
				else
					showData=showData+op;
				set=false;
			}
				
		}
	}
}

public class Homework02{
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.run();
	}
}