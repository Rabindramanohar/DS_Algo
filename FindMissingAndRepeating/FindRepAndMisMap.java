package array.repeatingAndMissingEle.all;

// here the complexity: is n, n(map)

import java.util.HashMap;
import java.util.Map;

public class FindRepAndMisMap {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };

        Map<Integer, Boolean> hm = new HashMap<>();
        int n = arr.length;
        for(int i:arr) {
            if(hm.get(i) == null)
                hm.put(i, true);
            else
                System.out.print("Reapting: "+i+" ");
        }
        for(int i = 1; i <= n; i++) {
            if(hm.get(i) == null)
                System.out.print("Missing: "+i);
        }
    }
}
