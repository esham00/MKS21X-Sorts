import java.util.*;
public class Driver {
    public static void main (String[] args) {
	if (args.length > 0) {
	    Random num = new Random();
	    for(int i = 0; i < Integer.parseInt(args[0]); i++) {
		int[] ary =  new int[5];
		for (int j = 0; j < ary.length; j++) {
		    ary[j] = num.nextInt()%10;
		}
		Sorts.bubbleSort(ary);
		System.out.println(Arrays.toString(ary));
	    }
	}
	else {
	    System.out.println("input the amount of times you wanna run sort");
	}
    }
}
