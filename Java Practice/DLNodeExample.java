public class DLNodeExample	{
	public static void main(String args[])	{
		DLNode n1 = new DLNode(), n2 = new DLNode(), n3 = new DLNode();
		n1.setElement(1);
		n2.setElement(2);
		n3.setElement(3);
		n2.setPrev(n1); 
		n2.setNext(n3);
		System.out.println(n2.getPrev().getElement());
		System.out.println(n2.getNext().getElement());
	}
}