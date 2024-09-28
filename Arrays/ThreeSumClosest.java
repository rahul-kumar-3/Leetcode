/*Leetcode Problem
Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0)
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
/*Optimize code 
Time complexity: O(N2)
*/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target - closestSum) > Math.abs(target - sum)){
                    closestSum = sum;
                }
                if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closestSum;
    }
}
