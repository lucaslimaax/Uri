
package uri_1037;

import java.util.Scanner;


public class Uri_1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextDouble();

        if (n >= 0.00 && n <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (n > 25.00 && n <= 50.00) {
            System.out.println("Intervalo (25,50]");
        } else if (n > 50.00 && n <= 75.00) {
            System.out.println("Intervalo (50,75]");
        } else if (n > 75.00 && n <= 100.00) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }

    }
    

