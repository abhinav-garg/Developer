public class NodeListExample	{
	public static void main(String args[])	{
		Node[] nodeList = new Node[5];
		for(int i = 0; i < 5; i++)	{
			nodeList[i] = new Node(i, null);
		}
		for (int i = 0; i < 5; i++)	{
			System.out.println(nodeList[i].getElement());
		}
	}
}