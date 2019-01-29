 package uri_1008;

import java.util.Scanner;

public class Uri_1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NUMBER = sc.nextInt();
        int TIME = sc.nextInt();
        float HRTB = sc.nextFloat();

        System.out.printf("NUMBER = %d\n", NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", HRTB * TIME);

    }

}
