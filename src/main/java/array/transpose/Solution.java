package array.transpose;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 7:35 PM 2019/1/24
 * @Version :
 */
public class Solution {

    public int[][] transpose(int[][] A) {
        int R = A.length;
        int C = A[0].length;

        int[][] newArr = new int[C][R];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                newArr[j][i] = A[i][j];
            }
        }

        return newArr;
    }
}
