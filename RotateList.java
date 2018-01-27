/**
 * Created by rishabh anand on 1/13/2017.
 */
public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null){
            return head;
        }
        ListNode tail;
        ListNode temp = head;
        int length = 1;
        while (temp.next != null){
            temp = temp.next;
            length++;
        }
        System.out.println("length: " + length);
        if (k > length){
            k = k%length;
        }
        tail = temp;
        tail.next = head;
        for (int i = 0; i < length-k; i++){
            tail = tail.next;
            head = head.next;
        }
        tail.next = null;
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
        System.out.println(2000000000%3);
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l1.next = l2;
        printListNode(l1);
        printListNode(rotateRight(l1, 2000000000));
    }
}
