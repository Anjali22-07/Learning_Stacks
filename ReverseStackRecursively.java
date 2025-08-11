import java.util.Stack;

public class ReverseStackRecursively {


    public static void PushAtBottom(Stack<Integer> st,int idx){

        if(st.size()==0) {
            st.push(idx);
            return;
        }
        int top=st.pop();
        PushAtBottom(st,idx);
        st.push(top);
    }

    public static void ReverseRecursively(Stack<Integer> st){

        if(st.size()==1)  return;

        int top=st.pop();
        ReverseRecursively(st);
        PushAtBottom(st, top);
       
    }

    public static void main(String[] args) {
         Stack<Integer> st= new Stack<>();
        st.push(21);
        st.push(1);
        st.push(13);
        st.push(17);
        st.push(87);

       System.out.println(st);
       ReverseRecursively(st);
    //   PushAtBottom(st,67);
        System.out.println(st);
     }
    
    
}
