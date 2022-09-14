/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab3part2a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author shivampatel
 */
public class SNP7265Lab3Part2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tempRName;
        int tempRYear;
        String tempRKind;
        char tempRSource;
        String tempRCost;
        String tempRTitle;
        
        
        Scanner inputFile;
        File inFile = new File("SNP7265Lab3Part2a.txt");
        try
        {
            inputFile = new Scanner(inFile);
            System.out.println("File Found");
            System.out.println("");
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Input File SNP7265Lab3Part2a.txt not found");  
            inputFile = new Scanner(System.in);
        }
        
        
        while (inputFile.hasNext())
        {
           tempRName = inputFile.next();
           tempRYear = inputFile.nextInt();
           tempRKind = inputFile.next();
           tempRSource = (inputFile.next()).charAt(0);
           tempRCost = inputFile.next();
           tempRTitle = inputFile.nextLine();
         
           
            System.out.println("NAME: "+tempRName);
            System.out.println("YEAR: "+tempRYear);
            System.out.println("KIND: "+tempRKind);
            System.out.println("SOURCE: "+tempRSource);
            System.out.println("COST: "+tempRCost);
            System.out.println("TITLE:"+tempRTitle);
            System.out.println("");
            
        }
    
    }  
}
    

