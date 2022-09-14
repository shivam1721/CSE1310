/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab1part3;

/**
 * Shivam Patel
 * UTA ID: 1001707265
 * @author shivampatel
 */
public class SNP7265Lab1Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Correctly find the surface area of the rectangular prism
        int a = 3;
        int b = 4;
        int c = 2;
        int d = 5;
        System.out.print("Original fractions are ");
        System.out.println(a+"/"+b +" and " + c +"/" + d);
        
        int num1st = a * d;
        int num2nd = b * c;
        int denom = b * d;
        System.out.print("The terms in the numerator are ");
        System.out.println(num1st + " and " + num2nd + " and the denominator is " + denom);
        
        double fractionSum = (num1st + num2nd) / (double) denom;
        System.out.print("The equation for the sum of two fractions is ");
        System.out.println("(" + num1st + " + "+num2nd+")/"+denom +"  =  "+(num1st + num2nd)+"/"+denom);
        System.out.println("The sum of the two fractions is "+fractionSum);
        
        
    }
    
}
