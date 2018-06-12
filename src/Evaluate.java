import java.util.Stack;

public class Evaluate
{
    public static void main(String args[])
    {
        Stack<String>ops=new Stack<>();
        Stack<Double>vals=new Stack<>();//输入的数值有可能为浮点数，如果写int则有可能出错
        while(!StdIn.isEmpty())
        {
            String s=StdIn.readString();
            if(s.equals("("))          ;//忽略左括号
            else if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("sqrt"))
                ops.push(s);
            else if(s.equals(")"))
            {
                //如果字符为）弹出运算符和操作数，计算结果并压入栈
                String op=ops.pop();
                double v=vals.pop();
                if(op.equals("+"))      v=vals.pop()+v;
                else if(op.equals("-")) v=vals.pop()-v;
                else if(op.equals("*")) v=vals.pop()*v;
                else if(op.equals("/")) v=vals.pop()/v;
                else if(op.equals("sqrt")) v=Math.sqrt(v);
                vals.push(v);
            }//如果既非运算符也不是括号，将它作为double压入栈
            else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}
