package aula20200903;

import aula20200903.ValueObjects.Nome;

public class Juridica extends Pessoa {

    private Cnpj cnpj;
    private NomeFantasia nomeFantasia;

    public Juridica(Nome nome, Cnpj cnpj, NomeFantasia nomeFantasia){
        this.nome = super.setNome(nome);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }



}
