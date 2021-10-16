package innovationOne.capgeminiFullstackJavaAndAngular.poo;

import innovationOne.capgeminiFullstackJavaAndAngular.poo.model.Cliente;
import innovationOne.capgeminiFullstackJavaAndAngular.poo.model.Endereco;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco();
        endereco.cep = "24.917-205";

        Cliente cliente = new Cliente();

        try {
            cliente.adicionarEndereco(endereco);
            System.out.println("Cep Adicionado: " + endereco.cep);
        } catch (Exception e) {
            System.err.println("Houve um erro ao adcionar o endereco -> "+ e.getMessage());
        }
    }
}
