package dataStructures;

public interface INode<K> {

	//defining methods to set and get key
	
	K getKey();
	void setKey(K key);
	
	INode getNext();
	void setNext(INode next);
}
