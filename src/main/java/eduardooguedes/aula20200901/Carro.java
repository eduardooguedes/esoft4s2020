package eduardooguedes.aula20200901;

public class Carro {

    private boolean ligado = false;
    private double combustivelNoTanqueLitros = 0.0;
    private DecimalPositivo capacidadeTanqueLitros;

    public Carro(double capacidadeTanqueLitros) {
        this.capacidadeTanqueLitros = new DecimalPositivo(capacidadeTanqueLitros, "Capacidade de tanque insuficiente.");
    }

    public void abastecer (double volumeAbastecidoEmLitros
    ){
        if(volumeAbastecidoEmLitros + combustivelNoTanqueLitros > capacidadeTanqueLitros.getValor())
        {
            throw new RuntimeException(
                "O tanque só comporta "
                + capacidadeTanqueLitros
                + " litros. Abastecimento excessivo: "
                + (volumeAbastecidoEmLitros + combustivelNoTanqueLitros)
                + " litros.");            
            }
            else
               if(volumeAbastecidoEmLitros <= 0.0)
               {
                   throw new RuntimeException("Abastecimento nulo não valido!");
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
        return capacidadeTanqueLitros.getValor();
    }
    
}
