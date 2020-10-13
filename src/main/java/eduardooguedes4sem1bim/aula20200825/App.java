package eduardooguedes.aula20200825;

public class App {

    public static void main(String[] args) {
        
        Carro novo = new Carro();
        novo.abastecer(30.5);
        novo.ligar();       
        boolean carroLigado = novo.isLigado();
        double volumeEmLitros = novo.getVolumeCombustivelLitros();
        
        System.out.println("O carro esta ligado? " + carroLigado + ", combustivel no tanque: " + volumeEmLitros);

        
    }
}