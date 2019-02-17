package MyStack;

import java.util.LinkedList;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 4:35 PM 2019/2/12
 * @Version :
 */
public class MyStack {

    LinkedList<Integer> list;


    /** Initialize your data structure here. */
    public MyStack() {
        list = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        list.addLast(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return list.pollLast();
    }

    /** Get the top element. */
    public int top() {
        return list.peekLast();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.isEmpty();
    }
}
