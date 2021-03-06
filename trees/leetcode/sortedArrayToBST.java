// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }
    
    public TreeNode sort(int nums[], int low, int high) {
        if(low > high)
            return null;
        int mid = low + (high - low )/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sort(nums, low, mid - 1);
        root.right = sort(nums, mid + 1, high);
        return root;
    }
}