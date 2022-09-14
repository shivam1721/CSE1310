/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab3part3a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author shivampatel
 */
public class SNP7265Lab3Part3a {

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
        int ri = 1;
        
        String[] robotName = new String[MAXROBOTS];
        int[] robotYear = new int[MAXROBOTS];
        String[] robotKind = new String[MAXROBOTS];
        char[] robotSource = new char[MAXROBOTS];
        String[] robotCost = new String[MAXROBOTS];
        String[] robotTitle = new String[MAXROBOTS];
        
        
        
        Scanner inputFile;
        File inFile = new File("SNP7265Lab3Part3a.txt");
        try
        {
            inputFile = new Scanner(inFile);
            System.out.println("File Found");
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Input File SNP7265Lab3Part3a.txt");  
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
            robotTitle[ri] = tempRTitle.trim();
            
            
            ri++;
        }
        System.out.println("");
        
        for (ri = 1; ri < robotYear.length; ri++)
            if (robotYear[ri] != 0)
            {
                System.out.println(robotKind[ri].substring(0,1).toUpperCase()+robotKind[ri].substring(1)+" robot "+ri+" : "
                   +robotName[ri]+" debuted "+robotYear[ri]+" in the "
                    +(robotSource[ri] == 'R'? "real life from ":
                     (robotSource[ri] == 'M'? "movie":
                     (robotSource[ri] == 'B'? "book":        
                     (robotSource[ri] == 'P'? "play":"the TV show"))))
                    +(robotSource[ri] == 'R'? robotTitle[ri]:
                            robotSource[ri] == 'B'? " \""+robotTitle[ri]+"\"": " \""+robotTitle[ri]+"\"" )
                    + " at a cost of "+robotCost[ri]);
            
            }
            
            
    }
    
}
