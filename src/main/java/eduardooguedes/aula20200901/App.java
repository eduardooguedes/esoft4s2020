package eduardooguedes.aula20200901;

public class App {

    public static void main(String[] args) {
        
        Carro MyCar = new Carro(44.0);
        MyCar.abastecer(30.5);
        MyCar.ligar();       
        boolean carroLigado = MyCar.isLigado();
        double combustivelNoTanqueLitros = MyCar.getCombustivelLitros();
        
        System.out.println("O carro esta ligado? " + carroLigado + ", combustivel no tanque: " + combustivelNoTanqueLitros);
        MyCar.abastecer(30.5);
        MyCar.abastecer(0.0);
        
    }
}