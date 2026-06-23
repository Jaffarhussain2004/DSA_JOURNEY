/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode l=head;
        ArrayList<Integer> a=new ArrayList<>();

        while(head!=null){   //0(n)
            a.add(head.val);
            head=head.next;
        }
        Collections.sort(a);  //nlog(n)
        head=l;  //1000
        int i=0;
        while(head!=null){
            head.val=a.get(i);
            i++;
            head=head.next;
        }
        head=l;
        return head;
    }
}