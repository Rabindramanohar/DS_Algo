//Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencycount(int ar[], int n) {
        for(int i = 0; i < n; i++)
            ar[i] -= 1;
            
        for(int i = 0; i < n; i++)
            ar[ar[i]%n] += n;
            
        for(int i = 0; i < n; i++)
            ar[i] = ar[i]/n;
    }
