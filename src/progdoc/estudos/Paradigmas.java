package progdoc.estudos;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Paradigmas {

    public static void main(String[] args){
        //Paradigma Imperativo
            int valor01 = 10;
            int resultado = valor01 *3;
                System.out.println("O resultado é:"+ resultado);

        //Paradigma Funcional
        UnaryOperator<Integer>calcularValorVezesTrinta = valor -> valor*3;
            int valor = 10;
                System.out.println("O resultado é: "+ calcularValorVezesTrinta.apply(valor));

        //Paradigma Funcional
        int[] valores = {1,2,3,4};
                Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.print(numero));

        //Paradigma Imperativo
        for (int i = 0; i < valores.length; i++) {
                if (valores[i] % 2 == 0) {
                    valor = valores[i] * 2;
                    
                    if (valor != 0){
                        System.out.print(valor);
                    }
                }
            
        }       

        
    }
    
}
