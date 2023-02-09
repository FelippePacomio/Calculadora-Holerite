
package descontos;


public class IRPF {

    public double calculoIRPF (double salarioBruto, double DescINSS, double valorHoraExtra) {
    
       double salarioDescINSS = (salarioBruto + valorHoraExtra) - DescINSS;
       double salarioDescIRPF  = 0;
       
        if ((salarioDescINSS) <= 1903.98) {
            salarioDescIRPF = salarioDescINSS;
           
        } else if (salarioDescINSS <= 2826.65) {
            salarioDescIRPF = salarioDescINSS * 0.075;
            
        } else if (salarioDescINSS <= 3751.05) {
            salarioDescIRPF = salarioDescINSS * 0.15;
            
        } else if (salarioDescINSS >= 4664.68) {
            salarioDescIRPF = salarioDescINSS * 0.225;
            
        } else {
            
        }
    
        return salarioDescIRPF;
    }
    
}

    

