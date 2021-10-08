/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_roque_dehaynin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jade
 */
public class TP1_stats_ROQUE_DEHAYNIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] tableauInt;
        int m,j,i,n; 
        Scanner sc;
        sc = new Scanner (System.in); 

      //      
        tableauInt = new double [6]; 
        for(j=0 ; j<6; j++){ 
            tableauInt[j]=0; 
        }
       
      System.out.println("Choisissez un entier "); 
        m = sc.nextInt(); 
        
       
        for( i=1 ; i<=m; i++){ 
       
            Random aleatoire = new Random(); 
            n= aleatoire.nextInt(6);
           
            if (n==0) { 
            tableauInt[0]=tableauInt[0]+1;          
            }
            if (n==1) { 
            tableauInt[1]=tableauInt[1]+1;          
            }
            if (n==2) { 
            tableauInt[2]=tableauInt[2]+1;          
            }
            if (n==3) { 
            tableauInt[3]=tableauInt[3]+1;          
            }
            if (n==4) { 
            tableauInt[4]=tableauInt[4]+1;          
            }
            if (n==5) { 
            tableauInt[5]=tableauInt[5]+1;          
            }
           
           
            for (j=0; j<6; j++){ 
               
                 System.out.println(tableauInt[j]);
        }
            for (j=0; j<6; j++){ 
               
                 System.out.println(((tableauInt[j]*1.0)/m)*100+"%");
        }
           
       }
    }
    
}
