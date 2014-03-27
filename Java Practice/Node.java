public class Node	{
	// Instance variables
	private Object element;
	private Node next;	// objects are always referenced. So next is actually the address of the next node 

	public Node()	{
		this(null, null);
	}
	public Node(Object e, Node n)	{
		element = e;
		next = n;
	}

	public Object getElement()	{
		return element;
	}
	public Node getNext()	{
		return next;
	}

	public void setElement(Object newElement)	{
		element = newElement;
	}
	public void setNext(Node newNext)	{
		next = newNext;
	}
}