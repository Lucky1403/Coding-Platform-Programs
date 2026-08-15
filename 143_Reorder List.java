
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode forward = null;
        ListNode previous = null;
        while (current != null) {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        return previous;
    }

    public void reorderList(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int half = 0;
        if (count % 2 == 0) {
            half = count / 2;
        } else {
            half = (count + 1) / 2;
        }
        ListNode tempA = head;
        ListNode tempB = head;
        temp = head;
        for (int i = 1; i < half; i++) {
            temp = temp.next;
        }

        tempB = temp.next;
        temp.next = null;

        ListNode secondHalf = reverseList(tempB);
        ListNode tempSecond = secondHalf;

        temp = head;
        while (tempSecond != null) {
            tempA = tempA.next;
            temp.next = tempSecond;
            temp = tempSecond;

            tempSecond = tempSecond.next;
            temp.next = tempA;
            temp = tempA;
        }
        return;
    }
}