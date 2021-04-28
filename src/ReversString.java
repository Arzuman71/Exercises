
public class ReversString {
    public static void main(String[] args) {

        String str = "Asdfg R";
        StringBuilder revers = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            revers.append(chars[i]);
        }
        System.out.println(revers);
    }
}
