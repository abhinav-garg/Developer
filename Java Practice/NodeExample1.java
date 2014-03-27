public class NodeExample1	{
	public static void main(String args[])	{
		Node abhinav = new Node("abhinav", null);
		Node garg = new Node("garg", null);
		abhinav.setNext(garg);
		System.out.println(abhinav.getElement());
		System.out.println(abhinav.getNext().getElement());
	}
}