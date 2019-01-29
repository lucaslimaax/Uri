package uri_1017;

import java.util.Scanner;

public class Uri_1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float litros;
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        
        litros=(y/12)*x;

        
        System.out.printf("%.3f\n",litros);
    }

}
