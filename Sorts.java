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
	    //looping through to see if the current int is smaller than the int after it 
	    for (int j = 0; j < data.length-i-1; j++) {
		//choosing the value at the next index
		int current = data[j];
		//if the current int is smaller than the int after, it swap places
		if (current > data[j+1]) {
		    int greater  = current;
		    data[j] = data[j+1];
		    data[j+1] = greater;
		}
	    }
	}
    }
}
