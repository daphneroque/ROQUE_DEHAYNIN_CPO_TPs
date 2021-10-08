/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_roque_dehaynin2;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Jade
 */
public class Convertisseur_ROQUE_DEHAYNIN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double temp1; 
        Scanner sc; 
      sc=new Scanner (System.in); 
        int c;
      
      
      System.out.println("Bonjour,saisissez une valeur ");
      
    temp1 = sc.nextDouble(); 
    System.out.println("Saisissez la conversion que vous souhaiter effectuer ?\n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius\n 3) De Farenheit Vers Celcius \n 4) De Celcius Vers Farenheit\n 5)De Kelvin Vers Farenheit \n 6) De Farenheit vers Kelvin");
    c = sc.nextInt();
    
      switch(c){
              
              case 1 :
      
        
        System.out.println("La température est  "+temp1+"K");
        break;
              case 2:      
        
        temp1 = KelvinVersCelcius(temp1) ; 
        System.out.println("La température est  "+temp1+"°C"); 
        break;
              case 3:
       
        temp1 = CelciusVersFarenheit(temp1) ; 
        System.out.println("La température est  "+temp1+"F"); 
        break;
              case 4:
    
        temp1 = FarenheitVersCelcius(temp1) ; 
        System.out.println("La température est  "+temp1+"°C"); 
        break;
        
              case 5:
        
        temp1 = KelvinVersFarenheit(temp1) ; 
        System.out.println("La température est  "+temp1+"F"); 
        break;
        
              case 6:
     
        temp1 = FarenheitVersKelvin(temp1) ; 
        System.out.println("La température est  "+temp1+"K"); 
        break;
        
        default:
            
    }
    }
    
    
    
        
    
    
    
   public static double CelciusVersKelvin ( double tempCelcius ) { 
     double tempKelvin; 
    tempKelvin = (double) (tempCelcius +273.15) ;
    
        return tempKelvin;
   }
   
  
   
   public static double KelvinVersCelcius ( double tempKelvin ) { 
     
        double tempCelcius;
        
    tempCelcius = (double) (tempKelvin - 273.15) ; 
    
        return tempCelcius;
   }
   
   public static double CelciusVersFarenheit ( double tempCelcius) { 
     double tempFarenheit; 
    tempFarenheit = (double) (tempCelcius * (9.0/5)+ 32) ; 
    
        return tempFarenheit;
   }
   
   public static double FarenheitVersCelcius ( double tempFarenheit) { 
     double tempCelcius; 
    tempCelcius = (double) ((tempFarenheit-32) * (5.0/9)) ;
    
        return tempCelcius;
   }
   
   public static double KelvinVersFarenheit ( double tempKelvin ) {
     
        double tempFarenheit;
        
    tempFarenheit = (double) ((tempKelvin - 273.15)*9.0/5+32) ;
    
        return tempFarenheit;
   }
   
   public static double FarenheitVersKelvin ( double tempFarenheit) {
     double tempKelvin; 
    tempKelvin = (double) ((tempFarenheit-32) * (5.0/9)+273.15 ) ;
    
        return tempKelvin;
   }
   
}
}
    

