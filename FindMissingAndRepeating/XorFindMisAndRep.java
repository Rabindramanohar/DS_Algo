package array.repeatingAndMissingEle.all;

// complexity : 4n, 1

public class XorFindMisAndRep {
    static int x, y;
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 1, 6, 2};

        int n = arr.length;
        getTwoElements(arr, n);
        System.out.println(" The missing element is  "
                + x + " and the "
                + "repeating number is "
                + y);
    }
    public static void getTwoElements(int[] ar, int n) {
        int XOR = ar[0];

        for(int i=1; i<n; i++) {
            XOR = XOR^ar[i];
            //System.out.print(XOR);
        }

        for(int i = 1; i <= n; i++) {
            XOR = XOR^i;
        }

        int setBit = (XOR & -XOR);

        for(int i=0; i<n; i++) {
            if((setBit & ar[i]) != 0)
                x = x^ar[i];
            else
                y = y^ar[i];
        }

        for(int i=1; i<=n; i++) {
            if((setBit & i) != 0)
                x = x^i;
            else
                y = y^i;
        }
    }
}
