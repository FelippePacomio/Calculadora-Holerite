
package descontos;

public class INSS {
    
    public double calculoINSS (double salarioBruto) {
        
        double descontoINSS;
    
        if (salarioBruto <= 1212.00) {
            descontoINSS = salarioBruto * 0.075;
           
        } else if(salarioBruto <= 2427.35) {
            descontoINSS = salarioBruto * 0.09;
        
            
        } else if(salarioBruto <= 3641.03) {
            descontoINSS = salarioBruto * 0.12;
            
        } else {
            descontoINSS = salarioBruto * 0.14;
        }
    
        
        return descontoINSS;
    }
    
}
