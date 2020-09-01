package eduardooguedes.aula20200901;

public class Carro {

    private boolean ligado = false;
    private double combustivelNoTanqueLitros = 0.0;
    private double capacidadeTanqueLitros = 0.0;

    public Carro(double capacidadeTanqueLitros) {
        this.capacidadeTanqueLitros = capacidadeTanqueLitros;
    }

    public void abastecer (double volumeAbastecidoEmLitros
    ){
        if(volumeAbastecidoEmLitros
         + combustivelNoTanqueLitros > capacidadeTanqueLitros)
        {
            throw new RuntimeException(
                "O tanque só comporta "
                + capacidadeTanqueLitros
                + " litros. Abastecimento excessivo: "
                + (volumeAbastecidoEmLitros + combustivelNoTanqueLitros)
                + " litros.");            
            }
            combustivelNoTanqueLitros += volumeAbastecidoEmLitros;
            System.out.println("Abastecendo " + volumeAbastecidoEmLitros + " litros.");
    }

    public void ligar(){
        ligado = true;
        combustivelNoTanqueLitros -= 0.05;
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getCombustivelLitros(){
        return combustivelNoTanqueLitros;
    }

    public double getCapacidadeTanqueLitros(){
        return capacidadeTanqueLitros;
    }
    
}
