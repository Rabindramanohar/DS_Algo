//Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencycount(int ar[], int n) {
        int i = 0;
        while(i < n) {
            if(ar[i] <= 0) {
                i++;
                continue;
            }
            
            int eleIdx = (ar[i]-1)%n;
            
            if(ar[eleIdx] > 0) {
                ar[i] = ar[eleIdx];
                
                ar[eleIdx] = -1;
            } else {
                ar[eleIdx]--;
                ar[i] = 0;
                i++;
            }
        }
        
        for(i = 0; i < n; i++) {
            ar[i] = Math.abs(ar[i]);
        }
    }
