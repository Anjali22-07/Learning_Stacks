import java.util.Stack;

public class DisplayStack {

    public static void main(String[] args) {
        
         Stack<Integer> st= new Stack<>();
        st.push(21);
        st.push(1);
        st.push(13);
        st.push(17);
        st.push(87);

       // System.out.println(st);
    //     Stack<Integer> rt= new Stack<>();

    //     while(st.size()>0){
    //         rt.push(st.pop());
    //     }

    //     //re entering the elements back in st while printing as well

    //     while(rt.size()>0){
           
    //         int x=rt.pop();
    //         System.out.print(x+" ");
    //         st.push(x);

    //        // st.push(rt.pop());
    //         //prints the element being entered in the stack
    //        //  System.out.println(st+" ");  //[21] [21, 1] [21, 1, 13] [21, 1, 13, 17] [21, 1, 13, 17, 87] 

    //     }
        
    //     System.out.println(st);
        

    //using ARRAYS

    int n= st.size();
    int[] arr= new int[n];
    for(int i=n-1;i>=0;i--){
        arr[i]=st.pop();
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        st.push(arr[i]);
    }
     System.out.println(st);
     }

    
}
