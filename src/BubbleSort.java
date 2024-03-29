
public class BubbleSort {
	
	public static int[] sort(int[] array) {
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for(int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					swapped = true;
				}
			}
		}
		return array;
	}

}
