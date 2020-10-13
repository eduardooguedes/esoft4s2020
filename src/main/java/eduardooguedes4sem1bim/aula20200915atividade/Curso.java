package eduardooguedes.aula20200915atividade;

public class Curso{

    private String nomeCurso;
    private double valorCurso;

    public Curso(String nomeCurso){
        setNomeCurso(nomeCurso);
        setValorCurso(super.getValorMensalidadeMínima());
    }

    public Curso(String nomeCurso, double valorCurso){
        setNomeCurso(nomeCurso);
        setValorCurso(valorCurso);
    }

    public String getNomeCurso(){
        return this.nomeCurso;
    }

    public void setNomeCurso(String nomeCurso){
        if(nomeCurso.length() < 5){
            throw new RuntimeException("Caracteres insuficientes para 'Nome Curso'.");
        }
        this.nomeCurso = nomeCurso;
    }

    public void setValorCurso(double valorCurso){
        if(valorCurso < 499.99){
            throw new RuntimeException("Mensalidade de valor muito baixo.");
        }
        this.valorCurso = valorCurso;
    }

    public String getDadosCurso(){
        return nomeCurso + " - mensalidade R$" + valorCurso;
    }


}