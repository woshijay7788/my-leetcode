package islandPerimeter;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 4:13 PM 2019/1/30
 * @Version :
 */
public class Solution {

    public int islandPerimeter(int[][] grid) {

        int row = grid.length;
        int column = grid[0].length;
        int result = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    if (j > 0 && grid[i][j - 1] != 1 || j == 0) {
                        result++;
                    }
                    if (j >= 0 && j + 1 < column && grid[i][j + 1] != 1 || j == column - 1) {
                        result++;
                    }
                    if (i >= 0 && i + 1 < row && grid[i + 1][j] != 1 || i == row - 1) {
                        result++;
                    }
                    if (i > 0 && grid[i - 1][j] != 1 || i == 0) {
                        result++;
                    }
                }


            }
        }

        return result;
    }
}
