package p1;

import java.util.LinkedList;

public class Main {
public static void main(String[] args) {
	LinkedList<String> ob=new LinkedList<String>();
	ob.add("A");
	ob.add("B");
	ob.addLast("C");
	ob.addFirst("D");
	ob.add(2,"E");
	ob.add("F");
	ob.add("G");
	System.out.println("Linked list: "+ob);
	 ob.remove("B");
	 ob.remove(3);
	 ob.removeFirst();
	 ob.removeLast();
	 System.out.println("Linked list after deletion: "+ob);
	 boolean status=ob.contains("E");
	 if(status){
		 System.out.println("List contains the element 'E' ");
	 } 
		 else{
			 
		 System.out.println("List does not contains the element 'E' ");
	 }
	int size=ob.size();
	System.out.println("Size of the linked list" + size);
	Object e=ob.get(2);
	System.out.println("element returned by get: "+ e);
	ob.set(2,"Y");
	System.out.println("Linkedlist after change: "+ ob);
	
	
}
}
