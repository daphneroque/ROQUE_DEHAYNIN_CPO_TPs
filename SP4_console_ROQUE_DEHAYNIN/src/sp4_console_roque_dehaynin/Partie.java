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
    
    public void attribuerCouleursAuxJouers(){
        
        
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
  public void initialiserPartie(){
    //Création de la grille
    Grille grille= new Grille();
    grille.viderGrille();
    int nbTN=0;
    while (nbTN<=5){
        int ligne=(int)(Math.random() * 6);
        int colone=(int)(Math.random() * 7);
        if (grille.CellulesJeu[ligne][colone]==null){
            if (nbTN==4 || nbTN==5){
                grille.placerTrouNoir(ligne,colone);
                grille.placerDesintegrateur(ligne,colone);
            }else{
                grille.placerTrouNoir(ligne,colone);
            }
            nbTN+=1;
        }else{
                nbTN=nbTN;
                }
    }   
    int nbDesint=0;
    while (nbDesint<=3){
        int ligne=(int)(Math.random() * 6);
        int colone=(int)(Math.random() * 7);
        if (grille.CellulesJeu[ligne][colone]==null){
            grille.placerDesintegrateur(ligne,colone);
            nbDesint+=1;
        }else{
                nbDesint=nbDesint;
                }
    }    
    for (int i=0;i<24;i++){
        if (ListeJoueurs[0].Couleur.equals("rouge")){
            Jeton jetonjoueurR = new Jeton("rouge");
            ListeJoueurs[0].ajouterJeton(jetonjoueurR);
            Jeton jetonjoueurJ = new Jeton("jaune");
            ListeJoueurs[1].ajouterJeton(jetonjoueurJ);
        }else{
            Jeton jetonjoueurR = new Jeton("rouge");
            ListeJoueurs[1].ajouterJeton(jetonjoueurR);
            Jeton jetonjoueurJ = new Jeton("jaune");
            ListeJoueurs[0].ajouterJeton(jetonjoueurJ);
        }
    }
    
}
public void debuterPartie(){
    //inscription des 2 joueurs:
    Scanner sca = new Scanner(System.in);
    System.out.println("Entrez le nom du premier joueur");
    String Joueur1=sca.next();
    System.out.println("Entrez le nom du second joueur");
    String Joueur2=sca.next();
    Joueur J1 = new Joueur(Joueur1);
    Joueur J2 = new Joueur(Joueur2);
    ListeJoueurs[0]=J1;
    ListeJoueurs[0]=J2;
    
    //détermination du 1er joueur:
    double nbalea=Math.random();
    if (nbalea>0.5) {
        joueurCourant= ListeJoueurs[0];
    }
    else{
        joueurCourant= ListeJoueurs[1];
    }
    
    //Distribution des couleurs:
    attribuerCouleursAuxJouers();

    initialiserPartie();
    while((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])!=true) && (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])!=true) && (grilleJeu.etreRemplie()!=true)){
        //afficher la grille
        grilleJeu.afficherGrilleSurConsole();
        
        //demander au joueur ce qu'il veut faire
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez-vous faire: /n1)Placer un jeton /n2)Récupérer un jeton /n3)Utiliser un désintégrateur");
        int saisie = sc.nextInt();
        while (saisie>3 || saisie<=0){
                System.out.println("ERREUR: Veuillez ressaisir un choix compris entre 1 et 3:");
                saisie = sc.nextInt();
        }
        if (saisie==1){
           //placer un jeton dans une colonne
            Scanner s = new Scanner(System.in);
            System.out.println("Sélectionnez un numéro de colone:");
            int colonne = s.nextInt()-1;
            while (colonne>6 || colonne<=0){
                System.out.println("ERREUR: Veuillez ressaisir un numéro de colone correct:");
                colonne = s.nextInt()-1;
            }
            while(grilleJeu.colonneRemplie(colonne)==true){
                System.out.println("ERREUR: La colonne est remplie, veuillez en choisir une autre:");
                colonne = s.nextInt()-1;   
            }
            grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1], colonne); 
            joueurCourant.nombreJetonsRestants-=1;
        }
        
        
        if (saisie==2){
            //récupérer un jeton de la grille de jeu
            Scanner s = new Scanner(System.in);
            System.out.println("Sélectionnez les coordonnéesdu jeton:");
            System.out.println("Sélectionnez un numéro de ligne:");
            int ligne = sca.nextInt()-1;
            while (ligne>5 || ligne<=0){
                System.out.println("ERREUR: Veuillez ressaisir un numéro de ligne correct:");
                ligne = sca.nextInt()-1;
            }
            System.out.println("Sélectionnez un numéro de colone:");
            int colonne = sca.nextInt()-1;
            while (colonne>6 || colonne<=0){
                System.out.println("ERREUR: Veuillez ressaisir un numéro de colonne correct:");
                colonne = sca.nextInt()-1;
            }
            joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants]=grilleJeu.recupererJeton(ligne,colonne);
            grilleJeu.tasserGrille(ligne, colonne);
            
        }
        
        if (saisie==3 && (joueurCourant.nombreDesintegrateurs!=0)){
            //utiliser un desintégrateur
            Scanner s = new Scanner(System.in);
            System.out.println("Sélectionnez les coordonnées du jeton:");
            System.out.println("Sélectionnez un numéro de ligne:");
            int ligne = sca.nextInt()-1;
            while (ligne>5 || ligne<=0){
                System.out.println("ERREUR: Veuillez ressaisir un numéro de ligne correct:");
                ligne = sca.nextInt()-1;
            }
            System.out.println("Sélectionnez un numéro de colonne:");
            int colonne = sca.nextInt()-1;
            while (colonne>6 || colonne<=0){
                System.out.println("ERREUR: Veuillez ressaisir un numéro de colonne correct:");
                colonne = sca.nextInt()-1;
            joueurCourant.utiliserDesintegrateur();
            grilleJeu.supprimerJeton(ligne,colonne);
            grilleJeu.tasserGrille(ligne, colonne);
            }
        } else{
            System.out.println("ERREUR: Vous n'avez pas de désintégrateur à utiliser");
            System.out.println("Rechoississez ce que vous voulez faire: /n1)Placer un jeton /n2)Récupérer un jeton");
            saisie = sc.nextInt();
            while (saisie>2 || saisie<=0){
                System.out.println("ERREUR: Veuillez ressaisir un choix compris entre 1 et 2:");
                saisie = sc.nextInt();
        }
        }
        if (joueurCourant==ListeJoueurs[0]){
            joueurCourant=ListeJoueurs[1];
        }
        else{
            joueurCourant=ListeJoueurs[0];
        }

    }
    
}
}
