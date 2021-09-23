package progdoc.estudos;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }
    public static double fatorialA(double valor) {
        return fatorialComTailCall(valor,1);
    }
    public static double fatorialComTailCall(double valor, double numero) {
        {
            return numero;
        }
        return fatorialComTailCall(valor-1,numero*valor);
    }

}

