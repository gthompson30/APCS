// Team Not Gonna Lie (Nafiz Labib, Gabriel Thompson, Lauren Lee)
// APCS
// HW89 -- Queue Two Ways
// 2022-04-11
// time spent: 0.3hrs

import java.util.LinkedList;

public class LLQueue<T> implements Queue<T> {

	LinkedList queue;

	public LLQueue() {
		this.queue = new LinkedList<T>();
	}

	public T dequeue() {
		return (T) this.queue.removeFirst();
	}

	public void enqueue( T x ) {
		this.queue.addLast(x);
	}

	public boolean isEmpty() {
		return this.queue.size() == 0;
	}

	public T peekFront() {
		return (T) this.queue.getFirst();
	}

}
