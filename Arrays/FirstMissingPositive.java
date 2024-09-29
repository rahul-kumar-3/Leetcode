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
/*Time Complexity O(n)*/
class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int n : nums){
            if(n > 0){
                map.put(n,true);
            }
        }
        int posNo = 1;
        while(true){
            if(map.get(posNo) == null) return posNo;
            posNo++;
        }
    }
}
