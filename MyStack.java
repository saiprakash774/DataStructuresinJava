package dataStructures;

public class MyStack<K> {
	private final MyLinkedList myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList();
	}

	public void push(INode<K> element) {
		myLinkedList.add(element);
	}

	public INode<K> peak() {
		return myLinkedList.head;
	}

	public INode<K> pop() {
		return myLinkedList.pop();
	}

	public void printStack() {
		myLinkedList.printMyNode();
	}

	public boolean isEmpty() {
		return myLinkedList.head == null;
	}

	public void EmptyStack() {
		int size = myLinkedList.getSize();
		while (size != 0) {
			myLinkedList.pop();
			size--;
		}
	}

}