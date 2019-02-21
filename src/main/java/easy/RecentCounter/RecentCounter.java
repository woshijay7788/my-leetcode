package easy.RecentCounter;

import java.util.LinkedList;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 5:27 PM 2019/1/25
 * @Version :
 */
public class RecentCounter {

    LinkedList<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.addLast(t);
        t = t - 3000;

        while (queue.getFirst() < t) {
            queue.removeFirst();
        }

        return queue.size();
    }

}
