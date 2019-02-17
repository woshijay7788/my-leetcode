package array.peakIndexInMountainArray;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 9:19 AM 2019/1/29
 * @Version :
 */
public class Solution {

    public int peakIndexInMountainArray(int[] A) {

        if (A == null || A.length < 3) {
            return 0;
        }

        int mid = A.length / 2;

        while (mid < A.length - 1) {
            if (A[mid] > A[mid + 1] && A[mid] > A[mid - 1]) {
                return mid;
            } else if (A[mid] < A[mid + 1]){
                mid++;
            } else {
                mid--;
            }
        }

        return 0;
    }
}
