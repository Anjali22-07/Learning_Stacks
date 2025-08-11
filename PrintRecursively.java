import java.util.Stack;

public class PrintRecursively {

    public static void Printing(Stack<Integer> s){   //stack has pass by reference--i.e. the address of the original stack is passed and not the copy of the stack is created!
        //s.push(6);
        
        //printing the elements in the reverse order from stack

        //Base case
         if(s.size()==0)  return;
        int top=s.pop();
        System.out.print(top+" ");
        Printing(s);
        s.push(top);       
    }

    public static void Display(Stack<Integer> s){
        //displaying the values of stack using recursion --not recursive

        //Base case

        if(s.size()==0)  return;

        //recursive work
        int top = s.pop();
        Display(s);
        System.out.print(top+" ");
        s.push(top);
    }


    public static void main(String[] args) {
         Stack<Integer> st= new Stack<>();
        st.push(21);
        st.push(1);
        st.push(13);
        st.push(17);
        st.push(87);
        System.out.println(st);   //[21, 1, 13, 17, 87]
        Printing(st);
      //  System.out.println(st);    //[21, 1, 13, 17, 87, 6]
      System.out.println();
      Display(st);
    }
    
}
