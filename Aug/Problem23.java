public class Problem23{
    public boolean isPalindrome(ListNode head) {
        /**
     * Intuition

    If you're not too familiar with Linked Lists yet, here's a quick recap on Lists.

    There are two commonly used List implementations, the Array List and the Linked List. 
    If we have some values we want to store in a list, how would each List implementation hold them?

    An Array List uses an underlying Array to store the values. 
    We can access the value at any position in the list in O(1)O(1) time, as long as we know the index. 
    This is based on the underlying memory addressing.

    A Linked List uses Objects commonly called Nodes. Each Node holds a value and a next pointer to the next node. 
    Accessing a node at a particular index would take O(n)time because we have to go down the list using the next pointers.
    Determining whether or not an Array List is a palindrome is straightforward. 

    We can simply use the two-pointer technique to compare indexes at either end, moving in towards the middle. 
    One pointer starts at the start and goes up, and the other starts at the end and goes down. 
    This would take O(n)O(n) because each index access is O(1)O(1) and there are nn index accesses in total.

    However, it's not so straightforward for a Linked List. 
    Accessing the values in any order other than forward, sequentially, is not O(1)O(1). 
    Unfortunately, this includes (iteratively) accessing the values in reverse. 
    We will need a completely different approach.

    On the plus side, making a copy of the Linked List values into an Array List is O(n)O(n). 
    Therefore, the simplest solution is to copy the values of the Linked List into an Array List (or Vector, or plain Array). 
    Then, we can solve the problem using the two-pointer technique.

    Algorithm

    We can split this approach into 2 steps:

    Copying the Linked List into an Array.
    Checking whether or not the Array is a palindrome.
    To do the first step, we need to iterate through the Linked List, adding each value to an Array. 
    We do this by using a variable currentNode to point at the current Node we're looking at, 
    and at each iteration adding currentNode.val to the array and updating currentNode to point to currentNode.next. 
    We should stop looping once currentNode points to a null node.

    The best way of doing the second step depends on the programming language you're using. 
    In Python, it's straightforward to make a reversed copy of a list and also straightforward to compare two lists. 
    In other languages, this is not so straightforward and so it's probably best to use 
    the two-pointer technique to check for a palindrome. In the two-pointer technique, we put a pointer at the start 
    and a pointer at the end, and at each step check the values are equal and then 
    move the pointers inwards until they meet at the center.

    When writing your own solution, remember that we need to compare values in the nodes, not the nodes themselves. 
    node_1.val == node_2.val is the correct way of comparing the nodes. node_1 == node_2 will not work the way you expect.
     */

    //Approach 1 : Copy into arraylist and then use two-pointer technique
    ArrayList<Integer> list = new ArrayList<Integer>();
        
    // Convert LinkedList into ArrayList.
    ListNode dummy = head;
    while(dummy!=null){
        list.add(dummy.val);
        dummy = dummy.next;
    }
    
    // Use two-pointer technique to check for palindrome.
    int front = 0;
    int back = list.size() - 1;
    while (front < back) {
        // Note that we must use ! .equals instead of !=
        // because we are comparing Integer, not int.
        if (!list.get(front).equals(list.get(back))) {
            return false;
        }
        front++;
        back--;
    }
    return true;
    }
}