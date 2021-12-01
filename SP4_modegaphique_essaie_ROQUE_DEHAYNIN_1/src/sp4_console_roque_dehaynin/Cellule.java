/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roque_dehaynin;


/**
 *
 * @author daphn
 */
public class Cellule { //on crée nos attributs
    Jeton jetonCourant;
    boolean trouNoir;
    boolean Desintegrateur;
    
    public Cellule(){ //initialise nos cellule en vide
        jetonCourant=null;
    }
    
    public boolean affecterJeton(Jeton n){ //ajoute le jeton en paramètre à la cellule
        if (jetonCourant==null){
            jetonCourant=n;
            return true;
       
        }
        else {
            return false;
        }    
    }
    
   public String lireCouleurDuJeton (){//renvoie la couleur du jeton occupant la cellule, ou
        //renvoie le mot « vide » si aucun jeton n’est présent
       if (jetonCourant==null){
           return "vide";
       }
       else {
           return jetonCourant.Couleur;
       }
   }
   
   public Jeton recupererJetons(){ //renvoie une référence vers le jeton de la cellule
       return jetonCourant;
   }
   
   boolean supprimerJeton(){ //on supprime le jeton et renvoie vrai si ca c'est bien passé
       if (jetonCourant!=null){
           jetonCourant = null;
           return true;
       }
       else {
           return false;
       }
   }
   
   public boolean placerTrouNoir(){//ajoute un trou noir à l’endroit indiqué et retourne vrai si
//l’ajout s’est bien passé
       if (trouNoir==false){  //je regarde si 
           trouNoir= true;
           return trouNoir;
       }
       else{
           return false;
       }
      
   }
   
   public boolean placerDesintegrateurs(){ // ajoute un désintégrateur à l’endroit indiqué 
       if (Desintegrateur==false){
           Desintegrateur=true;
           return Desintegrateur;
       }
       else{
           return false;
       }
   }
   
   public boolean presenceTrouNoir(){// on regarde s'il y a un trou noir dans la cellule
       if (trouNoir==true){
           return true;
       }
       else{
           return false;
       } 
   }
   
   public boolean presenceDesintegrateur(){//renvoie vrai si un désintégrateur est présent sur la
//cellule
       if (Desintegrateur==true){
           return true;
       }
       else{
           return false;
       }
   }
   
   public boolean recupererDesintegrateur(){//supprime le désintégrateur présent de la cellule
       if (presenceDesintegrateur()==true){
           jetonCourant = null;
           return true;
       }
       else{
           return false;
       }
           
       }
   
   public boolean activerTrouNoir(){// le jeton disparait a cause du trou noir
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



       


           

   

