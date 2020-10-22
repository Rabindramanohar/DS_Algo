package array.repeatingAndMissingEle.all;

import java.util.Arrays;

/* 1st approach would be sort the array then find the adjecent repeating element #complexity: nlogn+n, 1*/
public class FindRepAndMisEle {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 4, 5, 5, 6, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
    }
    private static void printTwoElements(int[] ar, int n) {
        int missing = 0, repeating = 0;
        Arrays.sort(ar);
        for(int i =0; i < n-1; i++) {
            if(ar[0] != 1)
                missing = 1;
            if(ar[i+1]-ar[i] >= 2) {
//                System.out.print(ar[i]+ar[i+1]+" ");
                missing = ar[i] + 1;
            }
            if(ar[i] == ar[i+1])
                repeating = ar[i];
        }
        System.out.print(missing+" "+repeating);
    }
}
