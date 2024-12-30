package btvn02;

public class Queue {
        private Node front;
        private Node rear;
        private int length;
        
        public Queue(){
            front = null;
            rear = null;
            length = 0;
        }
        
        public int getLength(){
            return length;
        }
        
        public int isEmpty(){
            return length=0;
        }
        
        public void enQueue(int data){
            Node newNode = new Node(data);
            if(length==0) {
                front=newNode;
                rear=newNode;
            }
            else{
                rear.next=newNode;
            }
            rear=newNode;
            length++;
        }
        
        public void deQueue(){
            int a=front.getData();
            if(length==0) {
                return;
            }           
            else{
                front=front.next;
            }
            length--;
            System.out.println("Data of removed element: " +a);
        }
        
        public void display(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.getData());
            temp=temp.next;
            if(temp!=null) System.out.print(" -> ");
            else System.out.println("");
        }
    }
    
}