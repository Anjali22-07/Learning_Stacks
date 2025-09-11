import java.util.*;

public class InfixToPrefix {
 
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        System.out.println(str);
        Stack<String> st= new Stack<>();
        Stack<Character> op= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           int ascii=(int)ch;
           if(ascii>=48 && ascii<=57){
             String s=""+ch;
              st.push(s);
           }
             else if(op.size()==0 || ch=='(' || op.peek()=='('){
                   op.push(ch);
           }else if(ch==')'){
            while(op.peek()!='('){
                String v1= st.pop();
                String v2=st.pop();
                char x=op.pop();
                String t= x+v2+v1;
                st.push(t);
            }
            op.pop();
        }
            else{

                if(ch=='+' || ch=='-'){
                      String v1= st.pop();
                        String v2=st.pop();
                        char x=op.pop();
                        String t= x+v2+v1;
                        st.push(t); 
                        //push()
                        op.push(ch);                                              
            }
              if(ch=='*' || ch=='/'){

                 if(op.peek()=='*' || op.peek()=='/'){
                       String v1= st.pop();
                        String v2=st.pop();
                        char x=op.pop();
                        String t= x+v2+v1;
                        st.push(t); 
                        //push
                        op.push(ch);
                 }else op.push(ch);
              }
                }
            }

                while(st.size()>1){

                        String v1= st.pop();
                        String v2=st.pop();
                        char x=op.pop();
                        String t= x+v2+v1;
                        st.push(t); 
                        //pop op
                      
                }
        System.out.println(st.peek());
            
           }


        
    }
        

