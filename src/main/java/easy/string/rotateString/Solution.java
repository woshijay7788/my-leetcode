package easy.string.rotateString;

import java.util.Arrays;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 4:25 PM 2019/1/21
 * @Version :
 */
public class Solution {

    public boolean rotateString(String A, String B) {
        int N = A.length();
        if (N != B.length()) {
            return false;
        }
        if (N == 0) {
            return true;
        }

        //Compute shift table
        int[] shifts = new int[N + 1];
        Arrays.fill(shifts, 1);
        int left = -1;
        for (int right = 0; right < N; ++right) {
            while (left >= 0 && (B.charAt(left) != B.charAt(right))) {
                left -= shifts[left];
            }
            shifts[right + 1] = right - left++;
        }

        //Find match of B in A+A
        int matchLen = 0;
        for (char c : (A + A).toCharArray()) {
            while (matchLen >= 0 && B.charAt(matchLen) != c) {
                matchLen -= shifts[matchLen];
            }
            if (++matchLen == N) {
                return true;
            }
        }

        return false;
    }

    public boolean rotateString1(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.length() == 0) {
            return true;
        }

        search:
        for (int s = 0; s < A.length(); ++s) {
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt((s + i) % A.length()) != B.charAt(i)) {
                    continue search;
                }
            }
            return true;
        }
        return false;
    }
}
