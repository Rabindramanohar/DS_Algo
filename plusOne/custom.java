class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> al , int N) {
        ArrayList<Integer> resAl = new ArrayList<>();
        String strNum = "";
        
        if(al.get(0) == 0 && al.size() == 1) {
            al.set(0, 1);
            return al;
        }
        
        for(int i = 0; i < al.size(); i++) {
            strNum += al.get(i);
        }
        // System.out.println("strNum: "+strNum);
        long val = Long.parseLong(strNum);
        val = val+1;
        // System.out.println("val: "+val);
        
        while(val > 0) {
            long tmp = val%10;
            val /= 10;
            // list.add(0, yourObject);
            resAl.add(0, (int)tmp);
        }
        for(int i = 0; i < al.size(); i++) {
            
            if(al.get(i) == 0)
                resAl.add(0, 0);
            else
                break;
            
            
        }
        
            
        return resAl;
    }
};
