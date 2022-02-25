import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 135, 2345, 4356, 56, 456, 1, 34325, 34, 234, 235, 435};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSort(int[] array, int low, int hight) {
        if (low < 0 || hight >= array.length || low > hight) return;
        if (low < hight) {
            int privotpos = partition(array, low, hight);
            QuickSort(array, low, privotpos - 1);
            QuickSort(array, privotpos + 1, hight);
        }

    }

    public static int partition(int[] array, int low, int hight) {
        int privot = array[low];
        while (low < hight) {
            while (low < hight && array[hight] >= privot) --hight;
            array[low] = array[hight];
            while (low < hight && array[low] <= privot) ++low;
            array[hight] = array[low];
        }
        array[low] = privot;
        return low;
    }
}