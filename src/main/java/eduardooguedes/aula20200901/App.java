package eduardooguedes.aula20200901;

public class App {

    public static void main(String[] args) {
        
        Carro novo = new Carro(44.0);
        novo.abastecer(30.5);
        novo.ligar();       
        boolean carroLigado = novo.isLigado();
        double combustivelNoTanqueLitros = novo.getCombustivelLitros();
        
        System.out.println("O carro esta ligado? " + carroLigado + ", combustivel no tanque: " + combustivelNoTanqueLitros);

        
    }
}