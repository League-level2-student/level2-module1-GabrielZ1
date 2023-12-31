package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class

		ArrayList<String> strings = new ArrayList<String>();

		//2. Add five Strings to your list

		strings.add("abc");
		strings.add("bcd");
		strings.add("cde");
		strings.add("def");
		strings.add("efg");

		//3. Print all the Strings using a standard for-loop

		for(int i = 0; i<strings.size(); i++) {
			System.out.println(strings.get(i));
		}

		System.out.println("\n");

		//4. Print all the Strings using a for-each loop

		for(String s : strings) {
			System.out.println(s);
		}
		System.out.println("\n");

		//5. Print only the even numbered elements in the list.

		for(int i = 0; i<strings.size(); i++) {
			if(i % 2 == 0) {
				System.out.println(strings.get(i));
			}
		}
		System.out.println("\n");

		//6. Print all the Strings in reverse order.

		for(int i = strings.size()-1; i >= 0; i--) {
			System.out.println(strings.get(i));
		}
		System.out.println("\n");

		//7. Print only the Strings that have the letter 'e' in them.

		for(String s : strings) {
				if(s.indexOf('e') != -1) { // if this is equal to -1, that means there is no e in the string
					System.out.println(s);
				}	
		}
	}
}
