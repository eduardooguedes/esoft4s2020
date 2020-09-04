public class Cpf {
    
    private String valor;

    public Cpf(String valor){
        if(validarCpf(valor)){
            this.valor = valor;
        }
        else
        {
            throw new RunTimeException("CPF inválido!");
        }     
    }

    private boolean validarCpf(String valor){
        
        if(valor.length != 11){
            return false;
        }        

        String[] number = valor.split();
        int cont, calc, x=10;
        for(cont = 0; cont < 10; cont++){
            calc += Integer.parseInt(number[cont]) * x;
            x--;
        }
        calc = (calc * 10 % 11) 

        if(calc == 10 && number[10] == 0 or calc == number[10]){
            calc = 0;
            x=11;
            for(cont = 0; cont < 11; cont++){
                calc += Integer.parseInt(number[cont]) * x;
                x--;
            }
            calc = (calc * 10 % 11) 
            
            if(calc == 10 && number[11] == 0 or calc == number[11]){
                return true;
            }
        }
        return false;
    }


}
