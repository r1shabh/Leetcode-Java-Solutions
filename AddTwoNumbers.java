/**
 * Created by rishabh anand on 1/10/2017.
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        return addTwoNumbers(l1, l2, 0);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2, int carriedNum) {
        ListNode result;
        if (l2 == null && l1 == null){
            if (carriedNum != 0){
                result = new ListNode(carriedNum);
                return result;
            }
            else {
                return null;
            }
        }
        int sum;
        if (l1 == null){
            l1 = new ListNode(0);
            l1.next = null;
        }
        else if (l2 == null){
            l2 = new ListNode(0);
            l2.next = null;
        }
        sum = l1.val + l2.val + carriedNum;
        carriedNum = 0;
        while (sum >= 10){
            sum -= 10;
            carriedNum++;
        }
        result = new ListNode(sum);
        result.next = addTwoNumbers(l1.next, l2.next, carriedNum);
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
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        printListNode(addTwoNumbers(l1, l2));
    }
}
