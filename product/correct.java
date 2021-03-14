class Solution 
{ 
	public static long[] productExceptSelf(int ar[], int n) { 
        long[] prod = new long[n];
        if(n == 1) {
            prod[0] = 1;
            return prod;
        }
        
        long[] left = new long[n];
        long[] right = new long[n];
        
        int i, j;
        left[0] = 1;
        right[n-1] = 1;
        
        for(i = 1; i < n; i++) {
            left[i] = ar[i-1] * left[i-1];
        }
        for(j = n-2; j >= 0; j--) {
            right[j] = ar[j+1] * right[j+1];
        }
        for(i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];
        }
        
        return prod;
	} 
} 
