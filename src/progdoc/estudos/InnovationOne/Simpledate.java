package progdoc.estudos.InnovationOne;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simpledate {
/**
 * Exemplo de formatação de data com SimpleDateFormat
 */
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss --- dd/MMMM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    
      // 14/07/2019
    }

}

