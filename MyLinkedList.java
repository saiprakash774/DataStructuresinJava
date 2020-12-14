package dataStructures;

public class MyLinkedList {
	public INode head;
	public INode tail;
	
	//constructor
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}

	public void add(INode newNode) {
		
		if(tail == null) {
			this.tail = newNode;
		}
		if(head == null) {
			this.head = newNode;
		}else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void printMyNode() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	public void insert(INode myNode,INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public void append(INode myNode) {
		if(this.head == null) {
			this.head = myNode;
		}
		if(this.tail == null) {
			this.tail = myNode;
		}else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}	
	}
	
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	
	public INode popLast() {
		INode tempNode = head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode  = tempNode.getNext();
		return tempNode;
	}
	public int getSize() {
		INode tempNode = head;
		int count=0;
		while(tempNode!= null) {
			count++;
			tempNode = tempNode.getNext();
		}
		return count;
		}
	}
	
	

