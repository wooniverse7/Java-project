import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Src06_project {

    private String input = null;
    private int preVal = 0;
    private char ope;
    private int nextVal = 0;
    private int res = 0;
    
    public Src06_project(){
        this.input = JOptionPane.showInputDialog("������ �Է��ϼ���");
    }
   
    //���� : �˻��� ��ȣ�� �������� �ռ��� �޼��� �����Ͽ� ����
     
    public void parsing(){
  
        String oper = ope+"";
        
        //���ڿ������̽�
        StringTokenizer st = new StringTokenizer(input, oper);
        preVal = Integer.parseInt( st.nextToken() );
        nextVal = Integer.parseInt( st.nextToken() );
    }
    
    
     //���� : �Է½Ŀ��� ��ȣ�� �˻�
     //��� : �˻��� ���� �������� �˻��Ͽ� ���� ���� ���̸� ��ȣ�� ����
    
    public void searchOper(){


        for( int i=0 ; i < this.input.length() ; i++){ 
            if ( (this.input.charAt(i)>=48) && (this.input.charAt(i)<=57) ){
                continue;
            } else {
                ope=this.input.charAt(i);
                break;
            }
        }
    }
     
     // ���� : ���
     
    public void calculation(){

        if(ope=='+'){
            res = preVal + nextVal;
        }else if(ope=='-'){
            res = preVal - nextVal;
        }else if(ope=='/'){
            res = preVal / nextVal;
        }else if(ope=='*'){
            res = preVal * nextVal;
        }else if(ope=='%'){
            res = preVal % nextVal;
        }else{
            JOptionPane.showMessageDialog(null, "error : �Է¿���");
        }
        JOptionPane.showInputDialog(null, res);
    }
 

    public static void main(String[] args) {
  
        Src06_project calculator = new Src06_project();
        calculator.searchOper();
        calculator.parsing();
        calculator.calculation();
    }
}