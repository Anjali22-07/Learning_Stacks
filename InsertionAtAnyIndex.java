import java.util.*;

public class InsertionAtAnyIndex {
    
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(21);
        st.push(1);
        st.push(13);
        st.push(17);
        st.push(87);

        System.out.println(st);
        Stack<Integer> rt= new Stack<>();

        //inserting an element at index 1 of 0-based indexing
        while(st.size()>3){

            rt.push(st.pop());
        }

        st.push(2);
        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);
        
    }
}
