package easy.projectionArea;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:53 AM 2019/2/12
 * @Version :
 */
public class Solution {

    public int projectionArea(int[][] grid) {

        int len = grid.length;
        int result = 0;

        for (int i = 0; i < len; i++) {

            int bestRow = 0;
            int bestCol = 0;

            for(int j = 0; j < grid[i].length; j++){
                if (grid[i][j] > 0) {
                    result++;
                }
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            result += bestCol + bestRow;
        }

        return result;
    }
}
