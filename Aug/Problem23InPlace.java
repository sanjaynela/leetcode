public class Problem23InPlace{
    public boolean isPalindrome(ListNode head) {
        /**
         * 
         * The only way we can avoid using O(n)O(n) extra space is by modifying the input in-place.

        * The strategy we can use is to reverse the second half of the Linked List in-place 
          (modifying the Linked List structure), and then comparing it with the first half. 
          Afterwards, we should re-reverse the second half and put the list back together. 
          While you don't need to restore the list to pass the test cases, it is still good programming practice 
          because the function could be a part of a bigger program that doesn't want the Linked List broken.

        * Algorithm:
         * Specifically, the steps we need to do are:

        Find the end of the first half.
        Reverse the second half.
        Determine whether or not there is a palindrome.
        Restore the list.
        Return the result.

        To do step 1, we could count the number of nodes, calculate how many nodes are in the first half, 
        and then iterate back down the list to find the end of the first half. 
        Or, we could do it in a single parse using the two runners pointer technique. 
        Either is acceptable, however we'll have a look at the two runners pointer technique here.

        Imagine we have 2 runners one fast and one slow, running down the nodes of the Linked List. 
        In each second, the fast runner moves down 2 nodes, and the slow runner just 1 node. 
        By the time the fast runner gets to the end of the list, the slow runner will be half way. 
        By representing the runners as pointers, and moving them down the list at the corresponding speeds, 
        we can use this trick to find the middle of the list, and then split the list into two halves.

        If there is an odd-number of nodes, then the "middle" node should remain attached to the first half.
        */

        if(head==null){
            return true;
        }

        //Find the end of the first half and reverse second half
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        //Check whether or not there is a palindrome
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while(result && p2!=null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        //Restore the list and return the result
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;

        private ListNode reverseList(ListNode head){
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

        private ListNode endOfFirstHalf(ListNode head){
            ListNode fast = head;
            ListNode slow = head;

            while(fast.next!=null && fast.next.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }

            return slow;
        }
    }
}