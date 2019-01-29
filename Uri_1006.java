
package uri_1006;

import java.util.Scanner;

public class Uri_1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextFloat();
        double B = sc.nextFloat();
        double C= sc.nextFloat();
        double MEDIA = (double) (((A * 2) + (B * 3)+(C * 5)) / (2 + 3 + 5));
        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }

}
