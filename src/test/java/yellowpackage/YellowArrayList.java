package yellowpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class YellowArrayList {
	
	public static void main(String[] arg) {
		listMethods();
	}
	
	public static void listMethods() {
		ArrayList<String> ll = new ArrayList<>();
		
		ll.add("Mandeep");
		ll.add("Kaju");
		ll.add("Monika");
		ll.add("Nitara");
		ll.add("Monika");
		ll.add(null);
		
		Collections.sort(ll);
		
	//	System.out.println(ll);
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("=================Get Method===================");
		
		System.out.println(ll.get(1));
		
		System.out.println("=================Remove method===================");
		
		System.out.println(ll.remove(3));
		
		System.out.println("==================After remove==================");
		
		System.out.println(ll);
		
		System.out.println("=================Add at specific location===================");
		
		ll.add(2, "Vivan");
		
		System.out.println(ll);
		
		System.out.println("===============Check contains=====================");
		
		System.out.println(ll.contains("Vivan"));
		
	}

}
