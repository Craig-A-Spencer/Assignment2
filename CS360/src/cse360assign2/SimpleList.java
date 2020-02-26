package cse360assign2;

/* Name: Craig Spencer
 * Class ID: 126
 * Assignment: 2
 * Description:
 * This class creates a array list with simple functions that allow the user to
 * manipulate this short integer array. This list can also be returned to the user 
 * as a String using the toString() method.
 * 
 * GitHub URL: https://github.com/Craig-A-Spencer/Assignment2.git
*/

public class SimpleList {

	//Instance variables
	private int[] list;
	private int count, currentListSize;
	
	//Constants
	final int INITIAL_SIZE = 10;
	final double INCREASE_AMT = 1.5;
	final double DECREASE_AMT = 0.75;
	
	//Constructor for the SimpleList class
	SimpleList () {
		currentListSize = INITIAL_SIZE;
		list = new int[currentListSize];
		count = 0;
	}
	
	//Adds a new number to the list
	public void add(int newNum) {
		//Increases the size of the array if needed
		if (count == currentListSize) {
			currentListSize *= INCREASE_AMT;
			int[] tempList = new int[currentListSize];
			
			for (int index = 0; index < count; index++) {
				tempList[index] = list[index];
			}
			
			list = tempList;
		}
		
		for (int index = currentListSize - 2; index >= 0; index--) {
			list[index + 1] = list[index];
		}
		
		list[0] = newNum;
		count++;
	}
	
	//Removes a specified element from the list
	public void remove(int num) {
		int position = search(num);
		
		while (position != -1) {
			for (int index = position; index < currentListSize - 1; index++) {
				list[index] = list[index + 1];
			}
			
			list[currentListSize - 1] = 0;
			count--;
			position = search(num);
		}
		
		//Decreases the size of the array if needed
		if (count < currentListSize * DECREASE_AMT) {
			currentListSize *= DECREASE_AMT;
			
			int[] tempList = new int[currentListSize];
			
			for (int index = 0; index < count; index++) {
				tempList[index] = list[index];
			}
			
			list = tempList;
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
	
	//Adds a new number but to the end of the list
	public void append(int newNum) {
		//Increases the size of the array if needed
		if (count == currentListSize) {
			currentListSize *= INCREASE_AMT;
			int[] tempList = new int[currentListSize];
			
			for (int index = 0; index < count; index++) {
				tempList[index] = list[index];
			}
			
			list = tempList;
		}
		
		list[count] = newNum;
		count++;
	}
	
	//returns the fist element in the list
	public int first() {
		return list[0];
	}
	
	//returns the current size of the list array
	public int size() {
		return currentListSize;
	}
	
	//Used for testing only
	public int[] getArr() {
		return list;
	}
}




















