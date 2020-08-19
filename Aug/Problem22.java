public class Problem22{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //Approach : Recursion
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        else if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

        //Approach : Iteration
        // ListNode prehead = new ListNode(-1);
        
        // ListNode curr = prehead;

        // while(l1!=null && l2!=null){
        //     if(l1.val<l2.val){
        //         curr.next = l1;
        //         l1 = l1.next;
        //     }
        //     else{
        //         curr.next = l2;
        //         l2 = l2.next;
        //     }
        //     curr = curr.next;
        // }

        // //Exactly one of l1 and l2 can be non-null at this point
        // //so connect the non-null list to the end of the merged list.
        // if(l1==null){
        //     curr.next = l2;
        // }
        // else{
        //     curr.next = l1;
        // }
        // return prehead.next;
    }
}