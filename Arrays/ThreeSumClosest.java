/*Leetcode Problem
Time Complexity O(n3)*/
//===========================================================================================================================================
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    int sum = nums[i] + nums[j]+ nums[k];
                    if(Math.abs(target - closestSum) > Math.abs(target - sum)){
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
        
    }
}

//====================================================================================================================================================
