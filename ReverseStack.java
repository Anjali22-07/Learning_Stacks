import java.util.Stack;

public class ReverseStack {


    public static void ReverseIteratively(Stack<Integer> st){

        //create a stack 

        Stack<Integer> rt= new Stack<>();
        
        while(st.size()>0){
            rt.push(st.pop());
        }
        Stack<Integer> gt= new Stack<>();

        while(rt.size()>0){
            gt.push(rt.pop());

        }
        //now emptying it in the original stack
        while(gt.size()>0){

            st.push(gt.pop());
        }

    }
    public static void main(String[] args) {
         Stack<Integer> st= new Stack<>();
        st.push(21);
        st.push(1);
        st.push(13);
        st.push(17);
        st.push(87);

       // PopAtBottom(st);
       System.out.println(st);
       ReverseIteratively(st);
        System.out.println(st);
     }
    
}
