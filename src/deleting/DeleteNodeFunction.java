package deleting;

public class DeleteNodeFunction {
    public void deleteNode(ListNode node) {
        // Current node will be the next node 
        node.val = node.next.val;
        // The next node will be next next node
        node.next = node.next.next;
    }
}
