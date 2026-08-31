package collectionsOperations;

import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        // 1. Create PriorityQueue of Integers
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 2. Add items into the queue: {1, 5, 58, 0, 58, 75}
        queue.add(1);
        queue.add(5);
        queue.add(58);
        queue.add(0);
        queue.add(58);
        queue.add(75);

        // 3. Print the whole queue

        System.out.println("Queue: " + queue);

        // 4. Print the first/highest-priority element using peek()
        System.out.println("First element (peek): " + queue.peek());

        // 5. Add 5 using offer()
        queue.offer(5);

        // 6. Add 40 using add()
        queue.add(40);

        // 7. Remove the first/highest-priority element using poll()
        System.out.println("Removed highest-priority element: " + queue.poll());

        // 8. Print the new first element using peek()
        System.out.println("New first element (peek): " + queue.peek());

        // 9. Print the size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // 10. Check whether the queue contains 58
        boolean contains58 = queue.contains(58);
        System.out.println("Contains 58? " + contains58);

        // 11. Check whether the queue contains 15
        boolean contains15 = queue.contains(15);
        System.out.println("Contains 15? " + contains15);

        // 12. Remove one occurrence of 58
        queue.remove(58);
        System.out.println("After removing one occurrence of 58, contains 58? " + queue.contains(58));

        // 13. Find the minimum element without using Collections.min()
        if (!queue.isEmpty()) {
            int min = queue.peek();
            for (int i : queue) {
                if (i < min) {
                    min = i;
                }
            }
            System.out.println("Minimum element: " + min);
        }

        // 14. Calculate the sum of all elements
        int sum = 0;
        for (int i : queue) {
            sum += i;
        }
        System.out.println("Sum of all elements: " + sum);

        // 15. Remove all even numbers
        queue.removeIf(n -> n % 2 == 0);
        System.out.println("Queue after removing all even numbers: " + queue);

        // 16. Print all elements in priority order using poll() until empty

        while (!queue.isEmpty()) {
            queue.poll();
        }
        System.out.println("Final queue size: " + queue.size());
    }
}