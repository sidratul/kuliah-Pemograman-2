package belajar.hashset;

import java.util.*;

public class Coba{
	public static void main(String[] args){
		SortedMap title = new TreeMap();
		title.put(new Integer(3),"Checker");
		title.put(new Integer(1),"Euchre");
		title.put(new Integer(4),"Chess");
		title.put(new Integer(2),"Tic Tac Toe");
		System.out.println(title);
	}
}