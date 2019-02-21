package easy.flipAndInvertImage;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:36 PM 2019/1/18
 * @Version :
 */
public class Solution {

    public int[][] flipAndInvertImage(int[][] A) {

        int C = A[0].length;
        for (int[] row : A) {
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }
        }

        return A;
    }
}
