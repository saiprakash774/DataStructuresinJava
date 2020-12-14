package dataStructures;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest{
	//UC1 = creating a simple linked list of 56, 30, 70.
	@Test
	public void givenThreeNumbers_WhenLinkedShouldPassLinkedListTest() {
		//new javapractice.MyNode<Integer>(); to create a new class in that package
		//Local variables.
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		//Setting next nodes after first node. 
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
						 mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	//UC2 - Head and Tail
}
