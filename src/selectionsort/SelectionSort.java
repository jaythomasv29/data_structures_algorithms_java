package selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    /**
     * Time complexity (worst case) O(n2)
     * Unstable algorithm, relative position is unstable
     *
     * Selection Sort Approach: Find and keep track of the largest element in the array
     * Swap the largest element with the last element in the array
     * Loop from the back to the front of the array
     * After each iteration, a sorted partition is being created at the back because we are moving the larger values to the end and decrementing the index
     * Have an inner loop to loop through from front to the lastUnsortedIndex
     *  Loop through and find the max within the given range (start till lastUnsortedIndex)
     *  Swap the largest element after the loop is complete outside of the nested loop, (but inside the outer loop)
     *
     * @param unsortedArr
     */
    public static void selectionSort(int[] unsortedArr) {
        for(int lastUnsortedIndex = unsortedArr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // assume that the largest element is at idx 0;
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(unsortedArr[i] > unsortedArr[largest]) {
                    largest = i;
                }
                // swap the largest element found, with the last element in unsortedArray partition
                swap(unsortedArr, largest, lastUnsortedIndex);
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
