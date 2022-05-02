package linkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class MyLL {

	static void print(Node head) // Copy of reference passed
	{
		if (head == null) {
			System.out.println("Empty LL: Nothing to print");
			return;
		}

		while (head != null) // fine to use head as it is copy of reference here.
		// Original head in main is preserved
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	static Node insertAtHead(Node head, int data) // head here and in the main func are different
	{
		Node newNode = new Node(data);
		newNode.next = head;
		return newNode;
//		head = newNode;
//		return head;
	}

	static Node insertAtEnd(Node head, int data) {
		Node newNode = new Node(data);
		if (head == null)// Explicitly Handling -> if LL is empty
		{
			return newNode;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		// last element found
		last.next = newNode;
		return head;
	}

	static void printMiddleElement(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) // order of statement matters -> for even and odd scenarios
													// respectively
		{
			fast = fast.next.next;
			slow = slow.next;
		}

		System.out.println("Middle Element: " + slow.data);
	}

//	https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1#
	static Node sortedMerge(Node head1, Node head2) {
		// This is a "method-only" submission.
		// You only need to complete this method

		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		Node newHead;

		if (head1.data <= head2.data) {
			newHead = head1;
			head1 = head1.next;
		} else {
			newHead = head2;
			head2 = head2.next;
		}

		Node last = newHead;

		while (true) {
			if (head1 == null) {
				last.next = head2;
				break;
			}
			if (head2 == null) {
				last.next = head1;
				break;
			}
			if (head1.data <= head2.data) {
				last.next = head1;
				head1 = head1.next;
			} else {
				last.next = head2;
				head2 = head2.next;
			}
			last = last.next;
		}

		return newHead;
	}

//	https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/
	static Node reverseList(Node head) {
		if (head == null)
			return head;

		Node current = head;
		Node prev = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

	public static void main(String[] args) {
		Node head = new Node(5);
//		System.out.println(head.data);
//		System.out.println(head.next);
		Node second = new Node(6);
		head.next = second;
		Node third = new Node(7);
		second.next = third;
		Node fourth = new Node(8);
		third.next = fourth;
		Node fifth = new Node(9);
		fourth.next = fifth;

//		System.out.println(head.data);
//		System.out.println(head.next.data);
//		System.out.println(head.next.next.data);
//		System.out.println(head.next.next.next.data);
//		System.out.println(head.next.next.next.next.data);

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		// head has become null -> NEVER LOOSE YOUR HEAD

		print(head);
		print(null);

		printMiddleElement(head);

		head = insertAtHead(head, 4);
		print(head);

		printMiddleElement(head);

		insertAtEnd(head, 10);
		print(head);

		Node head2 = null;
		head2 = insertAtHead(head2, 1);
		print(head2);

		Node head3 = null;
		head3 = insertAtEnd(head3, 1);
		print(head3);

	}

}
