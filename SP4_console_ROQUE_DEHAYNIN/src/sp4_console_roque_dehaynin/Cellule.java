/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roque_dehaynin;


/**
 *
 * @author daphn
 */
public class Cellule {
    Jeton jetonCourant;
    
    public Cellule(){
        jetonCourant=null;
    }
    
    public boolean affecterJeton(Jeton n){
        if (jetonCourant==null){
            jetonCourant=n;
            return true;
       
        }
        else {
            return false;
        }    
    }
    
   public String lireCouleurDuJeton (){
       if (jetonCourant==null){
           return "vide";
       }
       else {
           return jetonCourant.Couleur;
       }
   }
}



       


           

   

