package eduardooguedes4sem2bim.aula20201013.ValueObject;

public class Telefone {

    private String ddd;
    private String telefone;

	public Telefone(String valor) {
        
        if(!valor.matches("[0-9]")){
            throw new RuntimeException("Somente permitidos números.");    
        }
        
        this.ddd = valor.substring(0, 2);
        this.telefone = valor.substring(2);
    }

    public String toString(){
        return "(" + ddd + ") " + telefone;
    }

}
