import java.util.Arrays;

public class SecondMaxOfArray {

    public static void main(String[] args) {
        int[] array = {8, 8, 8};
        int secondMax = array[0];

        Arrays.sort(array);

        secondMax = getSecondMax(array, secondMax);

        System.out.println(secondMax);
    }

    private static int getSecondMax(int[] array, int secondMax) {

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] < array[i]) {
                secondMax = array[i - 1];
                return secondMax;
            }
        }
        throw new NotFoundException("second Max not fond");
    }
}
