import java.util.Stack;

public class DeleteAtBottom {

    //Iteratively
    
    // public static void PopAtBottom(Stack<Integer> s){

    //     Stack<Integer> rt= new Stack<>();

    //     while(s.size()>0){
    //         rt.push(s.pop());
    //     }
    //     rt.pop();
    //     while(rt.size()>0){
    //         s.push(rt.pop());
    //     }

    // }

    //Recursively

    public static void PopRecursively(Stack<Integer> st, int idx){

        //Base case
         if(st.size()==idx){
            st.pop();
            return;

         }
         int top=st.pop();
         PopRecursively(st,idx);
         st.push(top);
        }

      public static void main(String[] args) {
         Stack<Integer> st= new Stack<>();
        st.push(21);
        st.push(1);
        st.push(13);
        st.push(17);
        st.push(87);

       // PopAtBottom(st);
       PopRecursively(st,2);
        System.out.println(st);
     }

}
