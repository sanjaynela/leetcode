public class Problem21{
    /**
     * While you are traversing the list, 
     * change the current node's next pointer to point to its previous element. 
     * Since a node does not have reference to its previous node, 
     * you must store its previous element beforehand. 
     * You also need another pointer to store the next node before changing the reference. 
     * Do not forget to return the new head reference at the end!
     */
    public ListNode reverseList(ListNode head) {
        //Use two pointers
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}