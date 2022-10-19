package GroupWork.October19andOnward;

import java.util.Stack;

public class PalindromeLinkedList {
    //our link class with constructor

    static class Node01 {
        public int data;
        public Node01 next;

        public Node01(int data) {
            data = data;
            next = null;
        }
    }

    //our main class with linked list we will make
    public static void main(String[] args) {

        Node01 one = new Node01(1);
        Node01 two= new Node01(2);
        Node01 three = new Node01(3);
        Node01 four= new Node01(2);
        Node01 five = new Node01(1);

        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        System.out.println(isPalindromeLL(one));


    }
//formula we will write using stack
static boolean isPalindromeLL(Node01 head){
Node01 slow = head;
boolean ispalindrome= true;
    Stack<Integer> stack01 = new Stack<>();

    //adding data to our stack
    while (slow!=null){
        stack01.push(slow.data);
        slow=slow.next;
    }
    //pulling from stack which would be in reverse order and comparing to LL using pop
    //then moving onto next LL element if not a palindrome breaks and returns false
    while (head!=null){
       int i = stack01.pop();
       if (head.data==i){
           ispalindrome=true;
       }else {
           ispalindrome=false;
           break;
       }
       head=head.next;

    }
return ispalindrome;
}

}
