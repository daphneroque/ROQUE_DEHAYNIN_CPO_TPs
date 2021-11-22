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
            Random r = new Random();
            int compteur=0;
            for (int j = 0; j<5 ; j++){
                int ligne_trou_noir = r.nextInt(6);
                int colonne_trou_noir = r.nextInt(7);
                if ( compteur<2){
                    if (grilleJeu.placerDesintegrateur(ligne_trou_noir, colonne_trou_noir)){
                        compteur--;
                    }
                    compteur = compteur + 1;
                }
                if (grilleJeu.placerTrouNoir(ligne_trou_noir, colonne_trou_noir)){
                    j--;      
                }
            
                for (int k=0;i<3; i++){
                    int ligne_desintegrateur = r.nextInt(6);
                    int colonne_desintegrateur = r.nextInt(7);
                    if ( grilleJeu.placerTrouNoir(ligne_desintegrateur, colonne_desintegrateur)){
                        
                        
                        
                        
                    }
                    
                    
                }
            }
            
        }
    }
    public void debuterPartie(){
        joueurCourant=ListeJoueurs[0];
        while(grilleJeu.etreRemplie()==false || grilleJeu.etreGagnantePourJoueur(joueurCourant)==false){
            grilleJeu.afficherGrilleSurConsole();
            
            Scanner sc = new Scanner(System.in);
            System.out.println("C'est à vous de jouer, entrez une colonne entre 0 et 6");
            int saisieUtilisateur = sc.nextInt();
            //utiliser scanner pour que l'utilisateur puisse rentrer sa colonne
            while (saisieUtilisateur>6){
                System.out.println("Erreur ! Votre saisie de colonne n'est pas entre 0 et 6");
            }
            
            
                 While (grilleJeu.etreRemplie()==true){
                
                    System.out.println("Erreur! vous devez saisir un numéro de colonne qui a une grille pas remplie ");
                    saisieUtilisateur = sc.nextInt();
            }

                    Jeton j = joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];
                    joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1]=null;
                    joueurCourant.nombreJetonsRestants--; //j'ai recupere le jeton de ma liste
                    grilleJeu.ajouterJetonDansColonne(j, saisieUtilisateur);
                    System.out.println("Votre jeton a bien été ajouté");
                    
                
                if (joueurCourant==ListeJoueurs[1]){
                    joueurCourant=ListeJoueurs[0];
                    }
                else{
                    joueurCourant=ListeJoueurs[1];
                }    
        }
        
    }

    private void While(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
