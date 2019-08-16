package uri_1041;

import java.util.Scanner;

public class Uri_1041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float x;
        float y;
        Scanner sc = new Scanner(System.in);

        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x == 0 && y == 0) {
            System.out.printf("Origem\n");
        } else if (x == 0) {
            System.out.printf("Eixo Y\n");
        } else if (y == 0) {
            System.out.printf("Eixo X\n");
        } else if (x > 0 && y > 0) {
            System.out.printf("Q1\n");
        } else if (x > 0 && y < 0) {
            System.out.printf("Q4\n");
        } else if (x < 0 && y > 0) {
            System.out.printf("Q2\n");
        } else {
            System.out.printf("Q3\n");
        }

    }

}
