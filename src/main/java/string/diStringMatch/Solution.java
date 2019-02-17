package string.diStringMatch;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 4:26 PM 2019/1/28
 * @Version :
 */
public class Solution {

    public int[] diStringMatch(String S) {

        if (S == null || S.isEmpty()) {
            return null;
        }

        int N = S.length();

        int I = 0;

        int D = N;

        int[] A = new int[N + 1];

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'I') {
                A[i] = I;
                I++;
            }
            if (S.charAt(i) == 'D') {
                A[i] = D;
                D--;
            }
        }

        if (S.lastIndexOf("I") == (N - 1)) {
            A[N] = I;
        } else {
            A[N] = D;
        }

        return A;
    }

}
