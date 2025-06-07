package sortingAlgorithms;
/**
 * Quick Sort implementation.
 * A Divide and Conquer algorithm that partitions the array.
 *
 * Time Complexity:
 * - Best/Average: O(n log n)
 * - Worst: O(n^2) [when pivot selection is poor, e.g., sorted array with first element as pivot]
 *
 * Space Complexity: O(log n) auxiliary (due to recursion stack)
 *
 * Stable: ❌ (because it may swap non-adjacent elements)
 */
public class QuickSort {

    public static void sort(int[] arr)
    {
        if(arr==null || arr.length<2)
        {
            return;
        }
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }

    private static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    private static void swap(int[]arr,int i,int j)
    {
        if(i!=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
