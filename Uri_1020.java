
package uri_1020;

import java.util.Scanner;


public class Uri_1020 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ano;
        int mes;
        int dia;
        
        ano=n/365;
        mes=n%365/30;
        dia=n%365%30;
        
        System.out.printf("%d ano(s)\n",ano);
        System.out.printf("%d mes(es)\n",mes);
        System.out.printf("%d dia(s)\n",dia);
        
    }
    
}
