/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri_1009;

import java.util.Scanner;


public class Uri_1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vendedor=sc.nextLine();
        double salario=sc.nextDouble();
        double montante=sc.nextDouble();
        
        System.out.printf("TOTAL = R$ %.2f\n",salario+montante*0.15);

       
    }

}
