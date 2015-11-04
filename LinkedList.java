public class LinkedList{
	//insertFirst
	//deleteFirst
	//displayList
	//isEmpty
	//removeDuplicates
	Node first = null;
	public void insertFirst(int data){
		Node n = new Node(data);
		n.next = first;
		first = n;
	}

	public Node deleteFirst(){
		Node temp = first;
		first = first.next;
		return temp;
	}

	public void displayList(){
		Node current = first;
		while(current != null){
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

	public boolean isEmpty(){
		return (first == null);
	}

	public void removeDuplicates1(){
		if(first == null) return;
		Node current = first.next;
		Node previous = first;
		while(current != null){
			Node runner = first;
			while(runner != current){
				if(current.data == runner.data){//removing current
					Node tmp = current.next;
					previous.next = tmp;
					current = tmp;
					//previous.next = current;
					break;
				}
				runner = runner.next;
			}
			//updating current
			if(runner == current){
				previous = current;
				current =  current.next;
			}
		}
	}
// 1->2->1->3->1->4->5->null
	public void removeDuplicates2(){//myway god damn it
		//幹我他媽偏要搜後面
		if(first == null) return;
		Node current = first;
		Node runner = first.next;
		Node previous = first;
		previous.next = current;
		while(current.next != null){
			while(runner != null){
				if(current.data == runner.data){ //delete runner no i need to delete current
					// previous.next = runner.next;
					// runner = runner.next;
					// break;
					previous.next = current.next;
					current = current.next;
					break;
				}
				runner = current.next;
			}
			previous = current;
			current = current.next;
			runner = current.next;
		}
	}

	public Node reverseList(Node first){
		Node pre = first;
		Node curr = first.next;

		if(first == null){
			return first;
		}

		while(curr != null){
			Node temp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = temp;
		}

		first.next = null;
		return pre;
	}
}