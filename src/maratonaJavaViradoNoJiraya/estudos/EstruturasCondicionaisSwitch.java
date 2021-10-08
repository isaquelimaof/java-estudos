package maratonaJavaViradoNoJiraya.estudos;

public class EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        byte dia = 7;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
                default:
                System.out.println("!!! Opção inválida !!!");
                break;
        }

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
        default:
            System.out.println("!!! Opção Inválida !!!");
        }
    }
}
