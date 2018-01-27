/**
 * Created by rishabh anand on 1/14/2017.
 */
public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode temp = head;
        while (temp.next != null){
            ListNode next = temp.next;
            if (temp.val == next.val){
                if (next.next == null){
                    temp.next = null;
                    return head;
                }
                else {
                    temp.next = next.next;
                    next.next = null;
                }
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }

    private static void printListNode(ListNode l){
        while (l != null){
            System.out.print(l.val + " ");
            l = l.next;
        }
        System.out.println("");
    }

    public static void main(String[] args){
        ListNode l = new ListNode(1);
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(5);
        c.next = d;
        b.next = c;
        a.next = b;
        l.next = a;
        printListNode(l);
        printListNode(deleteDuplicates(l));
    }
}
