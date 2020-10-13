package eduardooguedes.aula20200901;

public class DecimalPositivo {

    private double valor;

    public DecimalPositivo(double valor, String message)
    {
        if(valor < 0.0)
        {
            throw new RuntimeException(message);
        }
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

}
