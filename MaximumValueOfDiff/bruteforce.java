class Solution {
    static int maxValue(int[] ar, int N) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                ans = Math.max(ans, Math.abs(ar[i] - ar[j])+
                        Math.abs(i-j));
            }
        }
        return ans;
    }
};
