/*
 * Project : DRE011 
 * Date    : 24 Oct 2016
 * Author  : Muthu Subramanian
 */

package practice;

public class LinkedList8 {
	static Node currentHead = new Node();
	static Node reversedList = new Node();

	public static void main(String args[]) {
		Node first = new Node("LL" + 0);
		Node prevNode = first;
		for (int i = 1; i < 4; i++) {
			Node nextNode = new Node("LL" + i);
			prevNode.setNext(nextNode);
			prevNode = nextNode;
		}
		System.out.println(first.toString());
		reverse(first);
		System.out.println(reversedList.toString());
	}

	private static void reverse(Node head) {
		if (head.getNext() == null) {
			currentHead = head;
			reversedList = head;
			return;
		} else {
			reverse(head.getNext());
			head.setNext(null);
			currentHead.setNext(head);
			currentHead = head;
		}
	}
}