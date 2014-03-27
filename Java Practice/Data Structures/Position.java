public class Position	{
	// An object's name is a reference to itself
	// Therefore, it's a pointer
	int size;
	Object element;
	Position previous, next;
	
	Position()	{
		this(null, -1.0, null);
	}
	Position(Position p, Object e, Position n)	{
		previous = p;
		element = e;
		next = n;
	}

	public Object getElement()	{
		return element;
	}
	public Position getPrev()	{
		return previous;
	}
	public Position getNext()	{
		return next;
	}

	public void setElement(Object e)	{
		element = e;
	}
	public void setPrev(Position p)	{
		previous = p;
	}
	public void setNext(Position n)	{
		next = n;
	}
}