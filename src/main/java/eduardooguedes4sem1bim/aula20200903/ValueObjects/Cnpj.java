package eduardooguedes.aula20200903.ValueObjects;

public class Cnpj {
    
    private String valor;

    public Cnpj(String valor){
        if(valor.length() != 14){
            throw new RuntimeException("Quantidade de caracteres insuficiente!");
        }    
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }

}
