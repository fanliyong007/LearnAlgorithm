
import java.util.Scanner;
/**
 * Created by fanliyong on 2018/1/26.
 */
public class NewtonSqrt
{
    public static void main(String args[])
    {

        Scanner read=new Scanner(System.in);
        double x=read.nextDouble();
        System.out.print(Newtonsqrt(x));

    }
    public static double Newtonsqrt(double c)
    {
        if(c<0) return Double.NaN;
        double err=1e-15;
        double t=c;
        while (Math.abs(t-c/t)>err*t)
            t=(c/t+t)/2.0;
        return t;
    }

}
