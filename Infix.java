import java.util.*;

public class Infix{

    public static void main(String[] args){

        String str="9-(5+3)*4/6";
         
        Stack<Integer> val= new Stack<>();
        Stack<Character> op= new Stack<>();
        //separating the variables with operators
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            //0--> 48 and 9-->57
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);   //we are subtracting 48 because we want to push the operands and not numbers between 48 & 57 
             }
             else if(op.isEmpty() || ch=='(' || op.peek()=='('){
                op.push(ch);
             }else if(ch==')'){
                while(op.peek()!='('){
                     int v2= val.pop();
                    int v1= val.pop();
                    switch (op.peek()) {
                        case '-':
                            val.push(v1 - v2);
                            break;
                        case '+':
                            val.push(v1 + v2);
                            break;
                        case '*':
                            val.push(v1 * v2);
                            break;
                        case '/':
                            val.push(v1 / v2);
                            break;
                    }
                      op.pop();
                }
                op.pop();
             }
             else 
             {
                if(ch=='+' || ch=='-'){
                    int v2= val.pop();
                    int v1= val.pop();
                    switch (op.peek()) {
                        case '-':
                            val.push(v1 - v2);
                            break;
                        case '+':
                            val.push(v1 + v2);
                            break;
                        case '*':
                            val.push(v1 * v2);
                            break;
                        case '/':
                            val.push(v1 / v2);
                            break;
                    }
                      op.pop();
                    //push
                    op.push(ch);
                }else 
                 if(ch=='*' || ch=='/'){
                    
                      if(op.peek()=='*' || op.peek()=='/'){
                         int v2= val.pop();
                         int v1= val.pop();
                         if(op.peek()=='*')  val.push(v2*v1);
                        if(op.peek()=='/')  val.push(v1/v2);
                        op.pop();
                        //push
                        op.push(ch);
                      }else
                       op.push(ch);

                 }
             }
        }

        while(val.size()>1){
                    int v2= val.pop();
                    int v1= val.pop();
                  switch (op.peek()) {
                        case '-':
                            val.push(v1 - v2);
                            break;
                        case '+':
                            val.push(v1 + v2);
                            break;
                        case '*':
                            val.push(v1 * v2);
                            break;
                        case '/':
                            val.push(v1 / v2);
                            break;
                  }
                      op.pop();
        }
        System.out.println(val.peek());
    }
}