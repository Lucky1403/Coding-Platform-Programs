import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }

        Stack<Integer> elementStack = new Stack<>();
        Stack<Integer> runningSum = new Stack<>();
        runningSum.push(0);

        for(int i = 0; i < list.size(); i++)
        {
            int currentVal = list.get(i);
            int nextSum = runningSum.peek() + currentVal;

            if(runningSum.contains(nextSum)){
                while(runningSum.peek() != nextSum)
                {
                    runningSum.pop();
                    elementStack.pop();
                }
            }
            else
            {
                elementStack.push(currentVal);
                runningSum.push(nextSum);
            }
        }

        list.clear();
        while(elementStack.size() > 0)
        {
            list.add(0, elementStack.peek());
            elementStack.pop();
        }

        if(list.isEmpty())
            return null;

        ListNode FirstNode = new ListNode(list.get(0));
        ListNode tempDummy = FirstNode;
        for(int i = 1; i < list.size(); i++)
        {
            ListNode node = new ListNode(list.get(i));
            tempDummy.next = node;
            tempDummy = tempDummy.next;
        }

        return FirstNode;
    }
}