package javaInnovationOne.estudos.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    public String numCartao;
    private List<Endereco> enderecos;

    public void adicionarEndereco(Endereco endereco){
        if (endereco == null){
        throw new NullPointerException("Endereco não pode ser nulo !");
        }
        if(endereco.cep == null){
            throw new NullPointerException("Cep não pode ser nulo !");
        }

        getEndereco().add(endereco);

    }

    private List<Endereco> getEndereco() {
        if (enderecos == null) {
            enderecos = new ArrayList<>();
        }
        return enderecos;
    }
}
