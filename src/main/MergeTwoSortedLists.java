/*
 * @Author: Yixiong J
 * @Date: 2019-10-06 20:59:21
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-06 21:42:14
 * @Description: https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                l3.next = l1;
                l1 = l1.next;
            }else{
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        
        if(l1 != null){
            l3.next = l1;
            l1 = l1.next;
            l3 = l3.next;
        }
        
        if(l2 != null){
            l3.next = l2;
            l2 = l2.next;
            l3 = l3.next;
        }
        
        return head.next;
    }
}