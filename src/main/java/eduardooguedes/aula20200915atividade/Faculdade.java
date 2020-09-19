package eduardooguedes.aula20200915atividade;

import java.util.List;
import java.util.ArrayList;

public class Faculdade{
    private String nomeFaculdade;
    private double valorMensalidadeMínima; 

    List<Curso> listaCursosFaculdade = new ArrayList<Curso>();

    public Faculdade(String nomeFaculdade){
        setNomeFaculdade(nomeFaculdade);
        setValorMensalidadeMínima(0.0);
    }

    public Faculdade(String nomeFaculdade, double valorMensalidadeMínima){
        setNomeFaculdade(nomeFaculdade);
        setValorMensalidadeMínima(valorMensalidadeMínima);
    }

    @Override
    public String toString(){
        return nomeFaculdade + " - mensalidade mínima R$" + String.parse(valorMensalidadeMínima);
    }

    public String getNomeFaculdade(){
        return nomeFaculdade;
    }

    public void setNomeFaculdade(String nomeFaculdade){
        if(nomeFaculdade.length() < 4)
        {
            throw new RuntimeException("Nome muito curto!");
        }
        this.nomeFaculdade = nomeFaculdade;
    }

    public double getValorMensalidadeMínima(){
        return this.valorMensalidadeMínima;
    }

    public void setValorMensalidadeMínima(double valorMensalidadeMínima){
        if(valorMensalidadeMínima < 499.90){
            System.out.println("Valor mínimo: R$500.00");
            this.valorMensalidadeMínima = 500.0;
        }
        else
        {
            this.valorMensalidadeMínima = valorMensalidadeMínima;
        }
    }

    public void setCursoLista(Curso novoCurso){
        listaCursosFaculdade.add(novoCurso);
    }

    public void getDadosCursoLista(){
        for(Curso cursoLista : listaCursosFaculdade){
            System.out.println(cursoLista.getDadosCurso());
        }
    } 

} 