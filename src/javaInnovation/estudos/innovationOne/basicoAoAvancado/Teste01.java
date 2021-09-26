package javaInnovation.estudos.innovationOne.basicoAoAvancado;

import java.util.stream.Stream;

public class Teste01 {

    public static void imprimirTodosOsNomes(String nomes){
        for(String nome : nomes) {
            System.out.println("Imprimido pelo For"+ nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach !!!!!" + nome));

    }

}
