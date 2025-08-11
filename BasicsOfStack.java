
import java.util.*;

public class BasicsOfStack{

     public static void main(String[] args) {
        
        Stack<Integer> st= new Stack<>();

        //to add element in stack 

        st.push(5);
        st.push(15);
        st.push(10);
        st.push(13);
        st.push(2);

        //peek
 
        System.out.println(st.peek());

        // to print all the elements of the stack

        System.out.print(st);    //[5, 15, 10, 13, 2]

        //using pop()

        st.pop();   //this will remove the top most element from the stack

        //stack after removing the top most element

        System.out.println(st);     //[5, 15, 10, 13]-- the last pushed element is removed from the stack


        //to determine the size of stack
       System.out.println(st.size());    //4

       //to check if the stack is empty or not

       System.out.println(st.isEmpty());    //returns true if the stack is empty and false if stack is not empty

     }

}
