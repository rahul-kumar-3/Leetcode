/*Leetcode Problem 136
Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*/
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
