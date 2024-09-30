/*Leetcode 
Problem 162
Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/
class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0; 
        int j = nums.length-1;
        while(i < j){
            int mid = (i + j)/2;
            if(nums[mid] > nums[mid+1]){
                j = mid;
            }
            else{
                i = mid+1;
            }
        }
        return i;
    }
}
