public class Cnpj {
    
    private String valor;

    public Cnpj(String valor){
        if(valor.length != 14){
            throw new RunTimeException("Quantidade de caracteres insuficiente!");
        }    
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }

}
