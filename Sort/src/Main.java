import com.williamjing.sort.*;

public class Main {

    public static void main(String[] args) {
        int[] list = {1, 4, 3, 7, 10, 6, 2, 5, 8, 9};
        SortUtil.bubbleSort(list);
        SortUtil.insertSort(list);
        SortUtil.selectSort(list);
        System.out.println(list);
    }
}
