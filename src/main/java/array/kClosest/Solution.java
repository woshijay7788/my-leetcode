package array.kClosest;

import java.util.Arrays;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:21 PM 2019/1/22
 * @Version :
 */
public class Solution {

    public int[][] kClosest(int[][] points, int K) {
        int N = points.length;
        int[] dists = new int[N];
        for (int i = 0; i < N; ++i) {
            dists[i] = dist(points[i]);
        }

        Arrays.sort(dists);
        int distK = dists[K - 1];

        int[][] ans = new int[K][2];
        int t = 0;
        for (int i = 0; i < N; ++i) {
            if (dist(points[i]) <= distK) {
                ans[t++] = points[i];
            }
        }
        return ans;
    }

    public int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
