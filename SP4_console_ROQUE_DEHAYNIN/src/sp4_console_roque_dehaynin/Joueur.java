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
    Jeton [] ListeJetons = new Jeton [21];
    int nombreJetonsRestants ; 
    
    public void Joueur(){
        System.out.println("Nom du joueur : "+ Nom);
    }
    public void affecterCouleur(){
        String [] tab = {"jaune","rouge"};
        Random ran = new Random();
        String tab_ran = tab[ran.nextInt(tab.length)];
    }
            
  
}

