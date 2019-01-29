package uri_1010;

import java.util.Scanner;

public class Uri_1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int peca = sc.nextInt();
        float valor = sc.nextFloat();

        int codigo2 = sc.nextInt();
        int peca2 = sc.nextInt();
        float valor2 = sc.nextFloat();
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",(valor*peca)+(valor2*peca2));

    }

}
