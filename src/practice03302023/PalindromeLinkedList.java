package practice03302023;

import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList<ListNode> list = new LinkedList<>();

    }
    public  static boolean isPalindrome(ListNode head){
        Stack<Integer> stck = new Stack<>();
        ListNode top= head;
        while (top.next!=null){
            stck.push(top.val);
            top=top.next;
        }
        while (!stck.isEmpty()){
        if (head.val!=stck.pop()){
            return false;
        }
        head=head.next;
        }
        return true;
    }
}
