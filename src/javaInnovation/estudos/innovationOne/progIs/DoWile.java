package javaInnovation.estudos.innovationOne.progIs;

import java.util.Scanner;

public class DoWile {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        float a;
        float num1, num2,resultado;

        do {

            System.out.println(" (1) Somar ");
            System.out.println(" (2) Subtrair ");
            System.out.println(" (3) Multiplicar ");
            System.out.println(" (4) Dividir ");
            System.out.println(" (0) Sair ");

            System.out.println(" Digite o código da operação desejada: ");

            a = usuario.nextFloat();

            if(a != 1 && a != 2 && a != 3 && a != 4 && a != 0) {
                System.out.println("!!!!! ATENÇÃO - ERRO !!!!!\n" +"DIGITE AS OPÇÕES INDICADAS !!!!!");
            }

            if (a == 1 || a == 2 || a == 3 || a == 4){
                System.out.println("Digite o primeiro número: ");
                num1 = usuario.nextFloat();

                System.out.println("Digite o segundo número: ");
                num2 = usuario.nextFloat();

                if (a == 1) {
                    resultado = num1 + num2;
                    System.out.println("O resultado da soma é: " + resultado);
                    break;
                } else if (a == 2) {
                    resultado = num1 - num2;
                    System.out.println("O resultado da subtração é: " + resultado);
                    break;
                } else if (a == 3) {
                    resultado = num1 * num2;
                    System.out.println("O resultado da multiplicação é: " + resultado);
                    break;
                } else {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                    break;
                }
            }
        }
        while (a != 0);
        if(a==0){
            System.out.println("!!!!ATÉ LOGO !!!!");
        }
    }


}





