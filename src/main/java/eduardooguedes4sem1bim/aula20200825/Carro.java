package eduardooguedes.aula20200825;

public class Carro {

    private boolean ligado = false;
    private double volumeCombustivelTanque = 0.0;
    
    public Carro() {
    }

    public void abastecer (double volumeEmLitros){
        volumeCombustivelTanque += volumeEmLitros;
        System.out.println("Abastecendo " + volumeEmLitros + " litros.");
    }

    public void ligar(){
        ligado = true;
        volumeCombustivelTanque -= 0.05;
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getVolumeCombustivelLitros(){
        return volumeCombustivelTanque;
    }
    

}
