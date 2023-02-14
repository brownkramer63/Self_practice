package LeetCodeReview;

import LeetCode.MergeTwoSortedLists;

public class PalindromeLinkedList {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(MergeTwoSortedLists.ListNode head) {
        if (head==null || head.next==null){
            return true;
        }
        MergeTwoSortedLists.ListNode slow= head;
        MergeTwoSortedLists.ListNode fast= head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //dont care

        return true;

    }
}
