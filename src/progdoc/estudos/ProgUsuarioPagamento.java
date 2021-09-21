package progdoc.estudos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ProgUsuarioPagamento {

    public static Scanner dataUsuario;

    public static void main(String[] args) throws ParseException {

        
        dataUsuario = new Scanner(System.in);
        System.out.println("Por favor escreva a data do vencimento: ");
        String date = dataUsuario.nextLine();

        SimpleDateFormat vencimento = new SimpleDateFormat("dd/MM/yyyy");
        Date dataVenc = vencimento.parse(date);

        Date dataHoje = new Date();
        
        long calculDatas = dataVenc.getDate() - dataHoje.getDate();

        if (calculDatas<0) {
            System.out.println("!!!!!!Atenção!!!!!!\n"+"!!!!!!!Sua conta esta vencida!!!!!!");
        
        }if(calculDatas>0){
            System.out.println("Vc tem : "+calculDatas+" dias para pagar sua conta!!!!!");

        }if(calculDatas == 0) {
            System.out.println("!!!!Atenção!!!!!\n   "+"Hoje é o ultimo dia para pagamento da sua conta!!!!");
        }
        

        }
    }