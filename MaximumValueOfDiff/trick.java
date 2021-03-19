class Solution {
    static int maxValue(int[] ar, int N) {
        int[] first = new int[N];
        int[] second = new int[N];
        
        for(int i = 0; i < N; i++) {
            first[i] = ar[i]+i;
            second[i] = ar[i]-i;
        }
        int max = first[0], min = first[0];
        // max and min value of first arr
        for(int i = 0; i < N; i++) {
            if(first[i] > max)
                max = first[i];
            if(first[i] < min)
                min = first[i];
        }
        int ans1 = max - min;
        // max and min value of second arr
        max = second[0];
        min = second[0];
        for(int i = 0; i < N; i++) {
            if(second[i] > max)
                max = second[i];
            if(second[i] < min)
                min = second[i];
        }
        int ans2 = max - min;
        
        int ans = Math.max(ans1, ans2);
        
        
        return ans;
    }
};
