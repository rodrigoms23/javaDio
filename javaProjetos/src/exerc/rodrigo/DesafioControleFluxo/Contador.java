package exerc.rodrigo.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = scanner.nextInt();

        try {
            contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException e) {
            // TODO: handle exception
            System.out.println("Parâmetro 2 tem que ser maior que o primeiro.");
        }
    }
    static void contar(int parametro1,int parametro2) throws ParametrosInvalidosException{
        if(parametro1 >= parametro2)
            throw new ParametrosInvalidosException();
        
        int contagem = parametro2 - parametro1;
            for(int i = 1;i<=contagem;i++){
                System.out.println("Imprimindo o número "+i);
            }      
    }
}
/*O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
Crie o projeto DesafioControleFluxo
Dentro do projeto, crie a classe Contador.java para realizar toda a codificação do nosso programa.
Dentro do projeto, crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema. */