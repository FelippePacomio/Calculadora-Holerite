
package descontos;

public class ConvenioMedico {
    
       public double calculoConvenioMedico (double salarioBruto) {
        
        double descConvMedico = 0;
    
        if (salarioBruto > 1310.17) {
            descConvMedico = salarioBruto * 0.04;
            
        } else {}

        return descConvMedico;
    
}
}
