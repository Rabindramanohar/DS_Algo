static int circularSubarraySum(int a[], int n) {
        
  int maxSum = 0, sum = 0;
  for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
      for(int k = i; k <= j; k++) {
        sum += a[k];
      }
      maxSum = Math.max(maxSum, sum);
      sum = 0;
    }
  }
  return maxSum;
    }
