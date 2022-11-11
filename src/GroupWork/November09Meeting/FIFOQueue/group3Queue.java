package GroupWork.November09Meeting.FIFOQueue;

import java.util.Stack;

public class group3Queue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    int dequeue() {

        peek();
        return stack2.pop();
    }

    int peek() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    boolean empty() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        }
        return false;
    }

    void enqueue(int num) {
        stack1.push(num);

    }


}
