import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main 
{
    public static void main(String[] args) 
    {
        // Queue is a First In, First Out Collection(FIFO) which means that the elements are accessible(peek, remove) in the order in which they were added.

        // Queue is an Interface in Java and LinkedList is a concrete implementation.

        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Peeking at the front element
        System.out.println("\n\nFront element: " + queue.peek());

        // Removing elements from the Queue
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        // Size of queue
        System.out.println(queue.size());

        // Element exists in the queue
        System.out.println(queue.contains("Element 2"));

        // Iterating through the Queue
        System.out.println("Queue elements:");
        for(String element : queue) 
        {
            System.out.println(element);
        }



        // Stack is a Last In, First Out Collection(LIFO) which means that the elements are accessible(peek, remove) in the reverse order in which they were added.

        Stack<String> stack = new Stack<>();

        // Pushing elements onto the Stack
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        // Checking the size of the Stack
        System.out.println("\n\nSize of the stack: " + stack.size());

        // Iterating through the Stack
        System.out.println("Elements in the stack:");
        for (String element : stack) 
        {
            System.out.println(element);
        }

        // Checking if the Stack contains a specific element
        String elementToCheck = "Element 2";
        System.out.println("Does the stack contain '" + elementToCheck + "': " + stack.contains(elementToCheck));

        // Popping elements from the Stack
        System.out.println("Popping elements from the stack:");
        while(!stack.isEmpty()) 
        {
            String poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
        }

        // Checking the size after popping
        System.out.println("Size of the stack after popping: " + stack.size());
    }
}