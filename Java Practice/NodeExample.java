public class NodeExample	{
	class Node	{
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

	public static void main(String args[])	{
		NodeExample example = new NodeExample();
		NodeExample.Node node1 = example.new Node();
		node1.setElement("Node1");
		NodeExample.Node node2 = example.new Node("Node2", null);
		node1.setNext(node2);
		System.out.println(node1.getElement());
		System.out.println(node1.getNext().getElement());
	}
}