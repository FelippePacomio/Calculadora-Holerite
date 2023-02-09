
package descontos;

public class ValeAlimentacao {
    
     public double calculoValeAlimentacao (double salarioBruto) {
        
        double descValeAlimentacao = 0;
    
        if (salarioBruto > 3930.51) {
            descValeAlimentacao = salarioBruto * 0.02;
        
        
        }
        
        return descValeAlimentacao;
    }
    
}

