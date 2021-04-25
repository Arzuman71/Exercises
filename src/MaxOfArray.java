public class MaxOfArray {

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 8, 0, -1, -7};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
