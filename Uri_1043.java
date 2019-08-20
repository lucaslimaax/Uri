package uri_1043;

import java.util.Scanner;

public class Uri_1043 {

    public static void main(String[] args) {
        float A, B, C, areaTrapezio, perimetroTriangulo;

        Scanner sc = new Scanner(System.in);

        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        if ((A < (float)(B+C)) && (B < (float)(A+C)) && (C < (float)(B+A))) {
           perimetroTriangulo = A + B + C;
            System.out.printf("Perimetro = %.1f\n",perimetroTriangulo);
        } else {
           areaTrapezio = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n",areaTrapezio);
        }
    }

}
