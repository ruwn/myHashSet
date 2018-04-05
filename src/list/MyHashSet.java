package list;

import java.util.HashSet;

public class MyHashSet extends HashSet<Month> {

	private static final long serialVersionUID = 1L;
	
	public boolean add(Month m) {
		if (super.add(m))
			return true;
		else {
			m.incrementCounter();
			return false;
		}
			
	}

}
