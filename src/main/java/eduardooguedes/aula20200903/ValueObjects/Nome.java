package aula20200903;

public class Nome {
    private String valor;

    public Nome(String valor){
        if(null == valor || valor.trim().Split(' ').length < 2 || valor.trim().length == 0){
            throw new RunTimeException("O nome deve possuir duas palavras!");
        }
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }

    @Override
    public String toString(){
        return valor;
    }

}
