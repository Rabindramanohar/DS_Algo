package array.repeatingAndMissingEle.all;

// here complexity is n,1
import java.util.Vector;

public class FindRepAndMis2Eqs {
    public static void main(String[] args) {
        int[] v = { 4, 3, 6, 2, 1, 6, 7 };
        Vector<Integer> res = repeatedNumber(v);
        for (int x : res)
        {
            System.out.print(x + " ");
        }
    }
    public static Vector<Integer> repeatedNumber(int[] ar) {
        Vector<Integer> vec = new Vector<>();
        int n = ar.length;
        int sum_N = (n*(n+1))/2;
        int sum_NSq = (n*(n+1)*(2*n+1))/6;
        int missing, repeating;

        for (int j : ar) {
            sum_N -= j;
            sum_NSq -= j * j;
        }

        missing = (sum_N + sum_NSq/sum_N)/2;
        repeating = missing - sum_N;

        vec.add(missing);
        vec.add(repeating);

        return vec;
    }
}
