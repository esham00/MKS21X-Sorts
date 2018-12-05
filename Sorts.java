public class Sorts {
    public static void selectionsort(int [] ary) {
	for (int i = 0; i < ary.length; i++) {
	    int min = ary[i];
	    int index = i;
	    for (int j = i; j < ary.length; j++) {
		if (ary [j] < min) {
		    min = ary[j];
		    index = j;
		}
	    }
	    ary[index] = ary[i];
	    ary[i] = min;
	}
    }
}
