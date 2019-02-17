package test11;

import java.util.HashSet;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:35 PM 2019/1/18
 * @Version :
 */
public class Solution {

    private static String[] map = {
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        if (words == null) {
            return 0;
        }
        HashSet<String> set = new HashSet<>();
        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(map[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println('c' - 'a');
    }
}
