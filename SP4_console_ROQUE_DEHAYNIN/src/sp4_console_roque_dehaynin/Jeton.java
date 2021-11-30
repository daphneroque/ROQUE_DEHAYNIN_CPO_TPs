/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roque_dehaynin;

/**
 *
 * @author daphn
 */
public class Jeton { //on crée notre attribut couleur
    String Couleur;

    public Jeton(String color) { //constructeur initialisant la couleur du jeton avec le paramètre
    Couleur = color;
    }
    
    public String lireCouleur(){  //renvoie la couleur du jeton
        
        return Couleur;    
    }
}


