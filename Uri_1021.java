package uri_1021;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0");
        float n = sc.nextFloat();
        float centavos = n * 100;
        float cem = 0;
        float cinquenta = 0;
        float vinte = 0;
        float dez = 0;
        float cinco = 0;
        float dois = 0;
        float um = 0;

        float m1 = 0;
        float m50 = 0;
        float m25 = 0;
        float m10 = 0;
        float m05 = 0;
        float m01 = 0;

        cem = n / (float) 100.0;
        n %= 100;
        cinquenta = n / (float) 50.0;
        n %= 50;
        vinte = n / (float) 20.0;
        n %= 20;
        dez = n / (float) 10.0;
        n %= 10;
        cinco = n / (float) 5.0;
        n %= 5;
        dois = n / (float) 2.0;
        n %= 2;

        m1 = centavos % (float) 1.0;
        n %= 1;
        centavos = centavos % 100;
        m50 = centavos / 50;
        centavos %= 50;
        m25 = centavos / 25;
        centavos %= 25;
        m10 = centavos / 10;
        centavos %= 10;
        m05 = centavos / 5;
        centavos %= 5;
        m01 = centavos;

        System.out.printf("NOTAS:\n");
        System.out.printf("%.0f nota(s) de R$ 100,00\n", cem);
        System.out.printf("%.0f nota(s) de R$ 50,00\n", cinquenta);
        System.out.printf("%.0f nota(s) de R$ 20,00\n", vinte);
        System.out.printf("%.0f nota(s) de R$ 10,00\n", dez);
        System.out.printf("%.0f nota(s) de R$ 5,00\n", cinco);
        System.out.printf("%.0f nota(s) de R$ 2,00\n", dois);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%.0f moeda(s) de R$ 1,00\n", m1);
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", m50);
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", m25);
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", m10);
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", m05);
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", m01);

    }

}
