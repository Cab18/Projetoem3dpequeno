import java.util.Scanner;

public class Q2 {

    /**
     * Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
     * de 10 pessoas. Fazer um algoritmo que calcule e escreva: a maior e a menor
     * altura do grupo; média de altura dos homens; o número de mulheres.
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double alt;
        int sx;
        int m;
        int h;
        int contador;

        System.out.println("Digite a quantidade de mulheres");
        m = ler.nextInt();
        System.out.println("Digite o numero de homens");
        h = ler.nextInt();

        int sxh = h;
        int sxm = m;

        System.out.println("Quantidade de homens:");
        System.out.println(sxh);

        System.out.println("Quantidade de mulheres:");
        System.out.println(sxm);

        while (sxh <= 10) {

            System.out.println("Digite a altura dos homens:");
            alt = ler.nextDouble();
            double media = alt / sxh;

            System.out.println("A media de altura dos homens é");
            System.out.println(media);

        }
        while (sxm <= 10) {

            System.out.println("Digite a altura das mulheres:");
            altm = ler.nextDouble();
            double mediam = altm / sxm;

            System.out.println("A media de altura dos mulheres:");
            System.out.println(mediam);
        }

    }
}
