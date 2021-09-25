package javaInnovation.estudos.innovationOne;

import java.util.Scanner;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter number please: ");
        int number = user.nextInt();

        Function<String, String> name = text -> text;
        Function<Integer, Integer> calculation = string -> string * 2;
        System.out.println(name.apply("Congratulations your result is:"));
        System.out.println(calculation.apply(number));

    }
}