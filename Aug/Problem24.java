public class Problem24{
    public boolean hasCycle(ListNode head) {
        /**
         * If there is no cycle in the list, the fast pointer will eventually reach the end and 
         * we can return false in this case.
         * 
         * Now consider a cyclic list and imagine the slow and fast pointers are two runners 
         * racing around a circle track. The fast runner will eventually meet the slow runner. 
         * Why? Consider this case (we name it case A) - The fast runner is just one step behind the slow runner. 
         * In the next iteration, they both increment one and two steps respectively and meet each other.
         */

         //Approach : Two Pointers
        if(head==null || head.next==null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow!=fast){
            if(fast==null || fast.next==null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;

        //Approach : Hash Table
        // Set<ListNode> set = new HashSet<ListNode>();
        // while(head!=null){
        //     if(set.contains(head)){
        //         return true;
        //     }
        //     else{
        //         set.add(head);
        //     }
        //     head = head.next;
        // }
        // return false;
    }
}