package kataPhone;

import java.util.Arrays;

public class Kata {
    public static String createPhoneNumber(int[] numbers){

        int[] primeiraParte = Arrays.copyOfRange(numbers, 0, 3);
        int[] segundaParte = Arrays.copyOfRange(numbers, 3, 6);
        int[] terceiraParte = Arrays.copyOfRange(numbers, 6, numbers.length);

        StringBuilder sbf = new StringBuilder("(");
        sbf.append(Arrays.toString(primeiraParte).replaceAll("\\[|\\]|,|\\s", ""));
        sbf.append(")");
        sbf.append(" ");
        sbf.append(Arrays.toString(segundaParte).replaceAll("\\[|\\]|,|\\s", ""));
        sbf.append("-");
        sbf.append(Arrays.toString(terceiraParte).replaceAll("\\[|\\]|,|\\s", ""));

        return String.valueOf(sbf);
    }
}
