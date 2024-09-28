/*Leetcode Problem
  18.4Sum
  Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]*/
//====================================================================================================================================================================
/*Brute Force Approach 
Time Complexity O(n^4)*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();
        for(int p = 0; p < nums.length; p++){
            for(int q = p+1; q < nums.length; q++){
                for(int r = q+1; r < nums.length; r++){
                    for(int s = r+1; s < nums.length; s++){
                        if(nums[p]+nums[q]+nums[r]+nums[s] == target){
                            List<Integer> temp = Arrays.asList(nums[p],nums[q],nums[r],nums[s]);
                            temp.sort(null);
                            st.add(temp);
                        }
                    }
                }
            }
          
        }
          List<List<Integer>> ans = new ArrayList(st);
            return ans;
    }
}

//===================================================================================================================================================================
