/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab2part2e;

import java.util.Scanner;

/** Shivam Patel
 * UTA ID: 1001707265
 * @author shivampatel
 */
public class SNP7265Lab2Part2e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int shoeSize;
        int mult1st = 5;
        int addTo = 50;
        int multBy = 20;
        int addCount = 1019;
        int year;
        Scanner inputKybd = new Scanner(System.in);
        System.out.println("Please enter your shoe size and round up if you wear a half size ");
        shoeSize = inputKybd.nextInt();
        
        System.out.println("We are going to multiply the shoe size by 5 ");
        mult1st = shoeSize * 5;
        System.out.println(+mult1st);
        
        System.out.println("We are going to add 50 to the previous value ");
        addTo = mult1st + 50;
        System.out.println(+addTo);
        
        System.out.println("We are going to multiply the last value by twenty ");
        multBy = addTo * 20;
        System.out.println(+multBy);
        
        System.out.println("We are now adding 1019 to the last value ");
        addCount = multBy + 1019;
        System.out.println(+addCount);
        
        Scanner inputKybrd = new Scanner(System.in);
        System.out.println("Please enter the year you were born ");
        year = inputKybrd.nextInt();
        System.out.println("We are going to subtract the year from the previous value");
        addCount = addCount - year;
        
        System.out.println("Now we have created a number that starts with your shoe size and ends with your age");
        System.out.println("And the number is "+addCount);
        
        int age;
        int size;
        
        age = (addCount % 100);
        System.out.println("Your age is "+age);
        
        size = (addCount / 100);
        System.out.println("Your size is "+size);
        
        
    }
    
}
