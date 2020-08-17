public class Problem19{
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
    public void deleteNode(ListNode node) {
        Node.val = Node.next.val;
        Node.next = Node.next.next;
    }
}