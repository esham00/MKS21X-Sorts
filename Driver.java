import java.util.*;
public class Driver {
    public static void main (String[] args) {
	if (args.length > 0) {
	    Random num = new Random();
	    int[] ary =  new int[Integer.parseInt(args[0])];
	    for (int j = 0; j < ary.length; j++) {
		    ary[j] = num.nextInt()%10;
	    }
	    System.out.println(Arrays.toString(ary));
	    //Sorts.selectionSort(ary);
	    //Sorts.bubbleSort(ary);
	    Sorts.insertionSort(ary);
	    System.out.println(Arrays.toString(ary));
	}
	else {
	    System.out.println("input the length of the array");
	}
    }
}
