import java.util.Stack;

public class UnderflowOverflow {
    
     public static void main(String[] args) {
         Stack<Integer> st= new Stack<>();
        st.push(21);
        st.push(1);
        st.push(13);
        st.push(17);
        st.push(87);

       System.out.println(st);
       st.pop();
       System.out.println(st);
       st.pop();
       System.out.println(st);
       st.pop();
       System.out.println(st);
       st.pop();
       System.out.println(st);
       st.pop();
       System.out.println(st);
       st.pop();

       //output
       /* [21, 1, 13, 17, 87]
[21, 1, 13, 17]
[21, 1, 13]
[21, 1]
[21]
[]
Exception in thread "main" java.util.EmptyStackException
        at java.base/java.util.Stack.peek(Stack.java:103)
        at java.base/java.util.Stack.pop(Stack.java:85)
        at UnderflowOverflow.main(UnderflowOverflow.java:24)*/

        //Stack Underflow happens when we try to remove an element from a stack that's already empty

        
     }
}
