// IDEA : We can also use ArrayDeque to make it simpler. My idea is:
//          1. Count no. of nodes
//          2. Push the first half of nodes into a stack
//          3. Simultaneously pop from stack and traverse each element in second half
//             and take max of their sums 

import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class B {
    public int pairSum(ListNode head) {

        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        temp = head;
        n /= 2;
        Stack<Integer> s = new Stack<>();

        while (n > 0) {
            s.push(temp.val);
            temp = temp.next;
            n--;
        }
        int maxi = 0;
        while (temp != null) {
            maxi = Math.max(maxi, s.pop() + temp.val);
            temp = temp.next;
        }
        return maxi;
    }
}
