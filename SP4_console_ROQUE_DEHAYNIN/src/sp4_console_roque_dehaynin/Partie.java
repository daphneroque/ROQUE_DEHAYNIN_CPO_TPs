/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roque_dehaynin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daphn
 */
public class Partie {
    Joueur[] ListeJoueurs =new Joueur [2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    
    public Partie(Joueur j1, Joueur j2){
        ListeJoueurs[0]=j1;
        ListeJoueurs[1]=j2;
        
    }
    
    public void attribuerCouleursauxJouers(){
        
        
        String [] tab = {"jaune","rouge"}; // affecter un jeton de couleur aléatoirement pour chaque joueur entre jaune et rouge
        Random ran = new Random();
        String tab_ran = tab[ran.nextInt(tab.length)];
        if(tab_ran == "jaune"){
            ListeJoueurs[0].affecterCouleur("jaune");
            ListeJoueurs[1].affecterCouleur("rouge");
               
        }
        else
             ListeJoueurs[0].affecterCouleur("rouge");
            ListeJoueurs[1].affecterCouleur("jaune");

        
        
        
    }
    public void initialiserPartie (){
        grilleJeu = new Grille();
        for(int i =1;i<22;i++){
            Jeton J1 = new Jeton(ListeJoueurs[0].Couleur);
            ListeJoueurs[0].ajouterJeton(J1);
            Jeton J2 = new Jeton(ListeJoueurs[1].Couleur);
            ListeJoueurs[1].ajouterJeton(J2);
            
        }
    }
    public void debuterPartie(){
        joueurCourant=ListeJoueurs[0];
        while(grilleJeu.etreRemplie()==false || grilleJeu.etreGagnantePourJoueur(joueurCourant)==false){
            grilleJeu.afficherGrilleSurConsole();
            
            System.out.println("C'est à vous de jouer, entrez une colonne entre 0 et 6");
            //utiliser scanner pour que l'utilisateur puisse rentrer sa colonne
            // il faudra aller chercher le jeton dans la liste de jetons
            
            
            grilleJeu.ajouterJetonDansColonne(jet, 0);
            
        }
        
    }
    
   
        
    
    
}
