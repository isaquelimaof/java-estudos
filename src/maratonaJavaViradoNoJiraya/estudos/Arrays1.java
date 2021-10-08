package maratonaJavaViradoNoJiraya.estudos;

import groovy.json.JsonOutput;

public class Arrays1 {
    public static void main(String[] args) {

        int[] idades = new int[3];
        idades[0] = 31;
        idades[1] = 28;
        idades[2] = 6;

        for (int i = 0; i < 3; i++) {
        }

        String[] nomes = new String[3];
        nomes[0] = "Isaque";
        nomes[1] = "Manu";
        nomes[2] = "Calebe";

        for (int i = 0; i < 3; i++) {
            System.out.println("Nome: " + nomes[i] + " --- Idade: "+ idades[i]);
        }
    }
}
