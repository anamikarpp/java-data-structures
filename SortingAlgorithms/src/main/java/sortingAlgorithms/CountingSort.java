package sortingAlgorithms;

/**
 * Counting Sort implementation Intergers
 * Time: O(n + k) where n = array length, k = max value in array
 * Space: O(k) - requires extra space for count and output arrays
 * Stable Sort
 * Not comparison-based
 * Works only for non-negative integers
 */
public class CountingSort {

    public static void sort(int[] arr)
    {
        if(arr.length==0) return;

        int min=arr[0];
        int max=arr[0];
        for(int num:arr)
        {
            if(num<min)min=num;
            if(num>max)max=num;
        }

        int range=max-min+1;
        //create and populate count array
        int[] count = new int[range];
        for(int num:arr)
        {
            count[num-min]++;
        }

        //convert into prefix sum
        for(int i=1;i<count.length;i++)
        {
            count[i]+=count[i-1];
        }

        //build output stable
        int[] output = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            output[count[arr[i]-min]-1]=arr[i];
            count[arr[i]-min]--;
        }

        System.arraycopy(output,0,arr,0,arr.length);
    }
}
