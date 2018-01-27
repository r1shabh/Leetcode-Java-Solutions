/**
 * Created by rishabh anand on 1/5/2017.
 */
public class mergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode result;
        if (l1.val < l2.val){
            result = l1;
            result.next = mergeTwoLists(l1.next, l2);
        }
        else {
            result = l2;
            result.next = mergeTwoLists(l1, l2.next);
        }
        return result;
    }

    public static void printListNode(ListNode l){
        while (l != null){
            System.out.print(l.val);
            System.out.print(" ");
            l = l.next;
        }
        System.out.println("");
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(5);
        printListNode(mergeTwoLists(l1, l2));
    }
}
