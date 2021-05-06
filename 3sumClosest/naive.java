//https://practice.geeksforgeeks.org/problems/three-sum-closest/1/?track=md-arrays&batchId=144


class Solution { 
    static int threeSumClosest(int[] ar, int target)  { 
        int close_sum = Integer.MAX_VALUE;
        
        // run 3 nested loops to check the closest one
        for(int i = 0; i < ar.length; i++) {
            for(int j = i+1; j < ar.length; j++) {
                for(int k = j+1; k < ar.length; k++) {
                    //update closest sum
                    if(Math.abs(target-close_sum) > 
                    Math.abs(target-(ar[i]+ar[j]+ar[k])))
                        close_sum = (ar[i]+ar[j]+ar[k]);
                }
            }
        }
        return close_sum;
	} 
} 
