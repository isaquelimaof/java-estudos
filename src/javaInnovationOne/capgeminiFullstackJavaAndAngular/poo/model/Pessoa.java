package javaInnovationOne.estudos.poo.model;

public class Pessoa {

    public enum TipoPessoa {FISICA,JURIDICA}

    public Integer codigo;
    public String nome;
    public Integer tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if(documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento não pode ser nulo ou vazio !!!");
        }
        this.documento = documento;

        if (documento.length();
    }
}
