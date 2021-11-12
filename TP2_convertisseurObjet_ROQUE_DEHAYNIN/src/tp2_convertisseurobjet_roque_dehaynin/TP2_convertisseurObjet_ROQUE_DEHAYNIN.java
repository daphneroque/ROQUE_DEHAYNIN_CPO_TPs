/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_roque_dehaynin;

import java.util.Scanner;

/**
 *
 * @author Jade
 */
public class TP2_convertisseurObjet_ROQUE_DEHAYNIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur temperature = new Convertisseur (); 
        
        double result=temperature.CelciusVersKelvin(45);
        
       
        System.out.println(result);
        
        double result2=temperature.KelvinVersCelcius(100);
        
        System.out.println(result2);
        
        double result3=temperature.KelvinVersFarenheit(-12);
        
        System.out.println(result3);
        
        System.out.println(temperature);
        
        
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
    
    }
    

