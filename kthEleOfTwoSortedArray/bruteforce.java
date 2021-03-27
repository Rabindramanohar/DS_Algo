class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int[] sorted1 = new int[m + n];
        int i = 0, j = 0, d = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                sorted1[d++] = arr1[i++];
            else
                sorted1[d++] = arr2[j++];
        }
        while (i < m)
            sorted1[d++] = arr1[i++];
        while (j < n)
            sorted1[d++] = arr2[j++];
        return sorted1[k - 1];
        
    }
}
