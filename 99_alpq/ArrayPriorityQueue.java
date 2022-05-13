import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {

	ArrayList<Integer> _list;

	public ArrayPriorityQueue() {
		_list = new ArrayList<Integer>();
	}

	// O(n), b
	public void add( int x ) {
		int lo = _list.size() - 1;
		int hi = 0;
		int mid;

		while (hi <= lo) {
			mid = (hi + lo) / 2;
			if (_list.get(mid).compareTo(x) > 0) {
				hi = mid + 1;
			} else if (_list.get(mid).compareTo(x) < 0) {
				lo = mid - 1;
			} else {
				_list.add(mid, x);
				return;
			}

		}

		_list.add(hi, x);
	}

	public boolean isEmpty() {
		return _list.isEmpty();
	}

	public int peekMin() {
		return _list.get(_list.size()-1);
	}

	public int removeMin() {
		return _list.remove(_list.size() -1);
	}

	public String toString() {
		return _list.toString();
	}

	public static void main(String[] args) {
		ArrayPriorityQueue poo = new ArrayPriorityQueue();
		poo.add(5);
		poo.add(3);
		poo.add(4);
                poo.add(7);
                poo.add(8);
                poo.add(1);
                System.out.println("poo: "+  poo);

                System.out.println();
                System.out.println("min: " + poo.peekMin());
                System.out.println("removeMin: " + poo.removeMin());
                System.out.println("min: " + poo.peekMin());
                System.out.println("removeMin: " + poo.removeMin());
                System.out.println("min: " + poo.peekMin());
                System.out.println("removeMin: " + poo.removeMin());

                System.out.println();
                System.out.println("poo: "+  poo);
	}

}
