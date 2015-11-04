public class LinkedListDemo{
	public static void main(String[] args){
		LinkedList demo = new LinkedList();
		System.out.println(demo.isEmpty());
		demo.displayList();
		demo.insertFirst(5);
		demo.insertFirst(4);
		demo.insertFirst(3);
		demo.insertFirst(2);
		demo.insertFirst(1);
		System.out.println(demo.isEmpty());
		demo.displayList();
		demo.first = demo.reverseList(demo.first);
		demo.displayList();
	}
}