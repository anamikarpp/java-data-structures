package sortingAlgorithms;

/**
 * Insertion Sort implementation.
 * Best case: O(n) | Average & Worst case: O(n^2)
 * Space: O(1) - In-place
 * Stable Sort
 */

public class InsertionSort {
    public static void sort(int[] intArray) {

        for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++)
        {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0 && intArray[i-1]>newElement;i--)
            {
                intArray[i]=intArray[i-1];
            }
            intArray[i]=newElement;
        }
    }
}
