package dataStructures;

public class MyQueue<K> {
	
	private final MyLinkedList myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList();
	}

	public void queue(INode<K> element) {
		myLinkedList.append(element);
	}

	public INode<K> peak() {
		return myLinkedList.head;
	}

	public INode<K>deQueue () {
		return myLinkedList.pop();
	}

	public void printStack() {
		myLinkedList.printMyNode();
	}
}
