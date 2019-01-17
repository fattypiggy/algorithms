package com.williamjing.sort;

public class SortUtil {

    /**
     * select sort
     * Time complexity: O(n²)
     * @param list
     */
    public static void selectSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i; j < list.length; j++) {
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
        for (int i = 0; i < list.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < list.length - i - 1; j++) {
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
        for (int i = 1; i < list.length; i++) {
            int j = i;
            while (j > 0 && list[j] < list[j - 1]) {
                swap(list, j - 1, j);
                j--;
            }
        }
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
}
