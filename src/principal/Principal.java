package principal;
import java.util.Scanner;
import descontos.*; 
import java.util.Locale;
public class Principal {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        Scanner tc = new Scanner (System.in);
        sc.useLocale(Locale.US);
        
        do {
        System.out.print ("\t\t\t\t\t\t BEM-VINDO!" + "\n \n");
        System.out.print("\t Digite seu nome completo: ");
        String nome = tc.nextLine();
        System.out.print ("\t Agora digite seu salario bruto mensal R$: ");
        double salarioBruto = sc.nextDouble();
        System.out.print ("\t Quantas horas diarias voce trabalha? " + "\n" + "\t Digite somente numeros: ");
        int horaTrabalhada = sc.nextInt();
        System.out.print ("\t Digite o valor do bonus recebido no ultimo mes" + "\n" + "\t Caso nao exista, considere o valor como 0." + "\n" + "\t R$: ");
        double bonus = sc.nextDouble();
        System.out.print ("\t Digite a quantidade de horas extras trabalhadas" + "\n" + "\t Caso nao exista, considere o valor como 0." + "\n" + "\t : " );
        int horaExtra = sc.nextInt();
        double valorPorHora = (salarioBruto / 30) /(horaTrabalhada);
        double valorHoraExtra = horaExtra * valorPorHora;
        INSS calcINSS = new INSS (); 
        double descINSS = calcINSS.calculoINSS(salarioBruto); 
        IRPF calcIRPF = new IRPF();
        double descIRPF = calcIRPF.calculoIRPF(salarioBruto, descINSS, valorHoraExtra);
        
        
        ValeTransporte calcVale = new ValeTransporte ();
        double descValeTransporte = calcVale.calculoValeTransporte(salarioBruto);
        
        ValeRefeicao calcRefeicao = new ValeRefeicao ();
        double descValeRefeicao = calcRefeicao.calculoValeRefeicao(salarioBruto);
        
        ValeAlimentacao calcAlimentacao = new ValeAlimentacao ();
        double descValeAlimentacao = calcAlimentacao.calculoValeAlimentacao(salarioBruto);
        
        ConvenioMedico calcConvMedico = new ConvenioMedico ();
        double descConvMedico = calcConvMedico.calculoConvenioMedico(salarioBruto);
        
        double descTotal = (salarioBruto + bonus + valorHoraExtra) - descIRPF - descINSS;
        
        
        System.out.print ("\t Voce utiliza vale transporte? [S] ou [N]: ");
        String valeTrans = sc.next();
        
        if (valeTrans.equalsIgnoreCase("s")){ 
           calcVale.calculoValeTransporte(salarioBruto);
           descTotal = descTotal - descValeTransporte;
           
      } else if (valeTrans.equalsIgnoreCase("n")){
          
          descValeTransporte = 0;
           
      } /*else if (!valeTrans.equalsIgnoreCase("s") || !valeTrans.equalsIgnoreCase("n")){
          
         System.out.println("\t Entrada invalida! Digite novamente: ");
      } */
      
        
        
        
        System.out.print ("\t Voce tem vale alimentacao? [S] ou [N]: ");
        String valeAlim = sc.next();
        
        if (valeAlim.equalsIgnoreCase("s")){ 
           calcAlimentacao.calculoValeAlimentacao(salarioBruto);
           descTotal = descTotal - descValeAlimentacao;
           
           } else if (valeAlim.equalsIgnoreCase("n")){
          
          descValeAlimentacao = 0;
           
      } /*else if (!valeAlim.equalsIgnoreCase("s") || !valeAlim.equalsIgnoreCase("n")){
          
         System.out.println("\t Entrada invalida! Digite novamente: ");
      }*/
        
        System.out.print ("\t Voce tem vale refeicao? [S] ou [N]: ");
        String valeRefeic = sc.next();
        
        if (valeRefeic.equalsIgnoreCase("s")){ 
           calcRefeicao.calculoValeRefeicao(salarioBruto);
           descTotal = descTotal - descValeRefeicao;
           
            } else if (valeAlim.equalsIgnoreCase("n")){
          
          descValeRefeicao = 0;
           
      } /* else if (!valeRefeic.equalsIgnoreCase("s") || !valeRefeic.equalsIgnoreCase("n")){
          
         System.out.println("\t Entrada invalida! Digite novamente: ");
      } */
        
        
        System.out.print ("\t Voce tem convenio medico? [S] ou [N]: ");
        String convMedico = sc.next();
        
        if (convMedico.equalsIgnoreCase("s")){ 
           calcConvMedico.calculoConvenioMedico(salarioBruto);
           descTotal = descTotal - descConvMedico;
           
           } else if (valeAlim.equalsIgnoreCase("n")){
          
          descConvMedico = 0;
           
      } /* else if (!convMedico.equalsIgnoreCase("s") || !convMedico.equalsIgnoreCase("n")){
          
         System.out.println("\t Entrada invalida! Digite novamente: ");
      }*/

 System.out.println("----------------------------------------------------------------");
 System.out.println("|\t\t\t - HOLERITE - \t\t\t");
 System.out.println("----------------------------------------------------------------");
 System.out.println("|\t\t\t\t\t\t\t");
 System.out.println("|Nome: \t\t" + nome);
 System.out.println("|\t\t\t\t\t\t\t");
 System.out.println("|CREDITOS: - \t\t\t\t\t\t\t");
 System.out.println("|Salario Bruto: \t\t R$ " +String.format("%.2f", salarioBruto));
 System.out.println("|Hora Extra: \t\t\t R$ " +String.format("%.2f", valorHoraExtra));
 System.out.println("|Bonus: \t\t\t R$ " +String.format("%.2f", bonus));
 System.out.println("|DEBITOS: - \t\t\t\t\t\t\t");
 System.out.println("|Desconto IRPF: \t\t R$ " +String.format("%.2f", descIRPF));
 System.out.println("|Desconto INSS: \t\t R$ " +String.format("%.2f",descINSS));
 System.out.println("|Vale Alimentacao: \t\t R$ " +String.format("%.2f",descValeAlimentacao));
 System.out.println("|Vale Refeicao: \t\t R$ " +String.format("%.2f",descValeRefeicao));
 System.out.println("|Vale Transporte: \t\t R$ " +String.format("%.2f", descValeTransporte));
 System.out.println("|Convenio Medico: \t\t R$ " +String.format("%.2f", descConvMedico));
 System.out.println("|\t\t\t\t\t\t\t");
 System.out.println("|Salario Liquido: \t\t R$ " +String.format("%.2f", descTotal));
 System.out.println("----------------------------------------------------------------");
 System.out.println("\n" + "Deseja continuar? [S] ou [N]");

        } while (sc.next().equalsIgnoreCase("s"));

    }
   
    }      
   