/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab4part1c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author shivampatel
 */
public class SNP7265Lab4Part1c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        final int MAXROBOTS = 30;
        String tempRName = "";
        int tempRYear = 0;
        String tempRKind = "";
        char tempRSource = ' ';
        String tempRCost = "";
        String tempRTitle = "";
        String tempNTitle = "";
        String tempYrSt = "";
        int sortBy = 0;
        int ri = 0;
        
        String NAME;
        String YEAR;
        String CATEGORY;
        String SOURCE;
        String COST;
        String TITLE;
        String tempCostValue;
        
                
        String[][] robotSvalues = new String[MAXROBOTS][7];
        int[][] robotIvalues = new int[MAXROBOTS][2];
        char[][] robotCvalues = new char[MAXROBOTS][2];
        double[][] robotDvalue = new double[MAXROBOTS][4];
        
        
        String fileName = "SNP7265Lab4Part1c";
        File nameFile = new File((fileName+".txt"));
        Scanner inputFile;
        
        PrintWriter outFile = new PrintWriter(System.out);
        
        try
        {
            inputFile = new Scanner(nameFile);
            System.out.println("File Found");
            outFile = new PrintWriter((fileName+".out"));
            System.out.println("Output data file is "+fileName+".out ");
            System.out.println("");
        }
        catch (FileNotFoundException fnfe)
        {
            inputFile = new Scanner(System.in);
            System.out.println("Input File SNP7265Lab4Part1c.txt not found or output file not found ");  
            
        }
        boolean inputValid;
        
         
        while (inputFile.hasNext())
        {
            
            
            inputValid = true;
            
            tempRName = inputFile.next();
            
            try
            {
                tempRYear = inputFile.nextInt();
            
            }
            catch (InputMismatchException ime)
            {
                tempRYear = -1;
                tempYrSt = inputFile.next();
                System.out.println("Input year value "+tempYrSt+" was not valid "+ime);  
                inputValid = false;
            
            }

            catch (NoSuchElementException nsee)
            {
                System.out.println(" Missing Input data "+nsee);
                inputValid = false;
            }
            
            
            tempRKind = inputFile.next();
            tempRSource = (inputFile.next()).charAt(0);
            tempRCost = inputFile.next();
            
            robotSvalues[ri][0] = tempRName;
            robotSvalues[ri][1] = tempRKind;
            robotSvalues[ri][3] = tempRCost;
            robotCvalues[ri][0] = tempRSource;
            
            tempRTitle = inputFile.nextLine();
            tempNTitle = tempRTitle;
            robotSvalues[ri][6] = tempRTitle.trim();
            robotSvalues[ri][5] = tempRTitle;
           
            
            if(inputValid)
            {
                robotIvalues[ri][0] = tempRYear;
                
                if (robotIvalues[ri][0] != 0)
                {
                    tempRCost = robotSvalues[ri][3].substring(0,robotSvalues[ri][3].length()-1);
                    try
                    {
                    robotDvalue[ri][0] = (Double.parseDouble(tempRCost));
                    }
                    catch(NumberFormatException nfe)
                    {
                        inputValid = false;
                        System.out.println("tempRCost value invalid");
                        System.out.println("");
                    }
                    robotDvalue[ri][3] = robotDvalue[ri][0];
            
                tempCostValue = robotSvalues[ri][3].substring(robotSvalues[ri][3].length()-1,robotSvalues[ri][3].length());
                   
                if(tempCostValue.equalsIgnoreCase("K")) 
                {
                    robotDvalue[ri][0] = robotDvalue[ri][0]*1000;
                }
                else
                {
                    robotDvalue[ri][0] = robotDvalue[ri][0]*1000000;
                }
            
        
                }   
            
                
            }   
            
            if (inputValid)
            {
           
            Scanner inTitle = new Scanner(tempNTitle);
            String[] titleWds = tempNTitle.split(", ");
           
            int loc=0;
            for(loc = 0; loc < 4; loc++) {
               switch(loc) {
                   case 0: //title
                       robotSvalues[ri][2] = titleWds[loc];
                       break;
                   case 1: //height
                       robotDvalue[ri][1] = Double.parseDouble(titleWds[loc]);
                       break;
                   case 2: //weight
                       robotDvalue[ri][2] = Double.parseDouble(titleWds[loc]);
                       break;
                   case 3: //implement
                       robotCvalues[ri][1] = titleWds[loc].charAt(0);
                       if(robotCvalues[ri][1] == 'A') {
                           
                           robotSvalues[ri][4] = titleWds[loc + 1];
                        }
                       else
                           robotSvalues[ri][4] = "";
                       break;
                       }
                   }
            ri++;
        }
            
        }
        
        System.out.println("Printing robot Data ");
        System.out.println("");
        outFile.println(" Printing robot Data ");
        outFile.println("");
    
        
        for (ri = 0; ri < robotIvalues.length; ri++)
            if (robotIvalues[ri][0] != 0)
            {
                System.out.println(robotSvalues[ri][1].substring(0,1).toUpperCase()+robotSvalues[ri][1].substring(1)+" robot "+ri+" : "
                   +robotSvalues[ri][0]+" debuted "+robotIvalues[ri][0]+" in the "
                    +(robotCvalues[ri][0] == 'R'? "real life from ":
                     (robotCvalues[ri][0] == 'M'? "movie":
                     (robotCvalues[ri][0] == 'B'? "book":        
                     (robotCvalues[ri][0] == 'P'? "play":"the TV show"))))
                    +(robotCvalues[ri][0] == 'R'? robotSvalues[ri][5]:
                            robotCvalues[ri][0] == 'B'? " \""+robotSvalues[ri][6]+"\"": " \""+robotSvalues[ri][6]+"\"" )
                    + " at a cost of "+robotSvalues[ri][3]);
                    
                outFile.println(robotSvalues[ri][1].substring(0,1).toUpperCase()+robotSvalues[ri][1].substring(1)+" robot "+ri+" : "
                   +robotSvalues[ri][0]+" debuted "+robotIvalues[ri][0]+" in the "
                    +(robotCvalues[ri][0] == 'R'? "real life from ":
                     (robotCvalues[ri][0] == 'M'? "movie":
                     (robotCvalues[ri][0] == 'B'? "book":        
                     (robotCvalues[ri][0] == 'P'? "play":"the TV show"))))
                    +(robotCvalues[ri][0] == 'R'? robotSvalues[ri][5]:
                            robotCvalues[ri][0] == 'B'? " \""+robotSvalues[ri][6]+"\"": " \""+robotSvalues[ri][6]+"\"" )
                    + " at a cost of "+robotSvalues[ri][3]);
            }
                            
            
        
        
        System.out.printf("\n%-36sTable of Robot Info","");
        outFile.printf("\n%-36sTable of Robot Info","");
        
        
        System.out.printf("\n%16s%6s%10s%13s %20s     %-36s\n","NAME","YEAR","COST","SOURCE","CATEGORY","TITLE");
        outFile.printf("\n%16s%6s%10s%13s %20s     %-36s\n","NAME","YEAR","COST","SOURCE","CATEGORY","TITLE");
        
        
        
    robotTable(robotSvalues, robotIvalues, robotCvalues, outFile, robotDvalue);
    
        System.out.println("");
        outFile.println("");
        
        System.out.println("Printing as Sentences with cost multplied ");
        System.out.println("");
        outFile.println(" Printing as Sentences with cost multiplied ");
        outFile.println("");
            
        for (ri = 0; ri < robotIvalues.length; ri++)
            if (robotIvalues[ri][0] != 0)
            {
            
                
            
            System.out.println(robotSvalues[ri][1].substring(0,1).toUpperCase()+robotSvalues[ri][1].substring(1)+" robot "+ri+" : "
                   +robotSvalues[ri][0]+" debuted "+robotIvalues[ri][0]+" in the "
                    +(robotCvalues[ri][0] == 'R'? "real life from ":
                     (robotCvalues[ri][0] == 'M'? "movie":
                     (robotCvalues[ri][0] == 'B'? "book":        
                     (robotCvalues[ri][0] == 'P'? "play":"the TV show"))))
                    +(robotCvalues[ri][0] == 'R'? robotSvalues[ri][2]:
                            robotCvalues[ri][0] == 'B'? " \""+robotSvalues[ri][6]+"\"": " \""+robotSvalues[ri][6]+"\"" )
                    + " at a cost of $"+robotDvalue[ri][0]);
                    
            outFile.println(robotSvalues[ri][1].substring(0,1).toUpperCase()+robotSvalues[ri][1].substring(1)+" robot "+ri+" : "
                   +robotSvalues[ri][0]+" debuted "+robotIvalues[ri][0]+" in the "
                    +(robotCvalues[ri][0] == 'R'? "real life from ":
                     (robotCvalues[ri][0] == 'M'? "movie":
                     (robotCvalues[ri][0] == 'B'? "book":        
                     (robotCvalues[ri][0] == 'P'? "play":"the TV show"))))
                    +(robotCvalues[ri][0] == 'R'? robotSvalues[ri][2]:
                            robotCvalues[ri][0] == 'B'? " \""+robotSvalues[ri][6]+"\"": " \""+robotSvalues[ri][6]+"\"" )
                    + " at a cost of $"+robotDvalue[ri][0]);
            }
        
        System.out.printf("\n%-36sTable of Robot Info as per cost","");
        outFile.printf("\n%-36sTable of Robot Info as per cost","");
        
        System.out.printf("\n%16s%6s%14s%14s %20s     %-35s\n","NAME","YEAR","COST","SOURCE","CATEGORY","TITLE");
        outFile.printf("\n%16s%6s%14s%14s %20s     %-35s\n","NAME","YEAR","COST","SOURCE","CATEGORY","TITLE");
        
    bubbleSort(robotSvalues,robotIvalues,robotDvalue,robotCvalues,outFile,sortBy);
    for (int i = 0; i< robotIvalues.length; i++)
        if(robotIvalues[i][0] != 0)
        {
            System.out.printf("%16s%6d%15.1f%10c %23s     %-36s\n",
                        robotSvalues[i][0],robotIvalues[i][0],robotDvalue[i][0],robotCvalues[i][0],robotSvalues[i][1],robotSvalues[i][6]);
            outFile.printf("%16s%6d%15.1f%10c %23s     %-36s\n",
                        robotSvalues[i][0],robotIvalues[i][0],robotDvalue[i][0],robotCvalues[i][0],robotSvalues[i][1],robotSvalues[i][6]);
            }    
       
        System.out.println("");
        outFile.println("");
           
    
        System.out.println("Printing from 2D array");
        System.out.println("");
        outFile.println("Printing from 2D array");
        outFile.println("");
        
    
    for (ri = 0; ri< robotIvalues.length; ri++)
        if(robotIvalues[ri][0] != 0)
        {
            System.out.println(" The Robot "+robotSvalues[ri][0]+" debuted in the year "+robotIvalues[ri][0]+" as "+robotSvalues[ri][1]+" robot in "+robotCvalues[ri][0]+
            " with cost of "+robotSvalues[ri][3]+"\". The  Height, Weight, Implementation and (actor) are "+robotSvalues[ri][6]);
            outFile.println(" The Robot "+robotSvalues[ri][0]+" debuted in the year "+robotIvalues[ri][0]+" as "+robotSvalues[ri][1]+" robot in "+robotCvalues[ri][0]+
            " with cost of "+robotSvalues[ri][3]+"\". The  Height, Weight, Implementation and (actor) are "+robotSvalues[ri][6]);
            }
        
        System.out.printf("\n%-36sTable of Robot Info with Double Column","");
        outFile.printf("\n%-36sTable of Robot Info with Double Column","");
        
        System.out.printf("\n%16s%6s%10s%13s %20s     %63s   %-75s\n","NAME","YEAR","COST","SOURCE","CATEGORY","TITLE","DOUBLE");
        outFile.printf("\n%16s%6s%10s%13s %20s     %63s   %-75s\n","NAME","YEAR","COST","SOURCE","CATEGORY","TITLE","DOUBLE");
       
            
            for ( ri = 0; ri < MAXROBOTS; ri++)
            if (robotIvalues[ri][0] != 0)
            {
                System.out.printf("%16s%6d%10s%10c %23s     %63s   %-75.1f\n",
                        robotSvalues[ri][0],robotIvalues[ri][0],robotSvalues[ri][3],robotCvalues[ri][0],robotSvalues[ri][1],
                        robotSvalues[ri][6],robotDvalue[ri][3]);
            outFile.printf("%16s%6d%10s%10c %23s     %63s   %-75.1f\n",
                        robotSvalues[ri][0],robotIvalues[ri][0],robotSvalues[ri][3],robotCvalues[ri][0],robotSvalues[ri][1],
                        robotSvalues[ri][6],robotDvalue[ri][3]);
            }
            
        System.out.println("");
        outFile.println("");
        
       
        
    outFile.close();
            
    }
    
    public static void robotTable(String[][] robotSvalues , int[][] robotIvalues, char[][] robotCvalues, PrintWriter outFile, double[][] robotDvalue )
            
    {
        for (int ri = 0; ri < robotIvalues.length; ri++)
            if (robotIvalues[ri][0] != 0)
            {
                System.out.printf("%16s%6d%10s%10c %23s     %-36s\n",
                        robotSvalues[ri][0],robotIvalues[ri][0],robotSvalues[ri][3],robotCvalues[ri][0],robotSvalues[ri][1],robotSvalues[ri][6]);
                outFile.printf("%16s%6d%10s%10c %23s     %-36s\n",
                        robotSvalues[ri][0],robotIvalues[ri][0],robotSvalues[ri][3],robotCvalues[ri][0],robotSvalues[ri][1],robotSvalues[ri][6]);
            
            
                }
        
    }
    
   
    
    public static void bubbleSort(String[][] robotSvalues , int[][] robotIvalues, double[][] robotDvalue, char[][] robotCvalues, PrintWriter outFile, int sortBy)
    {
         int[] tmp; 
        
        double[] temp;
        String[] tmpNm;
        char[] tmpTyp;
    
        for(int i = 0; i < robotIvalues.length-1; i++) 
        {
            for(int j = 0; j < robotIvalues.length-1; j++)
            {    
              if((robotDvalue[j][sortBy]!=0) && (robotDvalue[j+1][sortBy]!=0))
                if ((robotDvalue[j][sortBy] > robotDvalue[j+1][sortBy]))
                {
                    temp = robotDvalue[j+1];
                    robotDvalue[j+1] = robotDvalue[j];
                    robotDvalue[j] = temp;
                
                    tmp = robotIvalues[j+1];
                    robotIvalues[j+1] = robotIvalues[j];
                    robotIvalues[j] = tmp;
                    
                    tmpNm = robotSvalues[j+1];
                    robotSvalues[j+1] = robotSvalues[j];
                    robotSvalues[j] = tmpNm;
                    
                    tmpTyp = robotCvalues[j+1];
                    robotCvalues[j+1] = robotCvalues[j];
                    robotCvalues[j] = tmpTyp;
                
                    }
            }
        }
    
    }
    
    
    

    

    
    
}


