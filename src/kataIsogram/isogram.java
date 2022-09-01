package kataIsogram;

import java.util.Arrays;

public class isogram {
    public static boolean  isIsogram(String str) {

        str = str.toUpperCase();

        char[] arrayLetras = str.toCharArray();

        Arrays.sort(arrayLetras);
        for (int i = 0; i < arrayLetras.length - 1; i++){
            if (arrayLetras[i] == arrayLetras[i+1]){
                return false;
            }
        }
        return true;
    }
}
