/**
 * Interfaces representing a Queue (FIFO)
 *
 * @author Florian Dahlitz
 */
public interface IQueue<T> {
	IQueue<T> add(T element);
	T remove();
	boolean isEmpty();
}
