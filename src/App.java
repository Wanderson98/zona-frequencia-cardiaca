 //faixa de frequencia cardiaca ver 0.1
import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
       
         Scanner ler = new Scanner(System.in);
        //declaração de variaveis
         int idade,freqRepouso; 
         float intensidade;
         double freqMax, freqMin;
        //inserção dos dados solicitados
         System.out.print("Digite sua idade: ");
         idade = ler.nextInt();

         System.out.print("Digite sua frenquencia cardiaca de repouso: ");
         freqRepouso = ler.nextInt();

         System.out.print("Digite a intensidade do treino (em %): ");
         intensidade = ler.nextFloat();
         intensidade = intensidade /100;
        //calculo das frequencias cardiacas maxima e minima
        freqMax = ((220 - idade + 12) - freqRepouso) * intensidade + freqRepouso;
        freqMin = ((220 - idade - 12) - freqRepouso) * intensidade + freqRepouso;

        System.out.println("A zona alvo de frequência cárdiaca é entre: " + freqMax + " e " + freqMin);
    
        ler.close();
    }
}