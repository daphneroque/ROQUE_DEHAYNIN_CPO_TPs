/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_roque_dehaynin;
import java.util.Scanner;
/**
 *
 * @author daphn
 */
public class SP4_console_ROQUE_DEHAYNIN {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jeton j = new Jeton("Rouge");
        System.out.println(j.lireCouleur());
        Cellule c = new Cellule ();
        System.out.println(c.lireCouleurDuJeton());//affiche vide
        c.affecterJeton(j);
        System.out.println(c.lireCouleurDuJeton()); //affiche rouge
        Grille G = new Grille();
          G.ajouterJetonDansColonne(j,5);
        G.afficherGrilleSurConsole();
    }   
}
