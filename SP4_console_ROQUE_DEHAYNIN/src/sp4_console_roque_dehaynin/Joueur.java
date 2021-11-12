/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roque_dehaynin;
import java.util.Random;

/**
 *
 * @author daphn
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton [] ListeJetons;
    int nombreJetonsRestants ; 
    
    public void Joueur(String c){
        Nom=c;
    }
        
    
    public void affecterCouleur(String coul){
       Couleur=coul;
        
    }
 
   public void  ajouterJeton(Jeton pion){
       ListeJetons = new Jeton[1];
       ListeJetons[ListeJetons.length - 1] = pion; 
   }
   
   }
  

     
             

        

