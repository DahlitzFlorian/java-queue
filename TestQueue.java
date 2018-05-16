/**
 * Tests the Queue class
 *
 * @author Florian Dahlitz
 */
import java.lang.*;


public class TestQueue {
	public static void main(String[] args) {
		Queue<String> string_queue = new Queue<String>();
		System.out.println("-------------------- String Queue --------------------");
		System.out.println("The queue is empty: " + string_queue.isEmpty());
		string_queue.add("Hello");
		string_queue.add("World");
		System.out.println("The queue is empty: " + string_queue.isEmpty());
		System.out.println("The queue consists of: " + string_queue.toString());
		System.out.println("The first element is: " + string_queue.remove());
		System.out.println("The second element is: " + string_queue.remove());
		System.out.println("The queue is empty: " + string_queue.isEmpty());
		System.out.println("The queue consists of: " + string_queue.toString());
		string_queue.add("Hello");
		string_queue.add("World");
		string_queue.add("Java");
		string_queue.add("World");
		System.out.println("The queue consists of: " + string_queue.toString());

		Queue<Integer> int_queue = new Queue<Integer>();
		System.out.println("-------------------- Integer Queue --------------------");
		System.out.println("The queue is empty: " + int_queue.isEmpty());
		int_queue.add(24);
		int_queue.add(36);
		System.out.println("The queue is empty: " + int_queue.isEmpty());
		System.out.println("The queue consists of: " + int_queue.toString());
		System.out.println("The first element is: " + int_queue.remove());
		System.out.println("The second element is: " + int_queue.remove());
		System.out.println("The queue is empty: " + int_queue.isEmpty());
		System.out.println("The queue consists of: " + int_queue.toString());
		int_queue.add(42);
		int_queue.add(6);
		int_queue.add(11);
		int_queue.add(1201);
		System.out.println("The queue consists of: " + int_queue.toString());

		System.out.println("-------------------- End of Test Cases --------------------");
	}
}