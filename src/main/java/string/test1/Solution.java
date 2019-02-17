package string.test1;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:00 AM 2019/1/25
 * @Version :
 */
public class Solution {

    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder() ;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                String reverseStr = reverseStr(arr[i]);
                sb.append(reverseStr);
            } else {
                String reverseStr = reverseStr(arr[i]);
                sb.append(reverseStr + " ");
            }
        }

        return sb.toString();
    }

    public String reverseStr(String s){

        char[] arr = s.toCharArray();

        char[] newChar = new char[arr.length];
        int i = arr.length - 1;
        int j = 0;

        while (i >= 0) {
            newChar[j] = arr[i];
            j++;
            i--;
        }

        return new String(newChar);
    }
}
