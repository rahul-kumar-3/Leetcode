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
/*Optimize Approach
Time Complexity: O(N3)
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        List<List<Integer>> ans = new ArrayList<>();

        // sort the given array:
        Arrays.sort(nums);

        // calculating the quadruplets:
        for (int i = 0; i < n; i++) {
            // avoid the duplicates while moving i:
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                // avoid the duplicates while moving j:
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // 2 pointers:
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }

        return ans;
    }
}
