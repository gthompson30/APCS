// Team Not Gonna Lie (Nafiz Labib, Gabriel Thompson, Lauren Lee)
// APCS
// HW89 -- Queue Two Ways
// 2022-04-11
// time spent: 0.3hrs

import java.util.ArrayList;

public class ALQueue<T> implements Queue<T> {

	ArrayList queue;

	public ALQueue() {
		this.queue = new ArrayList<T>();
	}

	public T dequeue() {
		return (T) this.queue.remove(0);
	}

	public void enqueue( T x ) {
		this.queue.add(0, x);
	}

	public boolean isEmpty() {
		return this.queue.size() == 0;
	}

	public T peekFront() {
		return (T) this.queue.get(0);
	}

}
