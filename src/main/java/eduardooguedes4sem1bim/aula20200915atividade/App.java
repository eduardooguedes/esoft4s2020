package eduardooguedes.aula20200915atividade;

public class App{
    public static void main(String[] args) {

        Faculdade unicesumar = new Faculdade("Unicesumar", 1390.00);
        Faculdade feitep = new Faculdade("Feitep");

        Curso engenhariaSoftware = new Curso("Engenharia de Software", 1450.90);
        Curso medicina = new Curso("Medicina", 5999.90);
        Curso arquitetura = new Curso("Arquitetura", 999.90);

        unicesumar.setCursoLista(engenhariaSoftware);
        unicesumar.setCursoLista(medicina);

        feitep.setCursoLista(arquitetura);

        System.out.println(unicesumar);
        System.out.println("---------------");
        System.out.println(unicesumar.getNomeFaculdade());
        unicesumar.getDadosCursoLista();
        System.out.println("---------------");
        System.out.println(feitep.getNomeFaculdade());
        System.out.println(feitep.getValorMensalidadeMínima());

    }

}