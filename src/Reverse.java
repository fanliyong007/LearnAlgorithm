import java.util.Stack;

public class Reverse
{
    public static void main(String args[])
    {
        Stack<Integer> stack=new Stack<Integer>();
        while(!StdIn.isEmpty())
            stack.push(StdIn.readInt());
        for(int i:stack)//foreach
            StdOut.println(i);
    }
}
