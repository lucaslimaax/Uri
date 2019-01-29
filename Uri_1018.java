package uri_1018;

import java.util.Scanner;

public class Uri_1018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int aux;
        int cem;
        int cinquenta;
        int vinte;
        int dez;
        int cinco;
        int dois;
        int um;

        cem = n / 100;
        aux = n % 100;

        cinquenta = aux / 50;
        aux = aux % 50;

        vinte = aux / 20;
        aux = aux % 20;

        dez = aux / 10;
        aux = aux % 10;

        cinco = aux / 5;
        aux = aux % 5;

        dois = aux / 2;
        aux = aux % 2;
        
        um=aux/1;
        aux=aux % 1;

        System.out.printf("%d\n",n);
        System.out.printf("%d nota(s) de R$ 100,00\n", cem);
        System.out.printf("%d nota(s) de R$ 50,00\n", cinquenta);
        System.out.printf("%d nota(s) de R$ 20,00\n", vinte);
        System.out.printf("%d nota(s) de R$ 10,00\n", dez);
        System.out.printf("%d nota(s) de R$ 5,00\n", cinco);
        System.out.printf("%d nota(s) de R$ 2,00\n",dois);
        System.out.printf("%d nota(s) de R$ 1,00\n",um);

    }

}
