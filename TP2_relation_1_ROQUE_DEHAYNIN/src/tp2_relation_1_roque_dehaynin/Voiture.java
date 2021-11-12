/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_roque_dehaynin;

/**
 *
 * @author Jade
 */
public class Voiture {
    String Modele;
    
    String Marque;
    
    int PuissanceCV;
    
    
    
    public Voiture (String UnModele, String UneMarque, int UnePuissance){
        Modele = UnModele;
        
        Marque = UneMarque;
        
        PuissanceCV = UnePuissance;
        
        
    }
     @Override
    public String toString() {
    return Modele+" de la marque "+Marque+" de puissance "+PuissanceCV;
    }
    
}
