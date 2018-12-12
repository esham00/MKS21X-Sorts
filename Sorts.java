public class Sorts {
    //Sort by choosing the smallest integer and moving it to the front
    public static void selectionSort(int [] ary) {
	for (int i = 0; i < ary.length; i++) {
	    int min = ary[i];
	    int index = i;
	    //finding the smallest integer
	    for (int j = i; j < ary.length; j++) {
		if (ary [j] < min) {
		    min = ary[j];
		    index = j;
		}
	    }
	    //moving it to the front
	    ary[index] = ary[i];
	    ary[i] = min;
	}
    }
    //Sort by comparing the integer with all the integers in front of it and swapping indices if they are smaller
    public static void bubbleSort(int[] data) {
	for(int i = 0; i < data.length; i++) {
		boolean madeSwap = false;
		//looping through to see if the current int is smaller than the int after it 
	    for (int j = 0; j < data.length-i-1; j++) {
		//choosing the value at the next index
		int current = data[j];
	       	//if the current int is smaller than the int after, it swap places
		if (current > data[j+1]) {
		    madeSwap = true;
		    int greater  = current;
		    data[j] = data[j+1];
		    data[j+1] = greater;
		}
	    }
	    //ending checking early if they don't change places (which means that everything in order)
	    if (madeSwap == false) {
		i = data.length;
	    }
	}
    }
    //Sort by moving the next integer to its correct position in the "sorted array" part of the array
    public static void insertionSort(int[] data) {
	for(int i = 1; i < data.length; i++) {
	    //choosing the int to move
	    int current = data[i];
	    int j = i-1;
	    //loop through the sorted part of the array 
	    while (current < data[j] && j > 0) {
		//shifting the sorted part of the array by one
		data[j+1] = data[j];
		j--;
	    }
	    //if the current value belongs at the start of the sorted array, must run the loop one more time and set the index zero to current
	    if (data[0] > current) {
		data[j+1] = data[j];
		data[0] = current;
	    }
	    //inserting the current value at j+1 bc data[j] < current, so the correct insertion is j+1
	    else {
		data[j+1] = current;
	    }
	}
    }
}
	    		




