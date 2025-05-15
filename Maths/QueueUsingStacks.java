import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();

    // Enqueue operation: O(1)
    public void enqueue(int x) {
        pushStack.push(x);
    }

    // Dequeue operation: Amortized O(1)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }

        return popStack.pop();
    }

    // Peek operation: Amortized O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }

        return popStack.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peek());   // Output: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 10
        System.out.println("Peek: " + queue.peek());   // Output: 20
        System.out.println("Is Empty: " + queue.isEmpty()); // Output: false

        queue.dequeue(); // Removes 20
        queue.dequeue(); // Removes 30
        queue.dequeue(); // Queue is empty
    }
}
