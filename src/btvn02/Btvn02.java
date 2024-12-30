package btvn02;

public class Btvn02 {
    private Node head;
    
        public void addFirst(int data){
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
    }
        
        public int length(){
            int count;
            if(head==null) return 0;
            else count=1;
            Node temp = head;
            while(temp.next!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        
        public int deleteFirst(){
        if(head==null) return 0;
        else{
//            Node temp = head;
//            head = null;
//            head=temp.next;
            Node temp = head;
            head = head.next;
            return temp.getData();
        }
    }
        
          public int deleteLast(){
//        if(head==null) return;
        if(head.next==null) deleteFirst();
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        Node deleted = temp;
        prev.next=null;
        return deleted.getData();
//        prev.next=null;
    }
    
        public int delete(int index){
          if(index==0){
              return deleteFirst();
          }
          if(index==length()-1){
              return deleteLast();
          }
          int count=1;
          Node temp=head;
          while(count!=index){
              count++;
              temp=temp.next;
          }
          Node deleted = temp.next;
          temp.next=temp.next.next;
          return deleted.getData();
    }
        
        public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.getData());
            temp=temp.next;
            if(temp!=null) System.out.print(" -> ");
            else System.out.println("");
        }
    }

        public static void main(String[] args) {
          System.out.println("Linked List: ");
          Btvn02 l3 = new Btvn02();
          l3.addFirst(5);
          l3.addFirst(4);
          l3.addFirst(3);
          l3.addFirst(2);
          l3.addFirst(1);
          l3.display();
          System.out.println("Removed Last: ");
          System.out.println(l3.deleteLast());
          l3.display();
          System.out.println("Removed First: ");
          System.out.println(l3.deleteFirst());
          l3.display();
          System.out.println("Removed by index: ");
            System.out.println(l3.delete(0));
          
            System.out.println("");
            System.out.println("Stack: ");
            Stack stack = new Stack();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.display();
            stack.pop();
            stack.display();

            System.out.println("");
            System.out.println("Queue: ");
            Queue queue = new Queue();
            queue.enQueue(1);
            queue.enQueue(2);
            queue.enQueue(3);
            queue.enQueue(4);
            queue.enQueue(5);
            queue.display();
            queue.deQueue();
            queue.display();
        }

    }
