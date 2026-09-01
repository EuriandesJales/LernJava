import javax.security.auth.login.AppConfigurationEntry;
import java.util.Scanner;

public class media {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in); // Criação do objeto scanner

        /* Fazendo o input das notas*/
        System.out.println("Primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Segunda nota");
        double nota2 = entrada.nextDouble();
        System.out.println("Terceira nota");
        double nota3 = entrada.nextDouble();
        System.out.println("Quarta nota");
        double nota4 = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Qual foi a frenquencia do aluno?");
        int frequencia = entrada.nextInt();
        System.out.println("A Média do Aluno é " + media);
        boolean pedencia = false;

        /* Bloco de Condições */
     /*
     if (media >= 7){
          System.out.println("Aluno passou");
      }
      else if (media >= 5) {
          System.out.println("Aluno vai ra recuperação");
      }

      else{
          System.out.println("Aluno não passou Media " + media + "menor que 7");
      }

    */


        if (frequencia < 75 || media < 5 || pedencia == true) {
            System.out.println("Aluno reprovado");
        } else if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação'");
        }

        /*else {
            System.out.println("Aluno Reprovado media muito baixa");
        }
        */
    }
}
