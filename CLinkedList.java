/*
	Going to implement a Circular Linked List 

	under the hood using a Singularly Linked List and the LinkedListInterface
*/


//Generic Data Structure
public class CLinkedList<T> implements LinkedListInterface<T>
{

	private int size; //Keeps track of CLinkedList Size 
	private Node tail; //Points to the last Node Inserted its .next ptr points to the first node 


	//LinkedListInterface Methods
	
	/** Determines if the LinkedList is Empty or not 
		@return A boolean true if empty . false if Not Empty */
	public boolean isEmpty()
	{
		return false;
	}


	/** Determines the Size of the LinkedList How Many Elements in it 
		@return An integer containing the size*/
	public int getCurrentSize()
	{
		return -1;
	}

	/** Adds an Element to the End of the LinkedList .If it fails it throws an exception 
		@return A boolean true if added false if NOT added */
	public boolean add(T element)
	{
		return false;
	}
	
	/** Removes the Last Element from the Linked List and returns it 
		@return T lastElement*/
	public T removeLast()
	{
		return null;
	}

	/** Removes a specific Element from the Linked List 
		@return A boolean true if Found, false if NOT Found*/
	public boolean remove(T elementToRemove)
	{
		return false;
	}

	/** Returns the element found at the specified index
	    @parameter int index
		@return T element at index*/
	public T get(int index)
	{
		return null;
	}

	/** Clears all the elements in the LinkedList and Allows GC to deallocate their memory 
		@return void */
	public void clear()
	{

	}
	
	//Nested Class Should never see the light of day only for CLinkedList EYES 
	private class Node
	{
		//no modifier means only the class and the package can see its variables 
		T data; //Data to be stored
		Node next; //Singularly Linked

		//Default Constructor 
		public Node()
		{
			this(null,null); //Using the Constructor 
		}
		//Initializor Constructor 
		public Node(T data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}

}
