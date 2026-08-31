package collectionsOperations;

import java.util.ArrayDeque;

public class ArrayDequeOperations {
    public static void main(String[] args) {
        // 1. Create ArrayDeque of Integers
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // 2. Add items: {1, 5, 58, 0, 58, 75}
        deque.push(1);
        deque.push(5);
        deque.push(58);
        deque.push(0);
        deque.push(58);
        deque.push(75);

        // 3. Print collection
        System.out.println("Deque: " + deque);

        // 4. Add 40 to the top/end (using push() for stack top)
        deque.push(40);

        // 5. Print the top element without removing it
        System.out.println("Top element (peek): " + deque.peek());

        // 6. Remove the top element
        System.out.println("Removed top element: " + deque.pop());

        // 7. Print the size
        System.out.println("Size of collection: " + deque.size());

        // 8. Check whether they contain 58
        boolean contains58 = deque.contains(58);
        System.out.println("Contains 58? " + contains58);

        // 9. Calculate the sum of all elements
        int sum = 0;
        for (int i : deque) {
            sum += i;
        }
        System.out.println("Sum of all elements: " + sum);

        // 10. Find the maximum number
        int max = deque.peek();
        for (int i : deque) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum number: " + max);

        // 11. Remove all even numbers
        deque.removeIf(n -> n % 2 == 0);
        System.out.println("After removing even numbers: " + deque);

        // 13. Remove and print all elements one by one in LIFO order
        System.out.println("\nRemoving elements in LIFO order ");
        while (!deque.isEmpty()) {
            System.out.print(deque.pop() + " ");
        }
        System.out.println();

        // 14. Add {10, 20, 30, 40} and print them in reverse order
        System.out.println("Add {10, 20, 30, 40} & print in reverse order");
        deque.push(10);
        deque.push(20);
        deque.push(30);
        deque.push(40);
        System.out.println(deque);

        // ==========================================
        // ArrayDeque-Specific Tasks
        // ==========================================
        System.out.println("\n--- ArrayDeque-Specific Operations ---");
        ArrayDeque<Integer> specificDeque = new ArrayDeque<>();

        // 15. Add 5 at the beginning using addFirst()
        specificDeque.addFirst(5);

        // 16. Add 100 at the end using addLast()
        specificDeque.addLast(100);

        // 17. Print first and last elements
        System.out.println("First element (getFirst): " + specificDeque.getFirst());
        System.out.println("Last element (getLast): " + specificDeque.getLast());

        // 18. Remove first and last elements
        specificDeque.removeFirst();
        specificDeque.removeLast();
        System.out.println("After removing first and last: " + specificDeque);

        // 19. Use ArrayDeque as a queue and print {10, 20, 30, 40} in FIFO order
        System.out.println("FIFO Queue Operations");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.print("Printing in FIFO order: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}