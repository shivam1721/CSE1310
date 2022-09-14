/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab3part2c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author shivampatel
 */
public class SNP7265Lab3Part2c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MAXROBOTS = 30;
        String tempRName;
        int tempRYear;
        String tempRKind;
        char tempRSource;
        String tempRCost;
        String tempRTitle;
        int ri = 0;
        
        String[] robotName = new String[MAXROBOTS];
        int[] robotYear = new int[MAXROBOTS];
        String[] robotKind = new String[MAXROBOTS];
        char[] robotSource = new char[MAXROBOTS];
        String[] robotCost = new String[MAXROBOTS];
        String[] robotTitle = new String[MAXROBOTS];
        
        
        
        Scanner inputFile;
        File inFile = new File("SNP7265Lab3Part2c.txt");
        try
        {
            inputFile = new Scanner(inFile);
            System.out.println("File Found");
            System.out.println("");
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Input File SNP7265Lab3Part2c.txt not found");  
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
           
         
            
            robotName[ri] = tempRName;
            robotYear[ri] = tempRYear;
            robotKind[ri] = tempRKind;
            robotSource[ri] = tempRSource;
            robotCost[ri] = tempRCost;
            robotTitle[ri] = tempRTitle;
            
            
            ri++;
            
            System.out.println("NAME: "+tempRName);
            System.out.println("YEAR: "+tempRYear);
            System.out.println("KIND: "+tempRKind);
            System.out.println("SOURCE: "+tempRSource);
            System.out.println("COST: "+tempRCost);
            System.out.println("TITLE:"+tempRTitle);
            System.out.println("");
            
        }
        System.out.println("");
        
        for (ri = 0; ri < robotYear.length; ri++)
            if (robotYear[ri] != 0)
            {
            
            System.out.println("The Robot "+robotName[ri]+" debuted in the year " +robotYear[ri]+ " for " +robotKind[ri]+ " in " +robotSource[ri]+ " at a cost of " + robotCost[ri] + " with title " +robotTitle[ri]);
            }
        
            
             
        
    }
    
    
}
