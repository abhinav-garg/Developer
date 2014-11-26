public class BTNode {
	//Class that represents a node associated with a binary tree - stores an element, and references to parents, and left and right child
	private BTNode parent, left, right;
	private Object element;
	public BTNode()	{
		this(null, null, null, null);
	}
	public BTNode(Object e, BTNode p, BTNode l, BTNode r)	{
		element = e;
		parent = p;
		left = l;
		right = r;
	}
	public void setElement(Object e)	{
		element = e;
	}
	public void setParent(BTNode p)	{
		parent = p;
	}
	public void setLeft(BTNode l)	{
		left = l;
	}
	public void setRight(BTNode r)	{
		right = r;
	}
	public Object getElement()	{
		return element;
	}
	public BTNode getParent()	{
		return parent;
	}
	public BTNode getLeftChild()	{
		return left;
	}
	public BTNode getRightChild()	{
		return right;
	}
	public boolean hasLeft()	{
		if(left!=null)	return true;
		else return false;
	}
	public boolean hasRight()	{
		if(right!=null)	return true;
		else return false;
	}
}

