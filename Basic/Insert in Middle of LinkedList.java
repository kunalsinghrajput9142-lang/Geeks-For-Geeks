class Solution{
    public Node insertInMiddle(Node head,int x){
        if(head==null) return new Node(x);
        Node slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=new Node(x);   
        temp.next=slow.next;     
        slow.next=temp;          
        return head;
    }
}
