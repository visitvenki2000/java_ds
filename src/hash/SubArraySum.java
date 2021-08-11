package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SubArraySum {

	int count;

	public int getCount() {

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 3, -1, -2, 5 };
		SubArraySum freq = new SubArraySum();

		int[] data2 = { 1, 4, 13, -3, -10, 5 };
		// freq.subArrayWithZeroSum(data);
		int[] data3 = { 5, 8, 6, 13, 3, -1 };
		// System.out.println(freq.subArrayWithGivenSum(data3,22));
		int[] data4 = { 8, 3, 1, 5, -6, 6, 2, 2 };
		System.out.println(freq.longestSubArrayWithGivenSum(data4, 4));

		// System.out.println(freq.findPair(data2, 25));

	}

	/*
	 * 1) prepare hash map with sum and index ..? 2) while insert check if element
	 * already exists.. 3) get both indexes ... 4) check corner case if sum 0 ...
	 */
	public void subArrayWithZeroSum(int[] data) {

		int start = 0;
		int end = 0;

		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < data.length; i++) {

			sum = sum + data[i];
			if (sum == 0) {
				// special case
				start = 0;
				end = i;
				break;
			}

			if (!map.containsKey(sum)) {
				map.put(sum, i);
			} else {
				// found sum... find sub array

				end = i;
				start = map.get(sum) + 1;
				break;

			}

		}

		for (int i = start; i <= end; i++) {
			System.out.println("" + data[i]);

		}

	}

	/*
	 * 1) prepare hash map with sum and index ..? 2) while insert check if element
	 * already exists.(with subtracting given sum). 3) get both indexes ... 4) check
	 * corner case if sum 0 ...
	 */
	public boolean subArrayWithGivenSum(int[] data, int givenSum) {

		int start = 0;
		int end = 0;

		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < data.length; i++) {

			sum = sum + data[i];
			if (sum == givenSum) {
				// special case
				start = 0;
				end = i;
				return true;
			}

			if (!map.containsKey(sum - givenSum)) {
				map.put(sum, i);
			} else {
				// found sum... find sub array

				end = i;
				start = map.get(sum - givenSum) + 1;
				return true;

			}

		}
		/*
		 * 
		 * for(int i=start;i<=end;i++) { System.out.println(""+data[i]);
		 * 
		 * }
		 */

		return false;

	}

	/*
	 * 1) prepare hash map with sum and index ..? 2) while insert check if element
	 * already exists.. 3) get both indexes ... 4) check corner case if sum 0 ...
	 */
	public int longestSubArrayWithGivenSum(int[] data, int givenSum) {

		int start = 0;
		int end = 0;
		int max = 0;

		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < data.length; i++) {

			//System.out.println("i"+i);
			sum = sum + data[i];
			if (sum == givenSum) {
				// special case
				start = 0;
				end = i;

				max = Math.max(max, end - start);
				map.put(sum, i);
				//System.out.println("----------match--sum---"+max);
				continue;
			}

			//System.out.println("-------sum "+sum );
			if (!map.containsKey(sum - givenSum)) {
				
				if(!map.containsKey(sum))
				map.put(sum, i);
			} else {
				// found sum... find sub array

				end = i;
				start = map.get(sum - givenSum) ;
				max = Math.max(max, end - start);
				System.out.println("found 2 "+max);
				//System.out.println("start "+start);
				//System.out.println("end "+end);
				//map.put(sum, i);

			}

		}

		return max;

	}

}
