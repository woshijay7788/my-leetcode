package easy.binsearch;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:51 PM 2019/1/9
 * @Version :
 */
public class BinSearchTest {

    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 2, 7, 9, 1, 8, 5};
        System.out.println(bsearchWithoutRecursion(arr, 4));
    }


    public static int binarysearch(int array[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (array[mid] > target) {
            return binarysearch(array, low, mid - 1, target);
        }
        if (array[mid] < target) {
            return binarysearch(array, mid + 1, high, target);
        }
        return mid;
    }

    public static int bsearchWithoutRecursion(int a[], int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] > key) {
                high = mid - 1;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
