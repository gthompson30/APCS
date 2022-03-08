// Team Tame Meat Mate Meta (Kartik Vanjani + Gabriel Thompson)
// APCS pd8
// HW71 -- Whut Dis.
// 2022-03-07m
// time spent: 0.7hrs

/*

DISCO
 - a controls the start index, b controls the end index, and the value at index c controls where the
   partitions are split.
 - The overall purpose of the function is to semi-sort an array, by putting the lower section in one
   partition, and the higher section, in another partition.

QCC
 - An clear(er) title for this function would be "partitionSort()"
 - What would be a practical use of this function?
 - Why the variable name "v"?

q0: What does it do?
   Given an index a, b, and c, the function looks through all items in the subarray of indexes [a, b),
   and places items with values LESS than arr[c] to the left, and all the items with values ≥ arr[c] to
   the right. Each of these partitions are not necessarily ordered, but you know that all the values in
   the left partition are smaller than all the values in the right partition.

   For example, given the following array: {32, 0, 19, 16, 32, 17, 24, 22}
   ... and a = 0, b = 7 (meaning the array will be searched in its entirety) and c = 2...

   The output array will be {0, 16, 17, 19, 32, 22, 24, 32}, where everything before index 4 is less
   than or equal to 19, and everything after and including index 4 is larger than 19.

q1: What is its Big-Oh runtime?
   O(n), where n represents b-a, because the function is iterating over all values from a to b once.
   Each swap and comparison is an O(1) time operation.

*/

import java.util.Arrays;

public class Mysterion {

	/*
	PARAMS:
	 - arr        -> The array to be operated on
	 - start      -> The starting index from which to search
	 - end        -> The ending index to which to search
	 - splitIndex -> The index of the value to divide the partitions

	FUNCTION FUNCTION:
	 - Modify the given array so that each item with a value less than the value at splitIndex is to the
	   left of the array, and every item with a value greater than the value at splitIndex is to the right
	   of the array. Effectively, the array gets "sorted" into two partitions, although each partition is
	   not necessarily sorted.
	*/
	public static int[] partitionSplit(int[] arr, int start, int end, int splitIndex) {
		int splitVal = arr[splitIndex];
		int temp = arr[splitIndex];
		arr[splitIndex] = arr[end];
		arr[end] = temp;
		int currentSwap = start;

		for (int i = start; i < end; i++) {
			if (arr[i] < splitVal) {
				temp = arr[currentSwap];
				arr[currentSwap] = arr[i];
				arr[i] = temp;
				currentSwap++;
			}
		}

		temp = arr[end];
		arr[end] = arr[currentSwap];
		arr[currentSwap] = temp;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 12, 3};
		int a = 0; int b = 4; int c = 2;
		arr = partitionSplit(arr, a, b, c);
		System.out.println(Arrays.toString(arr));

		int[] arr2 = {32, 0, 19, 16, 32, 17, 24, 22};
		a = 0; b = 7; c = 2;
		arr2 = partitionSplit(arr2, a, b, c);
		System.out.println(Arrays.toString(arr2));
	}

}
