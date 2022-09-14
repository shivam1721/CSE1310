/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab1part2;

/**
 * Shivam Patel
 * UTA ID: 1001707265
 * @author shivampatel
 */
public class SNP7265Lab1Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("");
        int num1 = 36; //num1 & num2 are variables
        int num2;      //that that can hold integer values
        System.out.println("Printing variable values");
        System.out.println("Num1 = "+num1);
        num2 = 9;
        System.out.println("Num2 = "+num2);
        System.out.println("Product of num1 & num2 = "+ (num1 * num2));
        System.out.println("Quotient of num1 & num2 = "+(num1 / num2));
        System.out.println(); // prints a blank line
        System.out.println("Original Num1 = "+num1+" Num2 = "+num2);
        
        num1 = num1 - (num2 * 2);
        double num3 = num2; // num3 will hold floating point values
        System.out.println("\nNew values of num1 from [num1 = num1 - (num2 * 2)] is "+num1);
        System.out.println("New Num1 = "+num1+" Num2 = "+num2+" Num3 = "+num3+"\n");
        num3 = num3 / 2 + (num1/num3)/3;  // statement 1
        num2 = num2 / 2 + (num1/num2)/3;  // statement 2
        
        System.out.println("Final value of num3 from [num3 = num3 / 2 + (num1/num3)/3] is "+num3 );
        System.out.println("Final value of num2 from [num2 = num2 / 2 + (num1/num2)/3] = "+num2 + "\n");
        System.out.println("Addition sign between num1 and num2 (version 1) "+ num1 + num2 );
        System.out.println("Addition sign between num1 and num2 (version 2) "+(num1 + num2));
        System.out.println("Addition sign between num1 and num3 (version 3) "+ (num1 + num3));
        System.out.println("Addition sign between num1 and num3 (version 4) "+ num1 + num3 );
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
