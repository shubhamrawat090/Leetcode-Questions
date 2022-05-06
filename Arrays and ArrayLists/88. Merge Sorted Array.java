// Link: https://leetcode.com/problems/merge-sorted-array/

// Solution: Time O(M+N) Space O(M+N)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //merged Arr of size m+n
        int[] mergedArr = new int[m+n];
        
        //iterators for nums1, nums2 and mergedArr
        int itr1 = 0, itr2 = 0, i=0;
        
        //iterate till either nums1 or nums2 is fully traversed
        while(itr1<m && itr2<n) {
            //if nums1 has smaller value then add its value to merged arr and increment itr1 and i
            if(nums1[itr1] < nums2[itr2]) {
                mergedArr[i++] = nums1[itr1];
                itr1++;
            }
            //otherwise add its value to merged arr and increment itr2 and i
            else {
                mergedArr[i++] = nums2[itr2];
                itr2++;
            }
        }
        
        //if there is any value left in nums1, add it to mergedArr
        while(itr1<m) {
            mergedArr[i++] = nums1[itr1++];
        }
        //if there is any value left in nums2, add it to mergedArr
        while(itr2<n) {
            mergedArr[i++] = nums2[itr2++];
        }
        
        //add the merged arr values in nums1, as per required by the question
        for(int j=0; j<m+n; j++) {
            nums1[j] = mergedArr[j];
        }
    }
}