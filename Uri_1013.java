package uri_1013;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Uri_1013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maiorab;
        int maior;

        maiorab = ((a + b) + abs(a - b)) / 2;
        maior = (maiorab + c + abs(maiorab - c)) / 2;

        System.out.printf("%d eh o maior\n", maior);

    }

}
