package uri_1035;

import java.util.Scanner;

public class Uri_1035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if ((B > C && D > A) && (C + D > B + A) && (C >= 0 && D >= 0) && (A % 2 == 0)){
        

            System.out.println("Valores aceitos");
        
        } else { System.out.println("Valores não aceitos");

    }
}
}