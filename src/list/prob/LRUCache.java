package list.prob;

import java.util.Hashtable;
//  use Hash and double linked list.... hash for read O(1) ,
public class LRUCache {
	

	/// Method 1 - using array - search , insert takes O(n)
	// size = 4
	// insert new iteme in start....head 
	// if full remove item in end
	// move get item to start if present in cache
	// maintain tail pointer to access item to remove O(1) time
	Node2 head;
	Node2 tail;
	int size;
	int capacity;
	Hashtable<Integer, Node2> hashTable = new Hashtable<Integer, Node2>();

	// save ref in hash table
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LRUCache cahce = new LRUCache(4);
		
		cahce.getItem(10);
		System.out.println("------------after 10");
		cahce.print();

		cahce.getItem(20);
		System.out.println("------------after 20");
		cahce.print();
		cahce.getItem(10);
		System.out.println("------------after 10 read ");
		cahce.print();
		

		cahce.getItem(30);
		
		System.out.println("------------after 30");
		cahce.print();
		
		cahce.getItem(40);
		System.out.println("------------after 40");
		cahce.print();
		
		cahce.getItem(50);
		
		System.out.println("------------after 50");
		cahce.print();
		
		cahce.getItem(60);
		
		System.out.println("------------after 60");
		cahce.print();
		
		cahce.getItem(40);

		
		System.out.println("------------after 40,");
		cahce.print();
		System.out.println("------------after 30");
		cahce.getItem(30);
		
		cahce.print();
	}

	LRUCache(int cap) {
		this.size = 0;
		capacity = cap;
	}

	public void getItem(int input) {

		// step 1 -- check in hash table
		Node2 item = hashTable.get(input);
		if (item != null) {
			// item found... check if it is head... ignore if head or else move to head..

			if (item != head) {

				// remove item and move to start i.e head
				// 1 connect prev and next nodes of current
				// case 1 capa 1 , case 2 cap 2 ;;
				
				Node2 prev = item.left;  //50
				Node2 next = item.right;  //30
				if(item==tail)
					tail = prev;
				
				if(item.left==head)
					tail.left = item;
				
				// move item to head 
				item.left = null ;
				item.right = head; // if head.right null null is set to right 
				head = item ;
				
				if(prev!=null) {
					
					prev.right = next;
				}
	if(next!=null) {
					
					next.left = prev;
				}

			} else {
				System.out.println("item is already head"); // no change required

			}
		} else {
			// need to insert new node
			// case 1 if full
			System.out.println("size---"+size);
			
			if (size == capacity) {
				// if size reached capacity ... remove last element ....
				hashTable.remove(tail.data);
				Node2 prev = tail.left;
				prev.right = null;
				tail = prev;
				size--;
			}
			// insert node in front
			Node2 temp = new Node2(input);
			hashTable.put(input,temp);
			if (head == null) {
				head = temp;
				tail = temp;
				size++;
			} else {
			
				temp.right = head;
				head.left = temp;  // tail.left also becomes temp
				head = temp;
				size++;
			}

		}

	}
	
	public  void print() {
		
		for(Node2 temp = head;temp!=null;temp =temp.right)
			System.out.println("----:  "+temp.data);
	}

}
