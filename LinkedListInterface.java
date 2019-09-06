/*
	LinkedListInterface 
	
	will have an interface that describes all the methods a linkedlist should have 
*/



//Generic Interface Used to Create a Ordered LinkedList
public interface LinkedListInterface<T>
{
	
	/** Determines if the LinkedList is Empty or not 
		@return A boolean true if empty . false if Not Empty */
	public boolean isEmpty();


	/** Determines the Size of the LinkedList How Many Elements in it 
		@return An integer containing the size*/
	public int getCurrentSize();

	/** Adds an Element to the End of the LinkedList .If it fails it throws an exception 
		@return A boolean true if added false if NOT added */
	public boolean add(T element);
	
	/** Removes the Last Element from the Linked List and returns it 
		@return T lastElement*/
	public T removeLast();

	/** Removes a specific Element from the Linked List 
		@return A boolean true if Found, false if NOT Found*/
	public boolean remove(T elementToRemove);

	/** Returns the element found at the specified index
	    @parameter int index
		@return T element at index*/
	public T get(int index);

	/** Clears all the elements in the LinkedList and Allows GC to deallocate their memory 
		@return void */
	public void clear();	


}
