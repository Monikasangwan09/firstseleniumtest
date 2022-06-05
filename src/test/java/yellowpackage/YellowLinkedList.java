package yellowpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class YellowLinkedList {
	
	public static void main(String[] arg) {
		linkedListMethod();
	}
	
	public static void linkedListMethod() {
		
	//	LinkedList<String> ll = new LinkedList<>();
		Set<String> ll = new HashSet<>();
		
		ll.add("Mandeep");
		ll.add("Kaju");
		ll.add("Monika");
		ll.add("Nitara");
		ll.add("Monika");
		ll.add(null);
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//ll.add(2, "Vivan");
		
	//	System.out.println(ll);
		
	//	ll.remove(3);
		
	}

}
