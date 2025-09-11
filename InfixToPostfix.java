import java.util.*;
public class InfixToPostfix {
    
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        System.out.println(str);
        Stack<String> val= new Stack<>();
        Stack<Character> op= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            int ascii=(int)ch; 
            if(ascii>=48 && ascii<=57){
                String s=""+ch;
                val.push(s);
            }
            else if(op.isEmpty() || ch=='(' || op.peek()=='('){
                 op.push(ch);
            }else if(ch==')'){
                while(op.peek()!='('){
                      String v1=val.pop();
                      String v2=val.pop();
                      char x= op.pop();
                       String t=v2+v1+x;
                       val.push(t);
                }
                op.pop();
            }else{
                if(ch=='-' || ch=='+'){
                    String v1=val.pop();
                      String v2=val.pop();
                      char x= op.pop();
                       String t=v2+v1+x;
                       val.push(t);
                       //push
                       op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                    String v1=val.pop();
                      String v2=val.pop();
                      char x= op.pop();
                       String t=v2+v1+x;
                       val.push(t);
                       //push
                       op.push(ch);

                    }else op.push(ch);
                }
            }
        }

        while(val.size()>1){
            String v1=val.pop();
            String v2=val.pop();
            char x= op.pop();
            String t=v2+v1+x;
            val.push(t);
      }
        System.out.println(val.peek());
    }
}
