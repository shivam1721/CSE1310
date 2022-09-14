/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab3part3d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author shivampatel
 */
public class SNP7265Lab3Part3d {

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
        String NAME;
        String YEAR;
        String CATEGORY;
        String SOURCE;
        String COST;
        String TITLE;
        String tempCostValue;
                
        String[] robotName = new String[MAXROBOTS];
        int[] robotYear = new int[MAXROBOTS];
        String[] robotKind = new String[MAXROBOTS];
        char[] robotSource = new char[MAXROBOTS];
        String[] robotCost = new String[MAXROBOTS];
        String[] robotTitle = new String[MAXROBOTS];
        double[] robotCostValue = new double[MAXROBOTS];
        
        
        
        
        Scanner inputFile;
        File inFile = new File("SNP7265Lab3Part3d.txt");
        try
        {
            inputFile = new Scanner(inFile);
            System.out.println("File Found");
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Input File SNP7265Lab3Part3d.txt not found");  
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
        
        System.out.printf("\n%-36sTable of Robot Info","");
        System.out.printf("\n%16s%6s%10s%13s %20s     %-36s\n","NAME","YEAR","COST","SOURCE","CATEGORY","TITLE");
        
        
        
    robotTable(robotName,robotYear,robotCost,robotSource,robotKind,robotTitle);
    
        System.out.println("");
    
    for (ri = 1; ri < robotYear.length; ri++)
            if (robotYear[ri] != 0)
            {
                tempRCost = robotCost[ri].substring(0,robotCost[ri].length()-1);
            robotCostValue[ri] = (Double.parseDouble(tempRCost));
            
            tempCostValue = robotCost[ri].substring(robotCost[ri].length()-1,robotCost[ri].length());
                   
            if(tempCostValue.equalsIgnoreCase("K")) 
            {
                robotCostValue[ri] = robotCostValue[ri]*1000;
            }
            else
            {
                robotCostValue[ri] = robotCostValue[ri]*1000000;
            }
            
            System.out.println(robotKind[ri].substring(0,1).toUpperCase()+robotKind[ri].substring(1)+" robot "+ri+" : "
                   +robotName[ri]+" debuted "+robotYear[ri]+" in the "
                    +(robotSource[ri] == 'R'? "real life from ":
                     (robotSource[ri] == 'M'? "movie":
                     (robotSource[ri] == 'B'? "book":        
                     (robotSource[ri] == 'P'? "play":"the TV show"))))
                    +(robotSource[ri] == 'R'? robotTitle[ri]:
                            robotSource[ri] == 'B'? " \""+robotTitle[ri]+"\"": " \""+robotTitle[ri]+"\"" )
                    + " at a cost of $"+robotCostValue[ri]);
                    
                            
            }
        
        System.out.printf("\n%-36sTable of Robot Info","");
    System.out.printf("\n%16s%10s%15s%15s %20s     %-36s\n","NAME","YEAR","COST","SOURCE","CATEGORY","TITLE");
        
    
        
    
    bubbleSort(robotName,robotYear,robotCostValue,robotSource,robotKind,robotTitle);
    for (int i = 0; i< robotYear.length; i++)
        if(robotYear[i] != 0)
        {
            System.out.printf("%16s%10d%15s%12c %23s     %-36s\n",
                        robotName[i],robotYear[i],"$"+robotCostValue[i],robotSource[i],robotKind[i],robotTitle[i]);
            
            
        }
        
             
    
    
    
    
            
            
    }
    
    public static void robotTable(String[] robotName , int[] robotYear, String[] robotCost, char[] robotSource, String[] robotKind, String[] robotTitle )
            
    {
        for (int ri = 0; ri < robotYear.length; ri++)
            if (robotYear[ri] != 0)
            {
                System.out.printf("%16s%6d%10s%10c %23s     %-36s\n",
                        robotName[ri],robotYear[ri],robotCost[ri],robotSource[ri],robotKind[ri],robotTitle[ri]);
            
                }
        
    }
    
    public static void bubbleSort(String[] robotName , int[] robotYear, double[] robotCostValue, char[] robotSource, String[] robotKind, String[] robotTitle )
    {
        int tmp = -1; 
        int tp = -1;
        double temp;
        String tmpNm = " ";
        char tmpTyp = ' ';
    
        for(int i = 0; i < robotYear.length-1; i++)     
            for(int j = 0; j < robotYear.length-1; j++)
            {    
              if((robotCostValue[j]!=0) && (robotCostValue[j+1]!=0))
                if ((robotCostValue[j] > robotCostValue[j+1]))
                {
                    temp = robotCostValue[j];
                    robotCostValue[j] = robotCostValue[j+1];
                    robotCostValue[j+1] = temp;
                
                    tmp = robotYear[j];
                    robotYear[j] = robotYear[j+1];
                    robotYear[j+1] = tmp;
                
                    tmpNm = robotName[j];
                    robotName[j] = robotName[j+1];
                    robotName[j+1] = tmpNm;
                
                    tmpNm = robotKind[j];
                    robotKind[j] = robotKind[j+1];
                    robotKind[j+1] = tmpNm;
                
                    tmpTyp = robotSource[j];
                    robotSource[j] = robotSource[j+1];
                    robotSource[j+1] = tmpTyp;
                
                    tmpNm = robotTitle[j];
                    robotTitle[j] = robotTitle[j+1];
                    robotTitle[j+1] = tmpNm;
                
                    
                }
            }  
            
                
                
            
        
            
        
            
    }
    
    
}
    
    
    

