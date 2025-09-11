import java.util.*;

public class Prefix_Evaluation {
    
    public static void main(String[] args) {
        
        String str= "-9/*+5346";
        Stack<Integer> val= new Stack<>();
        for(int i=str.length()-1; i>=0;i--){
            char ch= str.charAt(i);
            int ascii= (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }else {
                int v2= val.pop();
                int v1= val.pop();
                switch(ch){

                    case '-' : val.push(v2-v1);
                               break;
                    case '+' : val.push(v2+v1);
                                break;
                    case '*' : val.push(v2*v1);
                                break;
                    case '/' : val.push(v2/v1);
                                break;
                }
            }
        }
        System.out.println(val.peek());

    }
}
