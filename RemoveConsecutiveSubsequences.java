
import java.util.*;

public class RemoveConsecutiveSubsequences {

    public static int[] removeSubsequence(int[] arr){

        Stack<Integer> st= new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
           
            if(st.isEmpty()|| st.peek()!=arr[i])   st.push(arr[i]);
          else  if(st.peek()==arr[i]){
                if(i==n-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
            int r= st.size();
            int[] res= new int[n];
            for(int i=r-1;i>=0;i--){

                res[i]=st.pop();
                
            }
           
           
        
return res;

    }


    public static void main(String[] args) {
        int[] arr= {1,2,2,3,10,10,10,4,4,4,5,7,7};
       int[] arr1= removeSubsequence(arr);
       System.out.println("The new array after removing the consecutive subsequence:");
       for(int i=0;i<arr1.length;i++){

          System.out.print(arr1[i]+" ");
       }

        
    }
    
}
