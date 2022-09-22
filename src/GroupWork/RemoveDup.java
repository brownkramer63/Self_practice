package GroupWork;

public class RemoveDup {

    public Node head;

    public static void main(String[] args) {

    }
    public static Node removeDup(Node head){

       Node fast = head.next;
       Node slow = head;

       while (fast!=null){

           if (slow.value == fast.value){

               fast=fast.next;
               slow.next=fast;

           }else {
               slow=fast;
               fast=fast.next;

           }


       }


return head;
    }
}
