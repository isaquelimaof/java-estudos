package javaInnovationOne.estudos.basicoAoAvancado;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Paradigmas {

    public static void main(String[] args){
        //Paradigma Imperativo
           int valor01 = 10;
            int resultado = valor01 *3;
                System.out.println("O resultado 01 é:"+ resultado); 

        //Paradigma Funcional sImutabilidade
        UnaryOperator<Integer>calcularValorVezesTrinta =  valor02 -> valor02*3;
            int valor02 = 20;
                System.out.println("O resultado 02 é: "+ calcularValorVezesTrinta.apply(valor02));
                System.out.println("O resultado 02 é: "+valor02);

        //Paradigma Funcional
        int[] valores = {1,2,3,4};
                Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.print("\n Valor 03 é:"+ numero));

        //Paradigma Imperativo
        int saldo = 20;
        for (int i = 0; i < valores.length; i++) {
                if (valores[i] % 2 == 0) {
                    saldo = valores[i] * 2;
                    
                    if (saldo != 0){
                        System.out.print("\n Valor 04 é:"+saldo);
                    }
              }
        }   

    }
    
}
