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
    boolean trouNoir;
    boolean Desintegrateur;
    
    public Cellule(){
        jetonCourant=null;
    }
    
    public boolean affecterJeton(Jeton n){
        if (jetonCourant==null){
            jetonCourant=n;
            return true 
       
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
   
   public Jeton recupererJetons(){
       return jetonCourant;
   }
   
   boolean supprimerJeton(){
       if (jetonCourant!=null){
           jetonCourant = null;
           return true;
       }
       else {
           return false;
       }
   }
   
   public boolean placerTrouNoir(){
       if (trouNoir==false){  //je regarde si 
           trouNoir= true;
           return trouNoir;
       }
       else{
           return false;
       }
      
   }
   
   public boolean placerDesintegrateurs(){
       if (Desintegrateur==false){
           Desintegrateur=true;
           return Desintegrateur;
       }
       else{
           return false;
       }
   }
   
   public boolean presenceTrouNoir(){
       if (trouNoir==true){
           return true;
       }
       else{
           return false;
       } 
   }
   
   public boolean presenceDesintegrateur(){
       if (Desintegrateur==true){
           return true;
       }
       else{
           return false;
       }
   }
   
   public boolean recupererDesintegrateur(){
       if (presenceDesintegrateur()==true){
           jetonCourant = null;
           return true;
       }
       else{
           return false;
       }
           
       }
   
   public boolean activerTrouNoir(){
       if (presenceTrouNoir()==true){
           supprimerJeton();
           trouNoir= false;
           return true; 
       }
       else{
           return false;
       }
   }
}



       


           

   

