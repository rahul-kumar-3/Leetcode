/*Leetcode Problem 
Time Complexity O(N)*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCons = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 1){
                count = 0;
                continue;
            }
            count++;
            maxCons = Math.max(maxCons,count);
        }
        return maxCons;
    }
}
