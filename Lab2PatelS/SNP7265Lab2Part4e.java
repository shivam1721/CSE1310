/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp7265lab2part4e;

/** Shivam Patel
 * UTA ID: 1001707265
 * @author shivampatel
 */
public class SNP7265Lab2Part4e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int d;
        int e;
        int dde;
        int deed;
        int dSqu;
        String again = new String();
        String No = new String();
        
        again = "Y";
        
        for (d = 0; d < 10; d++)
        {
            for (e = 0; e < 10; e++)
            {    
                
            
            dde = (int) Math.pow(((d * 10)+d),e);
            deed = (d * 1000)+(e * 100)+(e * 10)+d;
 
            if (dde == deed)
                System.out.println("The values are equal, "+dde);
            
            else
                System.out.println("The value of dde is "+dde+" and the value of deed is "+deed+", are different ");
            }
        }    
        System.out.println("The program is over");    
        

            
     }
}

     
        
    
    

