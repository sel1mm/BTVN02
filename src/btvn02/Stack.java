package btvn02;

public class Stack {
        private Node top;
        private int length;
        
        public Stack(){
            top = null;
            length = 0;
        }
        
        public int getLength(){
            return length;
        }
        
        public int isEmpty(){
            return length=0;
        }
        
        public void push(int data){
            Node newNode = new Node(data);
            newNode.next=top;
            top=newNode;
            length++;
        }
        
        public void pop(){
            int a=top.getData();
            if(length==0) return;
            else{
                top=top.next;
            }
            length--;
            System.out.println("Data of removed element: " +a);
        }
        
        public void display(){
            Node temp = top;
            while(temp!=null){
            System.out.print(temp.getData());
            temp=temp.next;
            if(temp!=null) System.out.print(" -> ");
            else System.out.println("");
        }
    }
}
