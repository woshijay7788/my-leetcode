package easy.array.intersection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 9:58 AM 2019/1/29
 * @Version :
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.get(nums2[i]) != null) {
                result.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }

        int[] arr = new int[result.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }
}
