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
    }
   public static Link DeleteNNodeAfterMNodes(Link head,int m, int n){
      Link current = head;
      int count;
      while (current!=null){
          //skip m nodes
          for (int i = 0; i <m && current!=null ; i++) {
              current=current.next;
          }
          if (current==null){
              return head;
          }

      }
return null;
   }
}
