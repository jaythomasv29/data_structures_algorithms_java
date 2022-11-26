package bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7 , 1, -22};
        bubbleSort(intArray);
        System.out.println(Arrays.toString(intArray));

    }

    /**
     * Bubble Sort
     * Time complexity worst case: O(n^2)
     * - This is a "stable" sort. (if there are duplicate values, the relative ordering is preserved
     * Space complexity: O(1)
     * @param unsortedArray
     * we optimized bubble sort with the outer loop decrementing the index,
     * as bubble sort moves the element with the greatest value to the back
     */
    public static void bubbleSort(int[] unsortedArray) {
        for(int lastUnsortedIndex = unsortedArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                // check if current value is greater than next value, if so swap the greater value towards the back
                if(unsortedArray[i] > unsortedArray[i + 1]) {
                    swap(unsortedArray, i, i+ 1);
                }
            }
        }
    }

    /**
     *
     * @param array  // the array
     * @param i // index of an element to swap with j
     * @param j // index of an element to swap with i
     */
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        // swap logic for two elements in an array
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
