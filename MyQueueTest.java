package dataStructures;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyQueue<Integer>myQueue=new MyQueue<>();
		MyNode<Integer>myFirstNode=new MyNode<>(70);
		MyNode<Integer>mySecondNode=new MyNode<>(30);
		MyNode<Integer>myThirdNode=new MyNode<>(56);
		myQueue.queue(myFirstNode);
		myQueue.queue(mySecondNode);
		myQueue.queue(myThirdNode);
		INode<Integer>myNode=myQueue.peak();
		myQueue.printStack();
		Assert.assertEquals(myFirstNode, myNode);
	}
	@Test
	public void givenNumbersInStackWhenStackPopedShouldMatchWithLastAddedNode() {
		MyQueue<Integer>myQueue=new MyQueue<>();
		MyNode<Integer>myFirstNode=new MyNode<>(70);
		MyNode<Integer>mySecondNode=new MyNode<>(30);
		MyNode<Integer>myThirdNode=new MyNode<>(56);
		myQueue.queue(myFirstNode);
		myQueue.queue(mySecondNode);
		myQueue.queue(myThirdNode);
		INode<Integer>popedNode=myQueue.deQueue();
		myQueue.printStack();
		Assert.assertEquals(myFirstNode, popedNode);
	}
}
