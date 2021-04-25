import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 8, 0, -1, -7};
        int size = array.length - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {

                if (array[j + 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
