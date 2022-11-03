package GroupWork.October19andOnward;

import java.util.LinkedList;

public class DeleteNNodes {

    public static void main(String[] args) {
        //making list 1-10
    Link head = new Link(1);
    Link two = new Link(2);
    Link three = new Link(3);
    Link four = new Link(4);
    Link five = new Link(5);
    Link six = new Link(6);
    Link seven = new Link(7);
    Link eight= new Link(8);
    Link nine= new Link(9);
    Link tail= new Link(10);
    //linking list
    head.next=two;
    two.next=three;
    three.next=four;
    four.next=five;
    five.next=six;
    six.next=seven;
    seven.next=eight;
    eight.next=nine;
    nine.next=tail;
    tail.next=null;

        System.out.println(DeleteNNodeAfterMNodes(head,2,2));
    }
   public static Link DeleteNNodeAfterMNodes(Link head,int m, int n){
       // first assign head to current and create counter
       // go through each element, check whether element equal to a
       // continue to traverse check whether element number equal to b
       // delete n nodes (write last a nodes will point last b nodes) => two pointer keep a delete b


       Link current = head;
       Link lastAnode = head;

       while(current != null) {
           int countA = m;
           int countB = n;
           //go through each element, check whether element equal to a
           while (current != null && countA != 0) {
               lastAnode = current;
               current = current.next;


               countA--;
           }
           //continue to traverse check whether element number equal to b
           while (current != null && countB != 0) {
               current = current.next;
               countB--;
           }
           // delete n nodes (write last a nodes will point last b nodes) => two pointer keep a delete b

           lastAnode.next = current;

       }
       return head;

   }}
