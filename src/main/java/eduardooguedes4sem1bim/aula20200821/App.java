package eduardooguedes.aula20200821;

public class App {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }

        Carro fusca = new Carro();
        Carro ferrari = new Carro();
        fusca.ligar();
        fusca.desligar();
        ferrari.ligar();
        System.out.println("A Ferrari está ligada? " + ferrari.estáLigado());
        System.out.println("O Fusca está ligado? " + fusca.estáLigado());
    
    }

}