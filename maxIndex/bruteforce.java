class Solution{
    
    // arr[]: input array
    // n: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int ar[], int n) { 
        
        int maxVal = -1;
        
        for(int i = 0; i < n; i++) {
            for(int j = n-1; j > i; --j) {
                if(ar[i] < ar[j] && maxVal < (j-i))
                    maxVal = j-i;
            }
        }
        
        return maxVal;
    }
}
// not done
