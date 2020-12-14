package dataStructures;
import org.junit.Assert;
import org.junit.Test;


public class MyLinkedListTest {
		//UC2.   
		//Appending is always to to the end and Add is always adds first
		@Test
		public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
			
			//56 -> 30 -> 70
			
			MyNode<Integer>  myFirstNode = new MyNode<>(70); 
			MyNode<Integer>  mySecondNode= new MyNode<>(30);
			MyNode<Integer>  myThirdNode = new MyNode<>(56);
			
			//adding the nodes
			MyLinkedList myLinkedList = new MyLinkedList();
			myLinkedList.add(myFirstNode);
			myLinkedList.add(mySecondNode);
			myLinkedList.add(myThirdNode);
			myLinkedList.printMyNode();
			//myLinkedList.insert(myFirstNode,mySecondNode);
			boolean result = myLinkedList.head.equals(myThirdNode) &&
							 myLinkedList.head.getNext().equals(mySecondNode) &&
							 myLinkedList.tail.equals(myFirstNode);
			Assert.assertTrue(result); 
		}
		//Appending
		@Test
		public void given3NumbersWhenAppendedShouldBeAddedToLast() {
			
			MyNode<Integer>  myFirstNode = new MyNode<>(56);
			MyNode<Integer>  mySecondNode= new MyNode<>(30);
			MyNode<Integer>  myThirdNode = new MyNode<>(70);
			
			//adding the nodes
			MyLinkedList myLinkedList = new MyLinkedList();
			myLinkedList.add(myFirstNode);
			myLinkedList.append(mySecondNode);
			myLinkedList.append(myThirdNode);
			
			boolean result = myLinkedList.tail.equals(myThirdNode) &&
							 myLinkedList.head.getNext().equals(mySecondNode) &&
							 myLinkedList.head.equals(myFirstNode);
			Assert.assertTrue(result); 
		}
		
		//Insert in between
		@Test
	public void given3NumbersWhenInsertingSecondInBEtweenShouldPassLinkedListResult() {
			
			MyNode<Integer>  myFirstNode = new MyNode<>(56);
			MyNode<Integer>  mySecondNode= new MyNode<>(30);
			MyNode<Integer>  myThirdNode = new MyNode<>(70);
			
			//adding the nodes
			MyLinkedList myLinkedList = new MyLinkedList();
			myLinkedList.add(myFirstNode);
			myLinkedList.append(myThirdNode);
			myLinkedList.insert(myFirstNode,mySecondNode);
			
			boolean result = myLinkedList.head.equals(myFirstNode) &&
							 myLinkedList.head.getNext().equals(mySecondNode) &&
							 myLinkedList.tail.equals(myThirdNode);
			Assert.assertTrue(result); 
		}
		
	}