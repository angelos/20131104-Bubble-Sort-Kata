import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


public class BubbleSortTests {

	@Test
	public void sortSortedList() {
		checkBubbleSortedArrayReturnsExpected(new int[] {0, 1}, new int[] {0, 1});
	}
	
	@Test
	public void sortUnsortedListOfLengthTwo() throws Exception {
		checkBubbleSortedArrayReturnsExpected(new int[] {0,  1}, new int[] {1, 0});
	}
	
	@Test
	public void sortPartiallyUnsortedArrayOfLengthThree() {
		checkBubbleSortedArrayReturnsExpected(new int[] {0,  1, 2}, new int[] {0, 2, 1});
	}
	
	@Test
	public void sortUnsortedArrayOfLengthThree() {
		checkBubbleSortedArrayReturnsExpected(new int[]{0, 1, 2}, new int[]{2, 1, 0});
	}

	@Test
	public void sortUnsortedArrayOfLengthThreeWithSortedEnd() {
		checkBubbleSortedArrayReturnsExpected(new int[]{0, 1, 2, 3, 4}, new int[]{1, 2, 0, 3, 4});
	}

	private void checkBubbleSortedArrayReturnsExpected(int[] expectedArray, int[] inputArray) {
		assertArrayEquals(expectedArray, BubbleSort.sort(inputArray));
	}
}
