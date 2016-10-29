package set;

import java.util.HashSet;
/*
 * Hashset demo
 * **/
public class HashSetDemo {
	
public static void main(String[]args){
	HashSet h= new HashSet();
	h.add("B");
	h.add("A");//String can be added
	h.add("Z");
	h.add(10);//Integer can be added
	//since String, Integer and other objects can be added to same hashset so it accepts heterogeneous objects
	h.add(null);//null can be added
	System.out.println(h.add("A"));// will return false, Return type of add is boolean
	System.out.println(h);
}

}
