

/*package 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_roque_dehaynin;
import java.util.Scanner;
/**
 *
 * @author Jade
 */


public class Convertisseur {
    int nbConversions;
     public Convertisseur () {
           int nbConversions = 0 ;
}
@Override
public String toString () {
  return "nb de conversions"+ nbConversions;
}
      
   public double CelciusVersKelvin ( double tempCelcius ) { 
     double tempKelvin; 
    tempKelvin = (double) (tempCelcius +273.15) ;
    nbConversions+=1;
    
    
        return tempKelvin;
   }
  
   public  double KelvinVersCelcius ( double tempKelvin ) { 
     
        double tempCelcius;
        
    tempCelcius = (double) (tempKelvin - 273.15) ; 
    nbConversions+=1;
        return tempCelcius;
   }
   
   public double CelciusVersFarenheit ( double tempCelcius) { 
     double tempFarenheit; 
    tempFarenheit = (double) (tempCelcius * (9.0/5)+ 32) ; 
    nbConversions+=1;
        return tempFarenheit;
   }
   
   public double FarenheitVersCelcius ( double tempFarenheit) { 
     double tempCelcius; 
    tempCelcius = (double) ((tempFarenheit-32) * (5.0/9)) ;
    nbConversions+=1;
        return tempCelcius;
   }
   
   public double KelvinVersFarenheit ( double tempKelvin ) {
     
        double tempFarenheit;
        
    tempFarenheit = (double) ((tempKelvin - 273.15)*9.0/5+32) ;
    nbConversions+=1;
        return tempFarenheit;
   }
   
   public  double FarenheitVersKelvin ( double tempFarenheit) {
     double tempKelvin; 
    tempKelvin = (double) ((tempFarenheit-32) * (5.0/9)+273.15 ) ;
    nbConversions+=1;
        return tempKelvin;
   }
   
}

    


