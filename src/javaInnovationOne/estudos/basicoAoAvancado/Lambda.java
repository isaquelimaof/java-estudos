package javaInnovationOne.estudos.basicoAoAvancado;

public class Lambda {

    public static void main(String[] args) {
        /*int valor1 = 5*2;
        Funcao1 funcao1 = valor -> String.valueOf(valor);// String::valueOf; tambem pode ser usado
        System.out.println(funcao1.gerar(valor1));*/
        int valor1 = 5*2;
        int valor2 = 50;
        Funcao1 funcao1 = System.out::println;// Ou usar valor-> System.out.println(valor);
        funcao1.gerar(valor1);
        funcao1.gerar(valor2);
    }
}
    interface Funcao1 {
        void gerar(int valor);

}

    

