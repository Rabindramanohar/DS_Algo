class Solution {
    public long kthElement( int ar1[], int ar2[], int n, int m, int k) {
        int p = 0, i = 0, j = 0;
        
        while(i < n && j < m) {
            if(ar1[i] < ar2[j]) {
                p++;
            if(p == k)
                return ar1[i];
            i++;
            } else {
                p++;
                if(p == k) 
                    return ar2[j];
                j++;
            }
        }
        
        while(i < n) {
            p++;
            if(p == k)
                return ar1[i];
            i++;
        }
        
        while(j < m) {
            p++;
            if(p == k)
                return ar2[j];
            j++;
        }
        
        return -1;
    }
}
