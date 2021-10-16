package innovationOne.capgeminiFullstackJavaAndAngular.basicoAoAvancado;

import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class TesteIteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Joao","Joao", "Paulo","Oliveira","Santos","Instrutor","Java"};
        Integer[] numeros = {1,2,3,4,5};
//        imprirmirNomesFiltrados(nomes);
//        imprirmirTodosNomes(nomes);
//        imprirmirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);



    }
}
