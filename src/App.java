 //faixa de frequencia cardiaca ver 0.2.1
import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
       
         Scanner ler = new Scanner(System.in);
        //declaração de variaveis
         int idade = 0,freqRepouso = 0, cod =0; 
         float intensidade = 0;
         float freqMax = 0, freqMin = 0;
         char sexo;
        //inserção dos dados solicitados
        do{
         System.out.print("Digite sua idade: ");
         idade = ler.nextInt();

         System.out.print("Digite sua frenquencia cardiaca de repouso: ");
         freqRepouso = ler.nextInt();

         System.out.print("Digite a intensidade do treino (em %): ");
         intensidade = ler.nextFloat();
        
         intensidade = intensidade /100;
         System.out.print("Digite seu Sexo sendo 'M' para Masculino e 'F' para Feminino: ");
         sexo = ler.next().charAt(0);
        //calculo das frequencias cardiacas maxima e minima
        if(sexo == 'f' || sexo == 'F'){
            if (idade >= 25){
                freqMax = ((200 - idade + 12) - freqRepouso) * intensidade + freqRepouso;
                freqMin = ((200 - idade - 12) - freqRepouso) * intensidade + freqRepouso;
            } else {
                freqMax = ((200 - idade + 10) - freqRepouso) * intensidade + freqRepouso;
                freqMin = ((200 - idade - 10) - freqRepouso) * intensidade + freqRepouso;
            }
            System.out.println("A zona alvo de frequência cárdiaca é entre: " + freqMax + " e " + freqMin);
        } else if (sexo == 'M' || sexo == 'm'){
            if (idade>= 25){
                freqMax = ((220 - idade + 12) - freqRepouso) * intensidade + freqRepouso;
                freqMin = ((220 - idade - 12) - freqRepouso) * intensidade + freqRepouso;
            } else {
                freqMax = ((220 - idade + 10) - freqRepouso) * intensidade + freqRepouso;
                freqMin = ((220 - idade - 10) - freqRepouso) * intensidade + freqRepouso;
            }
            System.out.printf("A zona alvo de frequência cárdiaca é entre: %.2f  e %.2f  %n", freqMax, freqMin);
        } else {
            System.out.print("Caractere Inválido");
        }

        System.out.print("Digite qualquer número para continuar ou 1 para sair: ");
        cod = ler.nextInt();
    }while(cod != 1);
    
        ler.close();
    }
}