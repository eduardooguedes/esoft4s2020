package eduardooguedes.aula20200908;

public class Endereço {
	private String logradouro;
    private String numero;

    public Endereço(String logradouro, String numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNúmero() {
        return numero;
    }
    @Override
    public String toString() {
        return "Endereço [logradouro=" + logradouro + ", numero=" + numero +"]";
    }

}

