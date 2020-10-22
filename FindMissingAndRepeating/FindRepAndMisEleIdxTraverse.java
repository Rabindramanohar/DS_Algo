package array.repeatingAndMissingEle.all;

//it will give complexity n,1 but here we disrubt the value

public class FindRepAndMisEleIdxTraverse {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
    }
    public static  void printTwoElements(int[] ar, int n) {
        for(int i = 0; i < n; i++) {
            int absVal = Math.abs(ar[i]);

            if(ar[absVal-1] > 0)
                ar[absVal-1] = -ar[absVal-1];
            else
                System.out.print("Repeating: "+absVal);
        }
        for(int i = 0; i < n; i++) {
            if(ar[i] > 0)
                System.out.print(" missing: "+(i+1));
        }
    }
}
