package LeetCode;

public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode list = head;

        while(list.next != null) {

            if (list.val == list.next.val){

                list.next = list.next.next;
            }else {

                list = list.next;
            }

        }
        return head;
    }
}
