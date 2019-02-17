package tree.sortedArrayToBST;

import tree.TreeNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:27 AM 2019/1/28
 * @Version :
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null ||  nums.length == 0) {
            return null;
        }

        return build(nums, 0, nums.length - 1);
    }


    public TreeNode build(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        if (left == right) {
            return new TreeNode(nums[left]);
        }

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, left, mid - 1);
        root.right = build(nums, mid + 1, right);
        return root;
    }

}
