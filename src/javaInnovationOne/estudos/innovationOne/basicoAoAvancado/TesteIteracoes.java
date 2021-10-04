package javaInnovation.estudos.innovationOne.basicoAoAvancado;

import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class TesteIteracoes {
    public static void main(String[] args) {

        List<String> profissoes = new ArrayList<>();

        Scanner usuario = new Scanner(System.in);
        String usuario2 = dataUsuario.lines();

        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith(String.valueOf(usuario2.lines())))
                .forEach(System.out::println);



    }
}
