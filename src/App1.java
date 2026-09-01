
/* import static java.lang.System.out; não uma boa pratica.*/

/* import java.util.Scanner; Não é necessario*/

public class App1 {
    public static void main(String[] args) throws Exception{


        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.println("Qual é a sua idade?");
        int idade = entrada.nextInt();

        if ( idade >= 18) {
            System.out.println("já pode ser preso");
        }else{
            System.out.println("Escapou o bixim");
        }

    }
    }
