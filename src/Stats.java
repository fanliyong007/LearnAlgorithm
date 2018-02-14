//Bag()//创建一个空背包
//void add(Item item)//添加一个元素
//boolean isEmpty()//背包是否为空
//int size//背包中的元素数量

public class Stats
{
    public static void main(String args[])
    {
        Bag<Double> numbers=new Bag<Double>();
        while(!StdIn.isEmpty())
            numbers.add(StdIn.readDouble());
        int N=numbers.size();

        double sum=0.0;
        for(double x:numbers)
            sum+=x;
        double mean=sum/N;

        sum=0.0;
        for(double x:numbers)
            sum+=(x-mean)*(x-mean);
        double std=Math.sqrt(sum/(N-1));
        StdOut.printf("Mean:%.2f\n",mean);
        StdOut.printf("Std dev:%.2f\n",std);
    }

}
