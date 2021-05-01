import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 8, 0, -1, -7};
        int[] array2 = {17, 43, 57, 76, 78, 70, -71, -77};
        int[] mergeArray = new int[array.length + array2.length];
        int mergeArraySize = 0;


        for (int i = 0; i < array.length; i++) {
            mergeArray[mergeArraySize++] = array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergeArray[mergeArraySize++] = array2[i];
        }
        System.out.println(Arrays.toString(mergeArray));
    }
}
