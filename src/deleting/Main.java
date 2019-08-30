package deleting;

public class Main {
	public static void main(String[] args) {
		int[] input = {4,5,1,9};
		
		ListNode head = LinkedListHelperMethods.insertNode(input);
		
		System.out.println("Lineked List: ");
		
		LinkedListHelperMethods.displayLinkedList(head);
		
		DeleteNodeFunction solution = new DeleteNodeFunction();
		
		System.out.println("Delete " + head.next.val);
		
		solution.deleteNode(head.next);
		
		LinkedListHelperMethods.displayLinkedList(head);
	}
}
