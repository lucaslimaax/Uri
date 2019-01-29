package uri_1036;

import java.util.Scanner;

public class Uri_1036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        if ((A == 0) || (((B * B) - (4 * A * C)) < 0)) {
            System.out.print("Impossivel calcular\n");
        } else {
            float R1 =(float) ((-B + Math.sqrt(((B * B) - (4 * A * C)))) / (2 * A));
            float R2 = (float)((-B - Math.sqrt(((B * B) - (4 * A * C)))) / (2 * A));

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }

}
