package aula20200903;

public abstract class Pessoa {
    
    private Nome nome;
    
    public abstract void setNome(Nome novoNome){
        nome = novoNome;  
    }

    public Nome getNome(){
        return nome.getValor();
    }


}
