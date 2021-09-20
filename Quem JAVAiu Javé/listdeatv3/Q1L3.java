import java.util.Scanner;

public class Q1L3 {

    // –Elabore um algoritmo que some a idade de 5 pessoas.
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade = 0;
        int contador = 0;

        while (contador < 6) {

            System.out.println("Digite a idade");
            idade = ler.nextInt();
            int soma = idade + idade;
            System.out.println(idade);

        }

    }

}
