package eduardooguedes.aula20200821;

public class Carro {

    private boolean ligado = false;

    public Carro() {
    }

    public void ligar() {
        ligado = true;
        //System.out.println("ligando...");
    }

    public void desligar() {
        ligado = false;
        //System.out.println("desligando...       ");
    }

    public boolean estáLigado(){
        return ligado;
    }

}
