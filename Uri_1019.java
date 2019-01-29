package uri_1019;

import java.util.Scanner;

public class Uri_1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int hora;
        int min;
        int seg;

        hora = n / 3600;

        min = n % 3600 / 60;

        seg = n % 60;

        System.out.printf("%d:%d:%d\n",hora, min, seg);

    }

}
