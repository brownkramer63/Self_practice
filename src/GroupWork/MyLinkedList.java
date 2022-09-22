package GroupWork;

public class MyLinkedList {
    private Node head;



    private class Node{
        private String name;
        private Node next;

        public Node(String name) {
            this.name = name;
        }
    }
    //add one node at the end of the linked list
    public void addNode(String endName){
        Node  object1=new Node(endName);
        if (head==null){
            head=object1;
            return;
        }
        Node  current=head;

        while (current!=null){
           if (current.next==null){
               current.next=object1;

           }
           current=current.next;
        }

    }
}
