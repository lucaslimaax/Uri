package uri_1040;

import java.util.Scanner;

public class Uri_1040 {

    public static void main(String[] args) {

        float N1, N2, N3, N4, media, N5, exame;
        Scanner sc = new Scanner(System.in);

        N1 = sc.nextFloat();
        N2 = sc.nextFloat();
        N3 = sc.nextFloat();
        N4 = sc.nextFloat();

        media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f\n", media);
            System.out.print("Aluno aprovado.\n");

        }

        else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("Media: %.1f\n", media);
            System.out.print("Aluno em exame.\n");
            N5 = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", N5);
            exame = (media + N5) / 2;

            if (exame >= 5.0) {

                System.out.print("Aluno aprovado.\n");

            } else {

                System.out.print("Aluno reprovado.\n");

            }
            System.out.printf("Media final: %.1f\n", exame);
            
            
        } else if (media < 5.0) {
            System.out.printf("Media: %.1f\n", media);
            System.out.print("Aluno reporvado.\n");
        }
      
    }

}
