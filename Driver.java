import java.util.*;
public class Driver {
    public static void main (String[] args) {
	    int[] ary =  new int[Integer.parseInt(args[0])];
	    for (int j = 0; j < ary.length; j++) {
		ary[j] = (int)Math.random() * 10000;
	    }
	    //System.out.println(Arrays.toString(ary));
	    //Sorts.selectionSort(ary);
	    //Sorts.bubbleSort(ary);
	    Sorts.insertionSort(ary);
	    //System.out.println(Arrays.toString(ary));
    }
}
