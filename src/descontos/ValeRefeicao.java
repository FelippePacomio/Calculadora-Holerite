
package descontos;

public class ValeRefeicao {
       
    public double calculoValeRefeicao (double salarioBruto) {
        
        double descValeRefeicao = 0;
    
        if (salarioBruto > 1310.17) {
            descValeRefeicao = salarioBruto * 0.03;
        
        }
        
        
        
        return descValeRefeicao;
    }
    
}
