package Data_Structures.Queues.queues_linked_lists;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(){
        first = null;
        last = null;
        length = 0;
    }

    public class Node{
        String value;
        Node next;

        public Node(String value){
            this.value = value;
            this.next = null;
        }
    }

    public String peek(){
        if (this.length > 0){
            return first.value;
        }
        else {
        return null;
        }
    }

    public void enqueue(String value){
         Node newNode = new Node(value);
         if(this.length == 0){
             this.first = newNode;
         }else{
             this.last.next = newNode;
         }
         this.last = newNode;
         this.length++;
    }

    public void dequeue(){
        if(this.length >0){
            this.first = this.first.next;
            if(this.length == 1){
                this.last = null;
            }
            this.length--;
        }
    }
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue("Danny");
        myQueue.enqueue("Leanh");

        myQueue.dequeue();
        System.out.println(myQueue.peek());

        System.out.println(myQueue.length);
    }
}
