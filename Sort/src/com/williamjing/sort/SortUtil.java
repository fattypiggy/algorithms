package com.williamjing.sort;

import java.util.Collections;
import java.util.List;

public class SortUtil {

    public static void selectSort(int[] list) {

    }

    public static void bubbleSort(int[] list) {

    }

    public static void insertSort(int[] list) {

    }

    private static final <T> void swap(T[] arrayList, int i, int j) {
        T temp = arrayList[i];
        arrayList[i] = arrayList[j];
        arrayList[j] = temp;
    }

    private static final <T> void swap(List<T> list, int i, int j) {
        Collections.swap(list, i, j);
    }
}
