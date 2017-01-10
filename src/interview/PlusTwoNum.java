package interview;

class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
/*
 * input : (2 -> 4 -> 4) + (5 -> 6-> 4)
 * output : 7 -> 0 -> 8
 */
public class PlusTwoNum {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode o1 = l1;
		ListNode o2 = l2;
		ListNode result = new ListNode(0);
		ListNode current = result;
		int carry = 0;
		
		String a= "";
		
		while (o1 != null || o2 != null) {
			int val1 = o1.val;
			int val2 = o2.val;
			int sum = val1 + val2 + carry;

			carry = sum / 10;
			sum = sum % 10;

			current.next = new ListNode(sum);
			current = current.next;
			o1 = o1.next;
			o2 = o2.next;
		}

		/* 마지막 연산 후 올림이 남았을 경우 */
		if (carry > 0)
			current.next = new ListNode(carry);

		return result.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode one = new ListNode(4);
		ListNode two = new ListNode(3);
		one.next = two;
		l1.next = one;

		ListNode l2 = new ListNode(5);
		ListNode three = new ListNode(6);
		ListNode four = new ListNode(4);
		three.next = four;
		l2.next = three;

		new PlusTwoNum().addTwoNumbers(l1, l2);
	}
}
