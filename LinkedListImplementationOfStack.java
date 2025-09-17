public class LinkedListImplementationOfStack {
    
    public static class Node{   //user defined data type
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class Stack{   //user defined data structure

        Node head= null;
        int size=0;

        void push(int x){
            Node temp = new Node(x);
            temp.next=head;     //the next of the new node (temp) point to the current head of the linked list.
            head=temp;          //the head pointer of the linked list to point to the new node (temp).
            size++;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return 0;
            }
            else 
            {
            int top= head.data;
            return top ;
            }        
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return 0;
            }
            else {
                int top= head.data;
                head=head.next;
                size--;
                return top;
            }
        }

        int Size(){
            if(size==0){
                System.out.println("Stack is Empty");
                return 0;
            }
           return size;
        }

        boolean isEmpty(){
            if(size==0)  return true;
            else
             return false;
        }

        void DisplayRec(Node head){
            Node temp=head;
            if(temp==null)   return;
           
            DisplayRec(temp.next);
             System.out.println(temp.data);
        }

        void Display(){
          // Node temp=head;
           if(head==null){
            System.out.println("Stack is Empty");
            return;

           }
          // System.out.println(temp.val);
            DisplayRec(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.Display();
         System.out.println(st.Size());
        System.out.println();

        st.pop();
        st.pop();
        st.pop();
        st.Display();
        System.out.println(st.peek());
        System.out.println(st.Size());

    }
}
