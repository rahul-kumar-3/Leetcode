/*Leetcode problem
4. Median of Two Sorted Arrays
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            list.add(nums1[i]);
        }
         for(int i = 0; i < nums2.length; i++){
            list.add(nums2[i]);
        }

        Collections.sort(list);

        if(list.size() % 2 != 0){
            return (double)list.get(list.size()/2);
        }
        double mid1 = list.get((list.size()/2)-1);
        double mid2 = list.get(list.size()/2);
        return (double) (mid1+mid2)/2;
    }
}
