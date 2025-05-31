package collecton_progrm;

import java.util.LinkedList;

public class LinkList_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll=  new LinkedList<String>();
		ll.add("Saddam");
		ll.add("Hussain");
		ll.add("Raza");
		//print
		System.out.println(ll);
		//add in specific index
		ll.add(2, "Ansari");
		System.out.println(ll);
		
		LinkedList<String> ll2 = new LinkedList<>();
		ll2.add("Kashif");
		ll2.add("Ali");
		ll2.add(2, "Raja");
		// add all linkedlist
		ll.addAll(ll2);
		System.out.println("after adding 2 Col"+ll);
		
		ll.set(2, "khan");
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		
		
		

	}

}
