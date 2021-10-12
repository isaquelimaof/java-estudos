package javaInnovationOne.estudos.basicoAoAvancado;

import java.util.HashMap;
import java.util.Map;

public class FatorialTailCall {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        long F = System.nanoTime();
        System.out.println("Fatorial 01: " + (F - I));

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        F = System.nanoTime();
        System.out.println("Fatorial 02: " + (F - I));
    }

    public static Integer fatorialComMemoization(Integer value) {
        if (value == 1) {
            return value;
        } else {
            Integer resultado = value * fatorialComMemoization(value - 1);
            MAPA_FATORIAL.put(value, resultado);
            return resultado;
        }
    }
}


