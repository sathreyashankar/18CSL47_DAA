import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	/*
	public static void sort(int[] arr)
	{
	quickSort(arr, 0, arr.length-1);
	}
	*/
	public static void quickSort(int arr[], int low, int high) {
		int i = low, j = high;
		int temp;
		int pivot = arr[low];
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(arr, low, j);
		if (i < high)
			quickSort(arr, i, high);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Quick Sort Test\n");
		int i;
		System.out.println("Random numbers generated are: ");
		Random r = new Random();
		int[] arr = new int[10];

		for (i = 0; i < 10; i++) {
			arr[i] = r.nextInt(10000);
			System.out.println(arr[i]);
		}
		long startTime = System.nanoTime();
		quickSort(arr, 0, arr.length - 1); // sort(arr);
		double endTime = System.nanoTime();
		double duration = (endTime - startTime);
		System.out.println("\nElements after sorting are: ");
		for (i = 0; i < 10; i++)
			System.out.println(arr[i] + " ");
		System.out.println();
		double milliseconds = duration / 1000000;
		System.out.println("Total time taken to sort the numbers is: " + milliseconds + "Milliseconds");
		scn.close();
	}
}