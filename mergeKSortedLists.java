/**
 * Created by rishabh anand on 1/5/2017.
 */
public class mergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists){
        while (lists.length > 2){
            ListNode[] temp;
            if (lists.length % 2 == 0){
                temp = new ListNode[lists.length/2];
                int j = 0;
                for (int i = 0; i < lists.length; i+=2){
                    temp[j] = mergeTwoLists(lists[i], lists[i+1]);
                    j++;
                }
            }
            else {
                temp = new ListNode[(lists.length/2)+1];
                temp[0] = lists[0];
                int j = 1;
                for (int i = 1; i < lists.length; i+=2){
                    temp[j] = mergeTwoLists(lists[i], lists[i+1]);
                    j++;
                }
            }
            lists = temp;
        }
        if (lists.length == 0){
            return null;
        }
        if (lists.length == 1){
            return lists[0];
        }
        return mergeTwoLists(lists[0], lists[1]);
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

    public static void main(String[] args){

    }
}
