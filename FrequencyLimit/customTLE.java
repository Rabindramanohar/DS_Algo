class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencycount(int ar[], int n) {
        int[] tmp = new int[n];
        Arrays.fill(tmp, 0);
        
        int i = 0;
        while(i < n) {
            tmp[ar[i] - 1]++;
            i++;
        }
        
        for(i = 0; i < n; i++) {
            ar[i] = tmp[i];
        }
    }
}
