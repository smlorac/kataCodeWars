package kataBreakCamelCase;

import java.util.StringJoiner;

public class Solution {
    public static String camelCase(String input) {
        String[] arrayPalavras = input.split("(?=\\p{Lu})");

        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 0; i < arrayPalavras.length; i++){
            joiner.add(arrayPalavras[i]);
        }

        String output = joiner.toString();
        return output;
    }
}
