/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliação_java;

import java.util.Scanner;

public class Avaliação_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         
         String pgm;
         
         System.out.println ("Digite o código do programa que deseja: ");
         pgm = entrada.nextLine();
         
         char pgm2 = pgm.charAt(0);
         while (pgm2 != 0)
         {
             switch (pgm2)
             {
                 case '0': System.exit(0); break;
                 case '1': GastoEnergeticoBasal(); break;
                 case '2': extenso(); break;
                 case '3': Multiplos(); break;
                 case '4': Crescente_Decrescente(); break;
                 case '5': PremioNatal(); break;
                 case '6': Turno_hora(); break;
                 case '7': Sequencia_Media(); break;
                 case '8': Lanchonete(); break;
                 case '9': Soma_1nInteiros(); break;
                 case 'X': Primos(); break;
                 default: System.out.print("erro");
             }
             System.out.print("Digite o código do programa que deseja: ");
             pgm = entrada.nextLine();
             pgm2 = pgm.charAt(0);
         }
    }
    
    private static void GastoEnergeticoBasal()
    {
        Scanner entrada = new Scanner (System.in);
        
        double PC, ALT, I, sexo;
        
        System.out.println ("Informe o seu sexo digitando 1 para homem e 2 para mulher ");
        sexo = entrada.nextDouble();
        System.out.println ("Informe o peso corporal em kg: ");
        PC = entrada.nextDouble();
        System.out.println ("Informe a sua altura em cm: ");
        ALT = entrada.nextDouble();
        System.out.println ("Informe a sua idade em anos: ");
        I = entrada.nextDouble();
        
        if(sexo == 1)
        {
            double result = 66.47 + (13.75 * PC) + (5 * ALT) - (6.76 * I);
            System.out.println ("O seu gasto energético basa é: "+result);
        }
        else
            if(sexo == 2)
                {
                    double result = 655.1 + (9.56 * PC) + (1.85 * ALT) - (4.67 * I);
                    System.out.println ("O seu gasto energético basa é: "+result);
                }
    }
    
    private static void extenso()
    {
        Scanner num = new Scanner(System.in);
       
        int vlr, c,  d, u, j;
        
        System.out.println("Digite um número de 0 atpe 999");
        
        vlr = num.nextInt();
        c = vlr/100;
        d = vlr % 100/10;
        u = (vlr % 100)%10;
        j = vlr/1;
        
        if(c==1&&d==0&&u==0){
            System.out.println("cem");}
        else if(c==0&&d==0&&u==0){
            System.out.println("zero");
        }
        else
            {
            if(c>=1&&d==0&&u==0){
             
            switch(c){
            case 1 :System.out.println("Cento ");
            break;
            case 2 : System.out.println("Duzentos ");
            break;
            case 3 : System.out.println("Trezentos ");
            break;
            case 4 : System.out.println("Quatrocentos ");
            break;
            case 5 : System.out.println("Quinhentos ");
            break;
            case 6 : System.out.println("Seiscentos ");
            break;
            case 7 : System.out.println("Setecentos ");
            break;
            case 8 : System.out.println("Oitocentos ");
            break;
            case 9 : System.out.println("Novecentos ");
            break;
            }
        }
            else
                {
                    switch(c)
                        {
                    case 1 : System.out.println("Cento e ");break;
                    case 2 : System.out.println("Duzentos e ");break;
                    case 3 : System.out.println("Trezentos e ");break;
                    case 4 : System.out.println("Quatrocentos e");break;
                    case 5 : System.out.println("Quinhentos e ");break;
                    case 6 : System.out.println("Seiscentos e ");break;
                    case 7 : System.out.println("Setecentos e ");break;
                    case 8 : System.out.println("Oitocentos e ");break;
                    case 9 : System.out.println("Novecentos e ");break;
                }
        }
        if(d==1)
            {
                switch(u)
                    {
                        case 0 : System.out.println("Dez ");break;
                        case 1 : System.out.println("Onze ");break;
                        case 2 : System.out.println("Doze ");break;
                        case 3 : System.out.println("Treze ");break;
                        case 4 : System.out.println("Quatorze ");break;
                        case 5 : System.out.println("Quinze ");break;
                        case 6 : System.out.println("Dezesseis ");break;
                        case 7 : System.out.println("Dezessete ");break;
                        case 8 : System.out.println("Dezoito ");break;
                        case 9 : System.out.println("Dezenove ");break;
                    }
            }
            else if(d>1)
                {
                    switch (d)
                        {
                            case 2 : System.out.println("Vinte");break;
                            case 3 : System.out.println("Trinta");break;
                            case 4 : System.out.println("Quarenta");break;
                            case 5 : System.out.println("Cinquenta");break;
                            case 6 : System.out.println("Sessenta");break;
                            case 7 : System.out.println("Setenta");break;
                            case 8 : System.out.println("Oitenta");break;
                            case 9 : System.out.println("Noventa");break;
                        }
                        switch (u)
                            {
                                case 1 : System.out.println(" e Um ");break;
                                case 2 : System.out.println(" e Dois ");break;
                                case 3 : System.out.println(" e Tres ");break;
                                case 4 : System.out.println(" e Quatro ");break;
                                case 5 : System.out.println(" e Cinco ");break;
                                case 6 : System.out.println(" e Seis ");break;
                                case 7 : System.out.println(" e Sete ");break;
                                case 8 : System.out.println(" e Oito ");break;
                                case 9 : System.out.println(" e Nove ");break;
                            }
                }
                else
                    {
                        switch (u)
                            {
                                case 1 : System.out.println("Um ");break;
                                case 2 : System.out.println("Dois ");break;
                                case 3 : System.out.println("Tres ");break;
                                case 4 : System.out.println("Quatro ");break;
                                case 5 : System.out.println("Cinco ");break;
                                case 6 : System.out.println("Seis ");break;
                                case 7 : System.out.println("Sete ");break;
                                case 8 : System.out.println("Oito ");break;
                                case 9 : System.out.println("Nove ");break;
                            }
                    }

   
            }
    }
    
    private static void Multiplos()
    {
        Scanner entrada = new Scanner (System.in);
        
        double a, b;
        
        System.out.println ("Escreva o valor de a: ");
        a = entrada.nextDouble();
        System.out.println ("Escreva o valor de b: ");
        b = entrada.nextDouble();
        
        if(a%b==0)
        {
            System.out.println ("O número "+a +" é multiplo de "+b);
        }
        else
        {
            System.out.println ("O número "+a +" não é multiplo de "+b);
        }
    }
    
    private static void Crescente_Decrescente()
    {
        Scanner entrada = new Scanner (System.in);
        
        int I;
        double a, b, c;
        System.out.println ("Escreva 1 ou 2 para o valor de I: ");
        I = entrada.nextInt();
        System.out.println ("Escreva o valor de a: ");
        a = entrada.nextDouble();
        System.out.println ("Escreva o valor de b: ");
        b = entrada.nextDouble();
        System.out.println ("Escreva o valor de c: ");
        c = entrada.nextDouble();
        
        if(I==1)
        {
            System.out.println (+a +"\n"+b+"\n"+c);
        }
        else
        {
            if(I==2)
            {
                
                System.out.println (+c +"\n"+b+"\n"+a);
            }
        }
    }
    
    private static void PremioNatal()
    {
        Scanner entrada = new Scanner (System.in);
       
       double H, N_HX, N_HF, RESULT, RESULT2;
       System.out.println("Informe quantos minutos o funcionário fez de horas extras: ");
       N_HX = entrada.nextDouble();
       System.out.println ("Informe quantos minutos o funcionário faltou: ");
       N_HF = entrada.nextDouble();
       
       H =  (N_HX) -(2/3 * (N_HF));
       RESULT = N_HX/60;
       RESULT2 = N_HF/60;
       
       System.out.println ("O funcionário fez "+RESULT +" horas extras");
       System.out.println ("O funcionário faltou "+RESULT2 +" horas");
       
       if(H>2400)
       {
           System.out.println ("O prêmio do funcionário é de 500,00R$");
       }
       else
       {
           if((H>=1801) && (H<=2400))
           {
               System.out.println ("O prêmio do funcionário é de 400,00R$");
           }
           else
           {
               if((H>=1201)&&(H<=1800))
               {
                   System.out.println ("O prêmio do funcionário é de 300,00R$");
               }
               else
               {
                   if((H>=600)&&(H<=1200))
                   {
                       System.out.println ("O prêmio do funcionário é de 200,00R$");
                   }
                   else
                   {
                       if(H<600)
                       {
                           System.out.println ("O prêmio do funcionário é de 100,00R$");
                       }
                   }
               }
           }
       }
    }
    
    private static void Turno_hora()
    {
        Scanner entrada = new Scanner (System.in);
        
        double hora, result, result2;
        
        System.out.println ("Informe um horário de 0 até 24h: ");
        hora = entrada.nextDouble();
        
        result = hora + 6;
        result2 = result - 24;
        
        System.out.println (result2 +" horas");
    }
    
    private static void Sequencia_Media()
    {
        Scanner entrada = new Scanner (System.in);
        
        float i, med, a;
        i = 0;
        med = 1;
        a = 1;
        
        while (a>=0)
        {
            System.out.println ("Informe um valor: ");
            a = entrada.nextInt();
            med+=a;
            i++;
        }
        System.out.println ("A média é igual a: "+med/(i-1));
    }
    
    private static void Lanchonete()
    {
        Scanner entrada = new Scanner (System.in);
        
        String cd;
        int quant;
        double pc;
        
        System.out.println("(C) Cachorro Quente           R$2");
        System.out.println("(R) Refrigerante              R$2,5");
        System.out.println("(S) Sobremesa                 R$1,5");
        
        System.out.print("Digite o Codigo do Alimento: ");
        cd = entrada.nextLine();
        
        System.out.print("Qual é a quantidade que voçê que(Só aceita número)? ");
        quant = entrada.nextInt();
        
        int i = 1;
        double pcn = 0;
        
        while(i!=0){
            if(null == cd)
            {
                System.out.println ("Só aceita os códigos em letra maiúscula (C, R, S) ");
            }
            else
                switch (cd)
                {
                    case "C": 
                        pc = 2*quant;
                        System.out.println (quant+"Cachorro quente é R$"+pc);
                        pcn += pc;
                        break;
                    case "R":
                        pc = 2.5*quant;
                        System.out.println (quant+"Refrigerante é R$"+pc);
                        pcn += pc;
                        break;
                    case "S":
                        pc = 1.5*quant;
                        System.out.println (quant+"Sobremesa é R$"+pc);
                        pcn += pc;
                        break;
                    default:
                            System.out.println ("Só aceita os códigos em letra maiúscula (C, R, S) ");
                            break; 
                }
                System.out.println ("Digite X para finalizar o pedido ou qualquer outra letra/número para continuar: ");
                String ss = entrada.next();
                if("X".equals(ss))
                {
                    System.out.println ("O preço total ficaria: R$"+pcn);
                    i = 0;
                }
                else
                {
                    System.out.println ("Digite o código do item: ");
                    cd = entrada.next();
                    System.out.println ("Escolha a quantidade que deseja: ");
                    quant = entrada.nextInt();
                    i = 1;
                }
                System.out.println ();
        }
    }
    
    private static void Soma_1nInteiros()
    {
        Scanner entrada = new Scanner (System.in);
        
        int soma, num, i;
        
        System.out.println ("Informe o valor de n: ");
        num = entrada.nextInt();
        
        soma = 0;
        i = 1;
        
        while (i <= num)
        {
            soma = soma + i;
            i = i + 1;
            System.out.println ("A soma dos "+num +" primeiros números inteiros positivos é igual: "+soma);
        }
    }
    
    private static void Primos()
    {
        Scanner entrada = new Scanner (System.in);
        
        int i, a, soma, qtdDiv, num;
        soma = 2;
        qtdDiv = 0;
        
        System.out.println ("Informe um número inteiro e positivo: ");
        num = entrada.nextInt();
        
        for (i=3;i<num;i+=2)
        {
            qtdDiv = 0;
            for(a=1;a<=i;a++)
            {
                if(i%a==0)
                {
                    qtdDiv++;
                }
                if(qtdDiv>2)
                {
                    break;
                }
            }
            if(qtdDiv==2)
            {
                soma+=i;
            }
        }
        System.out.println ("A soma soma dos números primos é igual a: "+soma);
    }
}
