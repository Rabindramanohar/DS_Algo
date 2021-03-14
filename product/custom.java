public static long[] productExceptSelf(int ar[], int n) { 
        long[] product = new long[n];
        long ans = 1;
        
        for(int i = 0; i < n; i++) {
            if(ar[i] == 0)
                continue;
            ans *= ar[i];
        }
        // System.out.println(ans);
        for(int i = 0; i < n; i++) {
            if(ar[i] == 0) {
                product[i] = product[i] - ar[i];
                continue;
            }
            if(ans == ar[i]) {
                product[i] = 0;
                continue;
            }
            product[i] = ans/ar[i];
        }
        return product;
	} 
