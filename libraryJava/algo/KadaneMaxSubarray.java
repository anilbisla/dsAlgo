import java.util.Arrays;
import java.util.List;

class KadaneMaxSubarray {
	public static void main(String args[]) throws Exception {

		List<Integer> array = Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3, -9, -9, -2, -3, 4, -1, -2, 1, 5, -3);
		
		getMaxSubarray(array);
	}

	private static void getMaxSubarray(List<Integer> array) {
		long maxSoFar = array.get(0);
		long currMax = array.get(0);
		int maxStart = 0;
		int maxEnd = 0;
		int currStart = 0;
		
		for (int i = 1; i < array.size(); i++) {
			if (currMax + array.get(i) > array.get(i)) {
				currMax = currMax + array.get(i);
			} else {
				currMax = array.get(i);
				currStart = i;
			}
			if (currMax > maxSoFar) {
				maxSoFar = currMax;
				maxStart = currStart;
				maxEnd = i;
			}
		}
		System.out.println("maxSubarraySum=" + maxSoFar);
		System.out.println("maxStart= "+maxStart+", maxEnd= " + maxEnd);
	}
}
