void rearrange(int ar[], int N) {
        ArrayList<Integer> alpos = new ArrayList<>();
        ArrayList<Integer> alneg = new ArrayList<>();
        
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] < 0) {
                alneg.add(ar[i]);
            } else {
                alpos.add(ar[i]);
            }
        }
        
        System.out.println(alpos);
        System.out.println(alneg);
        
        int p = 0, n = 0, i = 0;
        
        for(i = 0; i < alpos.size(); i++) {
            
            if(i%2 == 0)
                ar[i] = alpos.get(p++);
            else 
                ar[i] = alneg.get(n++);
                
        }
        while(i < ar.length) {
            if(alpos.size() != 0)
                ar[i++] = alpos.get(p++);
        }
        while(i < ar.length) {
            if(alneg.size() != 0)
                ar[i++] = alneg.get(n++);
        }
    }
