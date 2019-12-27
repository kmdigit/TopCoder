class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val arr = nums1.plus(nums2).sorted()
        val mid = arr.size / 2
        
        return if (arr.size % 2 == 0)
            (arr[mid] + arr[mid - 1]).toDouble() / 2
        else
            arr[mid].toDouble()
    }
}
