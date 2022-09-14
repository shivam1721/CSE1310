/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab2part4c;

import java.util.Scanner;

/** Shivam Patel
 * UTA ID: 1001707265
 * @author shivampatel
 */
public class SNP7265Lab2Part4c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int d = 0;
        int e;
        int dde;
        int deed;
        int dSqu;
        String again = new String();
        String No = new String();
        
        again = "Y";
        
        for (d = 0; d < 9; d++)
        {
            
            System.out.println("Value of d is "+d);    
            
            Scanner inputKyd = new Scanner(System.in);
            System.out.println("Enter value for e ");
            e = inputKyd.nextInt();
        
            dde = (int) Math.pow(((d * 10)+d),e);
            deed = (d * 1000)+(e * 100)+(e * 10)+d;
 
            if (dde == deed)
                System.out.println("The values are equal, "+dde);
            
            else
                System.out.println("The value of dde is "+dde+" and the value of deed is "+deed+", are different ");
        
            System.out.println("Do you want to run the program again ? 'Y' or 'N' ");
            Scanner inputKyad = new Scanner(System.in);
            again = inputKyad.next();
        
        }    
        
        System.out.println("The program is over");    
        
        
    }
    
}
