
package uri_1038;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Uri_1038 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      DecimalFormat form = new DecimalFormat("#.00");
      int c = sc.nextInt();
      float q = sc.nextFloat();
      
      
    
       
        switch (c) {
            case 1: {
                float p1 = q * 4;
                System.out.println("Total: R$" + " " + form.format(p1));
                break;
            }
            case 2: {
                float p2 = q *(float) 4.50;
                System.out.println("Total: R$" + " " + form.format(p2));
                break;
            }
            case 3: {
                float p3 = q * 5;
                System.out.println("Total: R$" + " " + form.format(p3));
                break;
            }
            case 4: {
                float p4 = q * 2;
                System.out.println("Total: R$" + " " + form.format(p4));
                break;
            }
            case 5: {
                float p5 = q *(float) 1.50;
                System.out.println("Total: R$" + " " + form.format(p5));
                break;
            }
        }

    }
}
              
    

