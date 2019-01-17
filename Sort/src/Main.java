import com.williamjing.sort.*;

public class Main {

    public static void main(String[] args) {
        int[] list = {1, 4, 3, 7, 10, 6, 2, 5, 8, 9};
//      comment other lines to test the only sort algorithm.
        SortUtil.selectSort(list);
        SortUtil.bubbleSort(list);
        SortUtil.insertSort(list);
        System.out.println(list);
    }
}
