package progdoc.estudos;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 Categoria Juvenil
        //idade >= 18 categoria adulto
        int idade = 14;
        
        if(idade < 15){
            System.out.printf("Categoria Infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.printf("Categoria Juvenil");
        }else{
            System.out.printf("Categoria Adulto");
        }
    }
}
