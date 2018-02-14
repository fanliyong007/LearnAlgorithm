import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int right = 0;
        int left = a.length - 1;
        while (right < left) {
            int mid = right + (left - right) / 2;
            if (key < a[mid])
                left = mid - 1;
            else if (key > a[mid])
                right = mid + 1;
            else
                return mid;
//            while(a[mid]==key)
//            {
//                mid-=1;
//            }
//            return mid

        }
        return -1;
    }

    public static int count(int key, int[] a) {
        int right = 0;
        int left = a.length - 1;
        while (right < left) {
            int mid = right + (left - right) / 2;
            int num = 0;
            if (key < a[mid])
                left = mid - 1;
            else if (key > a[mid])
                right = mid + 1;
            else {
                while (a[mid] == key) {
                    num++;
                    mid -= 1;
                }
                return num;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] whitelist = In.readInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}