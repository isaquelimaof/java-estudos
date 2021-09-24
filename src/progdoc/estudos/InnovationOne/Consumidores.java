package progdoc.estudos.InnovationOne;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {

        Consumer<String> imprimirFrase = System.out::println;
        Consumer<String> imprimirFrase2 = System.out::println;
        imprimirFrase.accept("!!!!!!! Olá Bom Dia 01 !!!!!!!");
        imprimirFrase2.accept("!!!!!!! Olá Bom Dia 02 !!!!!!!");


    }
}
