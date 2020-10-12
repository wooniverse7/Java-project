import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Src06_project {

    private String input = null;
    private int preVal = 0;
    private char ope;
    private int nextVal = 0;
    private int res = 0;
    
    public Src06_project(){
        this.input = JOptionPane.showInputDialog("계산식을 입력하세요");
    }
   
    //설명 : 검색된 부호를 기준으로 앞수와 뒷수를 구분하여 저장
     
    public void parsing(){
  
        String oper = ope+"";
        
        //문자열슬라이싱
        StringTokenizer st = new StringTokenizer(input, oper);
        preVal = Integer.parseInt( st.nextToken() );
        nextVal = Integer.parseInt( st.nextToken() );
    }
    
    
     //설명 : 입력식에서 부호를 검색
     //방법 : 검색시 문자 단위별로 검색하여 정수 범위 밖이면 부호로 간주
    
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
     
     // 설명 : 계산
     
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
            JOptionPane.showMessageDialog(null, "error : 입력오류");
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