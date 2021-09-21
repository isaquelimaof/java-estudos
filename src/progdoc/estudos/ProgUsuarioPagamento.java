package progdoc.estudos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ProgUsuarioPagamento {

    private static Scanner dataUsuario;

    public static void main(String[] args, Scanner scanner) throws ParseException {

        dataUsuario = scanner;
        System.out.println("Por favor escreva a data do vencimento: ");
        String date = dataUsuario.nextLine();

        SimpleDateFormat vencimento = new SimpleDateFormat("dd/MM/yyyy");
        Date dataVenc = vencimento.parse(date);

        Date dataHoje = new Date();

        long calculDatas = dataVenc.getTime() - dataHoje.getTime();

        TimeUnit time = TimeUnit.DAYS;
        long diffrence = time.convert(calculDatas, TimeUnit.MILLISECONDS);
        long resultado = diffrence + 1;
        System.out.println("Você tem: " + resultado + " dias para efetuar o pagamento da sua fatura!!!");

    }
}
