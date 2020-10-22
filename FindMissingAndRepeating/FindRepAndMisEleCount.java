package array.repeatingAndMissingEle.all;

// here complexity is n+n, n(tmp arr)

public class FindRepAndMisEleCount {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 4, 5, 5, 6, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
    }
    public static void printTwoElements(int[] ar, int n) {
        int missing = 0, repeating = 0;
        int[] tmp = new int[n+1];

        for(int i = 0; i < n; i++) {
            tmp[ar[i]] = 1;
        }
        for(int i = 0; i < n-1; i++) {
            if(tmp[i] == 0)
                missing = i;
            if(tmp[i] == tmp[i+1])
                repeating = i;
        }

        System.out.print(missing+" "+repeating);
    }
}
