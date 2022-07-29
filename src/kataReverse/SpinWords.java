package kataReverse;

public class SpinWords {
    public String spinWords(String sentence){

        String[] palavras = sentence.split(" ");
        StringBuilder novaFrase = new StringBuilder();

        for (int i = 0; i < palavras.length; i++){
            if (palavras[i].length() < 5){
                novaFrase.append(palavras[i]);
            } else {
                novaFrase.append(new StringBuilder(palavras[i]).reverse());
            }
            novaFrase.append(" ");
        }
        return novaFrase.toString().trim();
    }
}
