package easy.array.nextGreaterElement;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:39 AM 2019/2/12
 * @Version :
 */
public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j; k < nums2.length; k++) {
                        if (k + 1 < nums2.length && nums1[i] < nums2[k + 1]) {
                            result[i] = nums2[k + 1];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4};
        int[] arr2 = new int[]{1, 2, 3, 4};

        System.out.println(new Solution().nextGreaterElement(arr1, arr2));
    }
}
/**
 * [1,3,5,2,4]
 * [6,5,4,3,2,1,7]
 * [7,7,7,7,7]
 **/