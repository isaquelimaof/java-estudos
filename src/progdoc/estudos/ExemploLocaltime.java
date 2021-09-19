package progdoc.estudos;

import java.time.LocalDateTime;
import java.time.LocalTime;


public class ExemploLocaltime {

public static void main(String[] args){

    LocalTime agora = LocalTime.now();
        System.out.println(agora);

    LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);

    LocalDateTime hoje = LocalDateTime.now();
        System.out.println(hoje);

    LocalDateTime futuro = hoje.plusHours(1).plusDays(2).plusSeconds(12);
    System.out.println(futuro);
    
    
}
    
}
