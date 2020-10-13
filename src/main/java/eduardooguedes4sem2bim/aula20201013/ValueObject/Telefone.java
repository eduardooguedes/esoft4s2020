package eduardooguedes4sem2bim.aula20201013.ValueObject;

public class Telefone {

    private String ddd;
    private String telefone;

	public Telefone(String valor) {
        this.ddd = valor.substring(0, 2);
        this.telefone = valor.substring(2);
    }

    public String toString(){
        return "(" + ddd + ") " + telefone;
    }

}
