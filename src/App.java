import java.util.Scanner; // metod of input dados

public class App {
    public static void main(String[] args) {
        /*
        // V1: None input
        // Vars
        String nome = "Euriandes Jales"; // str maisculo because is class
        int idade = 20;
        double altura = 1.70; // is float
        double peso = 67.00;
        double IMC = peso / (altura*altura);
        System.out.println("\n"+"#".repeat(5)+" Dados V1 "+"#".repeat(5));
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("O IMC de -> " + nome + "é -> " + IMC );
        */
        // ----------------- v2 with input--------------------
    // Object Scanners for all var
        /* Apenas um objeto basta
    Scanner nome = new Scanner(System.in);
    Scanner idade = new Scanner(System.in);
    Scanner altura = new Scanner(System.in);
    Scanner peso = new   Scanner(System.in);
*/
    Scanner entrada = new Scanner(System.in);
    System.out.println("\n"+"#".repeat(5) + " Dados V2 com Input " + "#".repeat(5));
    System.out.println("Insira o Nome -> ");
    String nome = entrada.nextLine();
    System.out.println("Idade -> ");
    int idade = entrada.nextInt();
    System.out.println("Altura -> ");
    double altura = entrada.nextDouble();
    System.out.println("Peso -> ");
    double peso = entrada.nextDouble();
    double IMC = peso / (altura * altura);
    System.out.println("O IMC é -> " + IMC);
    }
}

