package easy.MyHashSet;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:32 PM 2019/2/12
 * @Version :
 */
public class MyHashSet {

    int[] arr = new int[1000000];
    /** Initialize your data structure here. */
    public MyHashSet() {

    }

    public void add(int key) {
        arr[key] = 1;
    }

    public void remove(int key) {
        arr[key] = 0;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if (arr[key] == 1) {
            return true;
        } else {
            return false;
        }
    }
}
