package dataStructures;

	public class MyNode <K> implements INode<K>{

		//Defining key of type Generic
		private K key;
		private INode next;
		
		//creating a parameterized constructor,
		public MyNode(K key) {
			this.key = key;
			this.next = null;
		}

		//Getter and Setter for MyNode
		public INode getNext() {
			return next;
		}

		public void setNext(INode next) {
			this.next = next;
		}

		@Override
		public K getKey() {
			return key;
		}

		@Override
		public void setKey(K key) {
			this.key = key;
		}


}
