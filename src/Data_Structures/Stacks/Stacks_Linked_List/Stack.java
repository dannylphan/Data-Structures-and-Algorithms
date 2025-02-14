package Data_Structures.Stacks.Stacks_Linked_List;

public class Stack {
    private Node top;
    private Node bottom;
    private int length;

    public Stack(){
        top = null;
        bottom = null;
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
        return top.value;
    }

    public void push(String value){
        Node newNode = new Node(value);
        if(length == 0){
            top = newNode;
            bottom = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        this.length++;
    }

    public void pop(){
        if(length > 0) {
            top = top.next;
            if (length == 1) {
                bottom = null;
            }
            length--;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public String getLastElement() {
        if (length > 0) {
            return bottom.value;
        }
        return null;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push("Google");
        myStack.push("Udemy");
        myStack.push("Discord");
        myStack.pop();

        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.getLastElement());
    }
}
