import java.util.*;
public class Driver {
    public static void main (String[] args) {
	int[] a = {2,3,5,1,0};
	int[] b = {0,1,2,0};
	int[] c = {0,1,1,3,2};
	int[] d = {};
	Sorts.selectionsort(d);
	Sorts.selectionsort(a);
	Sorts.selectionsort(b);
	Sorts.selectionsort(c);
      	System.out.println(Arrays.toString(a) + "\n" + Arrays.toString(b) + "\n" + Arrays.toString(c) + "\n" + Arrays.toString(d));
    }
}