package javaInnovation.estudos.innovationOne.progIs;

import java.util.Scanner;

public class Imc {

    public static Scanner usuario;

    public static void main(String[] args) {

        usuario = new Scanner(System.in);

        System.out.println("Qual seu peso: ");
        float peso = usuario.nextFloat();

        System.out.println("Qual sua altura: ");
        float h = usuario.nextFloat();

        float imc = peso / (h * h);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 17.5) {
            System.out.println("Quando seu IMC está abaixo de 17 \n" +
                    "-->!!! O seu peso está muito abaixo do ideal !!!");
        }
        else if (imc >= 17.5 & imc <= 18.49 ) {
            System.out.println("Quando seu IMC está entre 17,5 e 18,49 \n" +
                    "-->  O seu peso está abaixo do ideal.");
        }
        else if (imc >= 18.5 & imc <= 24.99) {
            System.out.println("Quando seu IMC está entre 18,5 e 24,99 \n" +
                    "-->  O seu peso está ideal.");
        }
        else if (imc >= 25 & imc <= 29.99) {
            System.out.println("Quando seu IMC está entre 25 e 29,99 \n" +
                    "-->  O seu peso está acima do ideal.");
        }
        else if (imc >= 30 & imc <= 34.99) {
            System.out.println("Quando seu IMC está entre 30 e 34,99 \n" +
                    "-->  O seu peso está em obesidade grau I (!!!Atenção!!!)");
        }
        else if (imc >= 35 & imc <= 39.99) {
            System.out.println("Quando seu IMC está entre 35 e 39,99 \n" +
                    "-->  O seu peso está em obesidade grau II (severa) (!!!Atenção!!!)");
        }
        else if (imc >= 40) {
            System.out.println("Quando seu IMC está acima de 40 \n" +
                    "-->  O seu peso está em obesidade grau III (mórbida) (!!!Atenção!!!)");
        }

    }

}
