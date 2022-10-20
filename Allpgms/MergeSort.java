import java.util.Random;
import java.util.Scanner;

public class MergeSort {	
	public static void sort(int[] a, int low, int high)
	{
		int N = high - low;
		if(N<=1)
			return;
		int mid = low + N/2;
		
		sort(a, low, mid);
		sort(a, mid, high);
		
		int[] temp = new int[N];
		int i = low, j = mid;
		for(int k=0;k<N;k++)
		{
			if(i==mid)
				temp[k] = a[j++];
			else if(j == high)
				temp[k] = a[i++];
			else if(a[j]<a[i])
				temp[k] = a[j++];
			else
				temp[k] = a[i++];
		}
		for(int k=0; k<N;k++)
			a[low+k] = temp[k];		 
	}	
	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);
		System.out.println("Merge Sort Test\n");
		int i;
		Random r = new Random();
		System.out.println("Random numbers generated are: ");
		int[] arr = new int[10];
		
		for(i=0;i<10;i++)
		{
			arr[i] = r.nextInt(10000);
			System.out.println(arr[i]);
		}		
		long startTime = System.nanoTime();
		sort(arr, 0, 10); 
		double endTime = System.nanoTime();
		double duration = (endTime - startTime);		
		System.out.println("\nElements after sorting are: ");
		for(i=0; i<10; i++)
			System.out.println(arr[i]+" ");
		System.out.println();
		double milliseconds = duration/1000000;
		System.out.println("Total time taken to sort the numbers is: "+milliseconds+"Milliseconds");
		scn.close();
	}
}
