import java.util.Stack;

public class StackExample
{
        public static void main(String args[])
        {
                // Create a new, empty stack
                Stack<Integer> lifo = new Stack<Integer>();

                // Let's add some items to it
                for (int i = 1; i <= 10; i++)
                {
                        lifo.push (i);
                }

                // Last in first out means reverse order
                while ( !lifo.empty() )
                {
                        System.out.print ( lifo.pop() );
                        System.out.print ( ',' );
                }

                // Empty, let's lift off!
                System.out.println (" LIFT-OFF!");
        }

}