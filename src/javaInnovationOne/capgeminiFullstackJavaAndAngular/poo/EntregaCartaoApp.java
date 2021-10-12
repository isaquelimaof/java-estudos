package javaInnovationOne.estudos.poo;

import javaInnovationOne.estudos.poo.model.Endereco;
import javaInnovationOne.estudos.poo.model.Cliente;

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
