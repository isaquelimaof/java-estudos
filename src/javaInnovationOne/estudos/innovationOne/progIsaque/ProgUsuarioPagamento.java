package javaInnovation.estudos.innovationOne.progIs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ProgUsuarioPagamento {

    public static Scanner dataUsuario;

    public static void main(String[] args) throws ParseException {

        
        dataUsuario = new Scanner(System.in);
        System.out.println("Por favor escreva a data do vencimento: ");
        String date = dataUsuario.nextLine();

        SimpleDateFormat vencimento = new SimpleDateFormat("dd/MM/yyyy");
        Date dataVenc = vencimento.parse(date);

        Date dataHoje = new Date();

        long calculDatas = dataVenc.getTime() - dataHoje.getTime();

        TimeUnit time = TimeUnit.DAYS;
        long diffrence = time.convert(calculDatas, TimeUnit.MILLISECONDS);
        long resultado = diffrence + 1;

        if (resultado<0) {
            System.out.println("!!!!!!Atenção!!!!!!\n"+"!!!!!!!Sua conta esta vencida!!!!!!");
        
        }else if(resultado>0){
            System.out.println("Vc tem : "+resultado+" dias para pagar sua conta!!!!!");

        }else {
            System.out.println("!!!!Atenção!!!!!\n   "+"Hoje é o ultimo dia para pagamento da sua conta!!!!");
        }
        

        }
    }