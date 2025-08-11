import java.util.*;

public class MoveStackInSameOrder {

    public static void main(String[] args) {
        
        Stack<Integer> st= new Stack<>();
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements you want in the stack");
        n=sc.nextInt();
        //taking inpuy through loops
        System.out.println("Enter the elments:");
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());  //or 
            // int x= sc.nextInt();
            // st.push(x);
        }
        System.out.println(st);    //[23, 12, 3, 45, 65]

        //reverse order 

        //create a new stack where we will be copying the elements 
        Stack<Integer> rt= new Stack<>();

        while(st.size()>0){
            // int x= st.peek();
            // rt.push(x);
            // st.pop();

           rt.push(st.pop());
        }

        System.out.println(rt);    //[65, 45, 3, 12, 23]


        // Now to restore it in the same/original order
        // we use a new stack

        Stack<Integer> gt= new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }

        System.out.println(gt);
    }
    
}
