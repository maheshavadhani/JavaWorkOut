package test.practise.complex;

public class BubbleSort {

	public static void PrintNum(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}

	public static void SwapMe(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void bubbleSort(int[] array) {
		int n = array.length;
		int k;

		for (int m = n; m >= 0; m--) {

			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
					SwapMe(i, k, array);
				}

			}

		}
		PrintNum(array);
	}

	public static void main(String[] args) {
		int[] input = { 20, 15, 11, 5, 23, 19 };
		bubbleSort(input);
	}

}
