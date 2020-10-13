package eduardooguedes.aula20200903.ValueObjects;

public class Nome {
    private String valor;

    public Nome(String valor){
        if(null == valor || valor.trim().split(' ').length() < 2 || valor.trim().length() == 0){
            throw new RuntimeException("O nome deve possuir duas palavras!");
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
