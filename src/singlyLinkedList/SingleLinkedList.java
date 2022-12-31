	package singlyLinkedList;
	
	public class SingleLinkedList {
	
		public Node head;
		public Node tail;
		public int size;
		
		public Node createSingleLinkedList(int nodeValue) {
			head = new Node();
			Node node = new Node();
			node.next = null;
			node.value = nodeValue;
			head = node;
			tail = node;
			size = 1;
			
			return head;
			
		}
		
//		Insert Method SingleLinked List
		public void insertInLinkedList(int nodeValue, int location) {
			Node node = new Node();
			node.value = nodeValue;
			if(head == null) {
				createSingleLinkedList(nodeValue);
				return;
			}else if(location == 0) {
				node.next = head;
				
			}
		}
		
		
	}
