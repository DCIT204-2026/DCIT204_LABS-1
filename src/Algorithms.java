public class Algorithms {

	/**
	 * Linear Search: Checks each element one by one
	 * @param array the array to search in
	 * @param target the value to find
	 * @return index of target if found, else -1
	 */
	public static int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Binary Search: Requires a sorted array
	 * @param array the sorted array to search in
	 * @param target the value to find
	 * @return index of target if found, else -1
	 */
	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				return mid;
			}

			if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
