package eduardooguedes.aula20200903;

import eduardooguedes.aula20200903.ValueObjects.*;

public abstract class Pessoa {
    
    private Nome nome;
    
    public void setNome(Nome novoNome) {
        this.nome = novoNome;  
    }

    public Nome getNome(){
        return this.nome;
    }


}
