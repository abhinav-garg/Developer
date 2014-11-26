public class TestTree	{
	public static void main(String args[])	{
		BTNode a = new BTNode();
		BTNode b = new BTNode();
		BTNode c = new BTNode();
		a.setLeft(b);
		a.setRight(c);
		b.setParent(a);
		c.setParent(a);
		a.setElement("Data");
		b.setElement("Structures");
		c.setElement("Algorithms");
		System.out.println(a.getElement() + " " + a.getLeftChild().getElement() + " and " + a.getRightChild().getElement());
	}
}