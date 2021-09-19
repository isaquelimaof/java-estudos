package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(numero02-numero01);
        System.out.println(resultado);
        // %(resto)
        int resto = 21%2;
        System.out.println(resto);
        // < > -- <= >= -- == -- !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMAiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMAiorQueVinte "+isDezMenorQueVinte);

        // && (and) - // (or) - !(negative)

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        System.out.println(bonus);
        // ++  --
        int contador = 0;
        contador += 1;
        contador ++;
        System.out.println(contador);
    }
}
