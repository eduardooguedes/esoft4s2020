package eduardooguedes4sem2bim.aula20201013;

import eduardooguedes4sem2bim.aula20201013.ValueObject.*;
    
public abstract class Pessoa {
    
    private String nomePessoa;
    private String código;
    private Telefone telefone;
    private Email emailPessoa;

    public Pessoa(String nome, String código, String telefone, String email){
        this.nomePessoa = nome;
        this.código = código;
        this.telefone = new Telefone(telefone);
        this.emailPessoa = new Email(email);
    }

    //public void setFornecedor(){}
    //public void setCliente(){}
    //public void setVendedor(){}
    //public void setTransportadora(){}

}
