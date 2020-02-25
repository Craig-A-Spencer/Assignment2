package cse360assign2;

/* Name: Craig Spencer
 * Class ID: 126
 * Assignment: 1
 * Description:
 * This class creates a array list with simple functions that allow the user to
 * manipulate this short integer array. This list can also be return to the user 
 * as a String using the toString() method.
*/

public class SimpleList {

	//Instance variables
	private int[] list;
	private int count;
	final int LIST_SIZE = 10;
	
	//Constructor for the SimpleList class
	SimpleList () {
		list = new int[LIST_SIZE];
		count = 0;
	}
	
	//Adds a new number to the list
	public void add(int newNum) {
		for (int index = LIST_SIZE - 2; index >= 0; index--) {
			list[index + 1] = list[index];
		}
		
		list[0] = newNum;
		
		if (count < LIST_SIZE)
			count++;
	}
	
	//Removes a specified element from the list
	public void remove(int num) {
		int position = search(num);
		
		while (position != -1) {
			for (int index = position; index < LIST_SIZE - 1; index++) {
				list[index] = list[index + 1];
			}
			
			list[LIST_SIZE - 1] = 0;
			count--;
			position = search(num);
		}
	}
	
	//Getter method for the count variable
	public int count() {
		return count;
	}
	
	//Returns a formated string version of the list array
	public String toString() {
		String output = "";
		
		for (int index = 0; index < count; index++) {
			output += list[index];
			
			if (index < count - 1) {
				output += " ";
			}
		}
		
		return output;
	}
	
	//Gives the first index of a specified number
	public int search(int num) {
		int position = -1;
		for (int index = count - 1; index >= 0; index--) {
			if (list[index] == num)
				position = index;
		}
		
		return position;
	}
	
	
	//Used for testing only
	public int[] getArr() {
		return list;
	}
}