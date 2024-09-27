/*Leetcode problem
11.Container With Most Water
given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
*/
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int sum = 0;
        while(left < right){
            int temp = Math.min(height[left], height[right]) *(right - left);
            sum = Math.max(sum, temp);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return sum;
    }
}
