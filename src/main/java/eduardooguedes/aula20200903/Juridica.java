package eduardooguedes.aula20200903;

import eduardooguedes.aula20200903.ValueObjects.*;

public class Juridica extends Pessoa {

    private Cnpj cnpj;
    private Nome nome;
    private NomeFantasia nomeFantasia;

    public Juridica(Nome nome, Cnpj cnpj, NomeFantasia nomeFantasia){
        this.nome = super.setNome(nome);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public void setNome(){

    }

}
