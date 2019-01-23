package com.williamjing.sort;

public class SortUtil {

    /**
     * select sort
     * Time complexity: O(n²)
     * @param list
     */
    public static void selectSort(int[] list) {
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                System.out.printf("counter: %d, i = %d, j = %d\n", ++counter, i, j);
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(list, i, min);
            }
        }
    }

    /**
     * bubble sort
     * Time complexity: O(n²)
     * @param list
     */
    public static void bubbleSort(int[] list) {
        int counter = 0;
        for (int i = 0; i < list.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < list.length - i - 1; j++) {
                System.out.printf("counter: %d, i = %d, j = %d\n", ++counter, i, j);
                if (list[j] > list[j + 1]) {
                    swap(list, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

    }

    /**
     * insert sort
     * Time complexity: O(n²)
     * @param list
     */
    public static void insertSort(int[] list) {
        int counter = 0;
        for (int i = 1; i < list.length; i++) {
            int j = i;
            while (j > 0 && list[j] < list[j - 1]) {
                System.out.printf("counter: %d, i = %d, j = %d\n", ++counter, i, j);
                swap(list, j - 1, j);
                j--;
            }
        }
    }

    /**
     * merge sort - recursive version
     * Time complexity: O(n*log n)
     * Divide and conquer algorithm
     * @param list
     */
    public static void mergeSort(int[] list) {
        int length = list.length;
        int[] result = new int[length];
        mergeSortRecursive(list, result,0, length - 1);
    }

    /**
     * swap the arrayList[i] and arrayList[j].
     * @param arrayList
     * @param i
     * @param j
     */
    private static final void swap(int[] arrayList, int i, int j) {
        int temp = arrayList[i];
        arrayList[i] = arrayList[j];
        arrayList[j] = temp;
        System.out.printf("%d and %d swapped.\n", arrayList[j], arrayList[i]);
    }

    private static final void mergeSortRecursive(int[] arrayList, int[] result, int start, int end) {
        if (start >= end) {
            return;
        }

        int length = end - start, middle = (length >> 1) + start;
        int start1 = start, end1 = middle;
        int start2 = middle + 1, end2 = end;

        System.out.printf("split array into 2 arrays. start1 = %d, end1 = %d, start2 = %d, end2 = %d.\n", start1, end1, start2, end2);

        mergeSortRecursive(arrayList, result, start1, end1);
        mergeSortRecursive(arrayList, result, start2, end2);

        int i = start;

        while (start1 <= end1 && start2 <= end2) {
            result[i++] = arrayList[start1] < arrayList[start2] ? arrayList[start1++] : arrayList[start2++];
        }
        while (start1 <= end1) {
            result[i++] = arrayList[start1++];
        }
        while (start2 <= end2) {
            result[i++] = arrayList[start2++];
        }

        for (int j = start; j <= end; j++) {
            arrayList[j] = result[j];
        }
    }
}
