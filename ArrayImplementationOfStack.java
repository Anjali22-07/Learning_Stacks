public class ArrayImplementationOfStack {
    
     public static class Stack{

         private int[] arr=new int[6];
          private int idx=0;  // tracks the index of the array

          void push(int x){
               if(isFull())  {
                    System.out.println("Stack is full");
                    return ;
               }
               arr[idx]=x;
               idx++;
          }

          int peek(){
               if(idx==0){
                    System.out.println("Stack is Empty");
                    return -1;
               }
               else 
                   return arr[idx-1];
          }

          int pop(){
               //Arrays in java have 0 as their default values

               if(idx==0){
                    System.out.println("Stack is Empty");
                    return -1;
               }
               else {
                 int top = arr[idx-1];
                  arr[idx-1]=0;
                  idx--;
                  return top;
               }
          }

          void display(){
               for(int i=0;i<idx;i++){
                    System.out.println(arr[i]);
               }
               System.out.println();
          }

          int size(){
               if(idx==0){
                    System.out.println("Stack is Empty");
                    return 0;
               }
               else 
               return idx;
          }

          boolean isEmpty(){
               if(size()==0){
                 return true;
               }
               else 
               return false;
          }

          boolean isFull(){
               if(idx==arr.length){
                    return true;
               }
               else 
               return false;
          }

     }
    public static void main(String[] args) {
         Stack st= new Stack();
         st.push(4);
         st.push(5);
         st.push(1);
         st.display();
       //  System.out.println(st);
         System.out.println(st.size());
         st.pop();
          st.display();

        
       
       // System.out.println(st);
     }
    
}
