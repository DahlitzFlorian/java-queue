/**
 * Class implementing the Queue interface
 *
 * @author Florian Dahlitz
 */
public class Queue<T> implements IQueue<T> {
	private T[] queue;
	private int total, first, next;

	public Queue() {
		queue = (T[]) new Object[3];
	}

	public Queue<T> add(T element)
    {
        if (queue.length == total) 
        	resize(queue.length * 2);
        
        queue[next++] = element;
        
        if (next == queue.length) 
        	next = 0;
        
        total++;
        
        return this;
    }

    public T remove()
    {
        if (total == 0) 
        	throw new java.util.NoSuchElementException();
        
        T element = queue[first];
        queue[first] = null;
        
        if (++first == queue.length) 
        	first = 0;
        
        if (--total > 0 && total == queue.length / 4) 
        	resize(queue.length / 2);
        
        return element;
    }

    public boolean isEmpty() {
    	if(next == 0)
    		return true;

    	return false;
    }

    private void resize(int capacity)
    {
        T[] tmp = (T[]) new Object[capacity];

        for (int i = 0; i < total; i++)
            tmp[i] = queue[(first + i) % queue.length];

        queue = tmp;
        first = 0;
        next = total;
    }

    @Override
    public String toString()
    {
        return java.util.Arrays.toString(queue);
    }
}
