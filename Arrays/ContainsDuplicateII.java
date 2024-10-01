/*Leetcode Problem 
219. Contains Duplicate II
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Creating HashSet to store unique value 
        Set<Integer> set = new HashSet<>();
        //Iterating the array
        for(int i = 0; i < nums.length; i++){
            //if set already contains the current element
            // it means we faund duplicate element
            if(set.contains(nums[i])){
                return true;
            }
            //adding current element to the set
            set.add(nums[i]);

            // if the set size is greater than k
            // removing the element at the previous index
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
