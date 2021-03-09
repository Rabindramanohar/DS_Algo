class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> al , int N) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 1;
        for(int i = N-1; i >= 0; i--) {
            int digit = (al.get(i)+carry)%10;
            carry = (al.get(i)+carry)/10;
            list.add(digit);
        }
        
        if(carry != 0)
            list.add(1);
            
            // Collections.reverse(arrayli);
            Collections.reverse(list);
            
        return list;
    }
};
