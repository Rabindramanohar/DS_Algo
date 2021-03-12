void rearrange(int ar[], int n) {
        int i = -1, tmp = 0;
        for(int j = 0; j < n; j++) {
            if(ar[j] < 0) {
                i++;
                tmp = ar[i];
                ar[i] = ar[j];
                ar[j] = tmp;
            }
        }
        System.out.println(Arrays.toString(ar));
        int pos = i+1, neg = 0;
        while(pos < n && neg < pos && ar[neg] < 0) {
            tmp = ar[neg];
            ar[neg] = ar[pos];
            ar[pos] = ar[neg];
            pos++;
            neg += 2;
        }
    }
