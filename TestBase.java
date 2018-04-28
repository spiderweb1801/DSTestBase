import DS.DS.DoublyLinkedList;
import DS.DS.SingleLinkedList;

public class TestBase {

	public static void main(String[] args) {
		
		/*SingleLinkedList sll= new SingleLinkedList();
		sll.addFirst(1);
		System.out.println("adding 1 as first element...");
		sll.printList();
		
		sll.addLast(9);
		System.out.println("adding 9 as last element...");
		sll.printList();
		
		sll.addAt(2,4);
		System.out.println("adding 4 as 2nd element...");
		sll.printList();
		
		sll.removeFirst();
		System.out.println("removing the first element...");
		sll.printList();
		
		sll.addFirst(7);
		System.out.println("adding 7 as first element...");
		sll.printList();
		
		sll.addLast(8);
		System.out.println("adding 8 as last element...");
		sll.printList();
		
		sll.removeLast();
		System.out.println("removing the last element...");
		sll.printList();
		
		System.out.println("Element 9 present?"+sll.search(9));
		System.out.println("Element at index 2 is..."+sll.elementAt(2));
		System.out.println("Element at 1st index is..."+sll.getFirst());
		System.out.println("Element at last index is..."+sll.getLast());
		System.out.println("Size of linked list is..."+sll.size());
		
		sll.addAt(2, 5);
		System.out.println("adding 5 as 2nd element...");
		sll.printList();
		
		sll.removeNode(5);
		System.out.println("removing NODE 5...");
		sll.printList();
		
		sll.removeNode(7);
		System.out.println("removing NODE 7...");
		sll.printList();
		
		sll.addAt(2, 5);
		System.out.println("adding 5 as 2nd element...");
		sll.printList();
		
		sll.addAt(4, 15);
		System.out.println("adding 15 as 4nd element...");
		sll.printList();
		
		System.out.println("Element 99 present?"+sll.search(99));
		System.out.println("Element at index 4 is..."+sll.elementAt(4));
		System.out.println("Element at 1st index is..."+sll.getFirst());
		System.out.println("Element at last index is..."+sll.getLast());
		System.out.println("Size of linked list is..."+sll.size());
		
		System.out.println("Reversing the linked list...");
		sll.reverseLinkedList();
		sll.printList();
		
		System.out.println("Element 0 present?"+sll.search(0));
		System.out.println("Element at index 3 is..."+sll.elementAt(3));
		System.out.println("Element at 1st index is..."+sll.getFirst());
		System.out.println("Element at last index is..."+sll.getLast());
		System.out.println("Size of linked list is..."+sll.size());*/
		
		DoublyLinkedList dll= new DoublyLinkedList();
		dll.addFirst(1);
		System.out.println("ADDING 1 AS 1ST ELEMENT...");
		dll.printList();
		
		dll.addFirst(2);
		System.out.println("ADDING 2 AS 1ND ELEMENT...");
		dll.printList();
		
		dll.addFirst(5);
		System.out.println("ADDING 5 AS 1ND ELEMENT...");
		dll.printList();
	}

}
