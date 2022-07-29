package kataSquare;

public class NumberFun {
    public static long findNextSquare(long sq){

        if (sq >= 0){
            double raizQuadrada = Math.sqrt(sq);
            System.out.println(raizQuadrada);

            double inteiro = Math.floor(raizQuadrada);
            System.out.println(inteiro);

            if (raizQuadrada == inteiro){
                long proxRaiz = (long) (raizQuadrada + 1);

                return proxRaiz * proxRaiz;
            }
        }
            return -1;
    }
}
