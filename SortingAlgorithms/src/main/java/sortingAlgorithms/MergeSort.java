package sortingAlgorithms;
/**
 * Shell Sort implementation.
 * Improves on Insertion Sort by comparing elements far apart.
 * Time complexity: Varies by gap sequence.
 *   - Worst: O(n^2) (with Shell's original gap sequence)
 *   - Best: O(n log n) (with better gap sequences like Hibbard, Sedgewick)
 * Space: O(1) - In-place
 * Not a stable sort
 */
public class MergeSort {

    public static void sort(int[] arr)
    {
        if(arr==null || arr.length<2)
        {
            return;
        }
        mergeSort(arr,0,arr.length-1);
    }

    private static void mergeSort(int[]arr,int start,int end)
    {
        if(start>=end){
            return;
        }

        int mid=(start+end)/2;

        //sort the two halves
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,start,mid,end);
    }

    private static void merge(int[]arr,int start,int mid, int end)
    {
        int[] temp= new int[end-start+1];
        int i=start; //left subarray pointer
        int j=mid+1; //right subarray pointer
        int k=0; //temp array pointer

        while(i<=mid && j<=end)
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }

        while(j<=end)
        {
            temp[k++]=arr[j++];
        }
        for(int m=0;m<temp.length;m++)
        {
            arr[start+m]=temp[m];
        }
    }
}
