/*Leetcode Problem
Time Complexity O(n2)*/
//=======================================================================================================================================================
class Solution {
    public int firstMissingPositive(int[] nums) {
         int posNo = 1;
        while(true){
            boolean exists = false;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == posNo){
                    exists = true;
                    break;
                }
            }
            if(!exists) return posNo;
            posNo++;
        }
    }
}
//===========================================================================================================================================================
