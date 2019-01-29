package uri_1016;

import java.util.Scanner;

public class Uri_1016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 60;
        int y = 90;
        int dis = sc.nextInt();

        System.out.printf("%d minutos\n",2*dis*(y/x));
    }

}
