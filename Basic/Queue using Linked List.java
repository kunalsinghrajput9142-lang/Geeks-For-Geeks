class myQueue{
    class Node{
        int data;
        Node next;
        Node(int x){data=x;}
    }
    Node front,rear;
    int size=0;
    void enqueue(int x){
        Node n=new Node(x);
        if (rear==null)front=rear=n;
        else rear=rear.next=n;
        size++;
    }
    void dequeue(){
        if(front!=null){
            front=front.next;
            if(front==null)rear=null;
            size--;
        }
    }
    int getFront(){
        return front==null?-1:front.data;
    }
    boolean isEmpty(){
        return front==null;
    }
    int size(){
        return size;
    }
}
