public class Sorts {
    public static void selectionSort(int [] ary) {
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
    public static void bubbleSort(int[] data) {
	for(int i = 0; i < data.length-1; i++) {
	    for (int j = 0; j < data.length-i; j++) {
		if (data[i] > data[i+1]) {
		    int old = data[i];
		    data[i] = data[i+1];
		    data[i+1] = old;
		    System.out.println("larger: " + old);
		    System.out.println("smaller: " + data[i]);
		}
	    }
	}
    }
}
