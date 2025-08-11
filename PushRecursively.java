import java.util.Stack;

public class PushRecursively {

    public static void PushAtBottom(Stack<Integer> st){
        if(st.size()==0){
            st.push(7);
            return;
        }
        int top=st.pop();
        PushAtBottom(st);
        st.push(top);
    }
    
     public static void main(String[] args) {
         Stack<Integer> st= new Stack<>();
        st.push(21);
        st.push(1);
        st.push(13);
        st.push(17);
        st.push(87);

        PushAtBottom(st);
        System.out.println(st);
     }
}
