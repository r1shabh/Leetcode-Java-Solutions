import java.util.ArrayList;

/**
 * Created by rishabh anand on 1/6/2017.
 */
public class mergeSort {
    public static ListNode sortList(ListNode head) {
        ArrayList<ListNode> result = new ArrayList<>();
        while (head != null){
            result.add(new ListNode(head.val));
            head = head.next;
        }
        return mergeKLists(result);
    }

    public static ListNode mergeKLists(ArrayList<ListNode> lists){
        while (lists.size() > 2){
            ArrayList<ListNode> temp = new ArrayList<>();
            if (lists.size() % 2 == 0){
                for (int i = 0; i < lists.size(); i+=2){
                    temp.add(mergeTwoLists(lists.get(i), lists.get(i + 1)));
                }
            }
            else {
                temp.add(lists.get(0));
                for (int i = 1; i < lists.size(); i+=2){
                    temp.add(mergeTwoLists(lists.get(i), lists.get(i + 1)));
                }
            }
            lists = temp;
        }
        if (lists.size() == 0){
            return null;
        }
        if (lists.size() == 1){
            return lists.get(0);
        }
        return mergeTwoLists(lists.get(0), lists.get(1));
    }

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
        ListNode a = new ListNode(8);
        ListNode b = new ListNode(35);
        ListNode c = new ListNode(20);
        ListNode d = new ListNode(1);
        d.next = new ListNode(20);
        c.next = d;
        b.next = c;
        a.next = b;
        printListNode(a);
        printListNode(sortList(a));
    }
}
