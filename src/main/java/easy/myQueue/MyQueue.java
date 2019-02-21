package easy.myQueue;

import java.util.Stack;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:08 AM 2019/2/12
 * @Version :
 */
public class MyQueue {

    private Stack<Integer> push;

    private Stack<Integer> pop;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        push = new Stack<>();
        pop = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {

        while (!pop.isEmpty()) {
            push.push(pop.pop());
        }
        pop.push(x);
        while (!push.isEmpty()) {
            pop.push(push.pop());
        }


    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {

        return pop.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return pop.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return pop.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj = new MyQueue();
 * obj.push(x); int param_2 = obj.pop(); int param_3 = obj.peek(); boolean param_4 = obj.empty();
 */