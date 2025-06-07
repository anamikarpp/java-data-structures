package sortingAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        InsertionSort.sort(intArray);
        System.out.println("InsertionSort: ");
        for(int i=0;i<intArray.length;i++)
        {
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
        MergeSort.sort(intArray);
        System.out.println("MergeSort: ");
        for(int i=0;i<intArray.length;i++)
        {
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
        QuickSort.sort(intArray);
        System.out.println("QuickSort: ");
        for(int i=0;i<intArray.length;i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        CountingSort.sort(intArray);
        System.out.println("QuickSort: ");
        for(int i=0;i<intArray.length;i++)
        {
            System.out.print(intArray[i] + " ");
        }

    }
}