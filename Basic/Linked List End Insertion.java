class Solution{
    public Node insertAtEnd(Node head,int x){
        Node n=new Node(x);
        if(head==null)
            return n;
        Node t=head;
        while(t.next!=null)
            t=t.next;
            t.next=n;
        return head;
    }
}