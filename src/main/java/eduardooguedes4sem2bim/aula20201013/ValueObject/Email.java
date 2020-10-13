package eduardooguedes4sem2bim.aula20201013.ValueObject;

public class Email {

    private String emailPrincipal;

    public Email(String valor){        
        if(valor.indexOf("@") == -1 || valor.indexOf(".") == -1){
            emailInvalido();
        }
        else{
            String valida[] = valor.split("@");
            String valida2[] = valida[1].split(".");
            if(!valida2[1].equals("com")){
                emailInvalido();
            }
            else{
                this.emailPrincipal = valor;
            }
        }
    }

    private void emailInvalido(){
        throw new RuntimeException("E-mail inválido!");
    }

}
