package exerc.rodrigo.terminalEargumentos;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);    

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        }catch(InputMismatchException e){
            System.out.println("O CAMPO IDADE OU ALTURA ESTÁ INCORRETO,PRECISAM SER NÚMERICOS");
        }
    }
}
