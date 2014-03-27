public class Main	{
	public static void main(String [] args)	{
		Position p1 = new Position();
		Position p3 = new Position();
		Position p2 = new Position(p1, "Abhinav", p3);
		p1.setNext(p2);
		p3.setPrev(p2);
		p1.setElement("Mister");
		p3.setElement("Garg");
		System.out.println(p1.getElement() + " " + p3.getPrev().getElement() + " " + p1.getNext().getNext().getElement());
	}
}