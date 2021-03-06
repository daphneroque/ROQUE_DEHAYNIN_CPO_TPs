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

    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;

    public Partie(Joueur j1, Joueur j2) {
        ListeJoueurs[0] = j1;
        ListeJoueurs[1] = j2;

    }

    public void attribuerCouleursAuxJoueurs() {
        double nb = Math.random();
        if (nb > 0.5) {
            ListeJoueurs[0].affecterCouleur("rouge");
            ListeJoueurs[1].affecterCouleur("jaune");
            System.out.println(ListeJoueurs[0].Nom + " a la couleur ROUGE");
            System.out.println(ListeJoueurs[1].Nom + " a la couleur JAUNE");
        } else {
            ListeJoueurs[0].affecterCouleur("jaune");
            ListeJoueurs[1].affecterCouleur("rouge");
            System.out.println(ListeJoueurs[1].Nom + " a la couleur ROUGE");
            System.out.println(ListeJoueurs[0].Nom + " a la couleur JAUNE");
        }

    }

    public void initialiserPartie() {
        //Création de la grilleJeu
        grilleJeu = new Grille();
        grilleJeu.viderGrille();
        int nbTrouNoir = 0;
        while (nbTrouNoir < 5) {
            int ligne = (int) (Math.random() * 6);
            int colonne = (int) (Math.random() * 7);
            if (grilleJeu.CellulesJeu[ligne][colonne].jetonCourant == null
                    && grilleJeu.CellulesJeu[ligne][colonne].trouNoir == false) {
                if (nbTrouNoir == 3 || nbTrouNoir == 4) {
                    grilleJeu.placerTrouNoir(ligne, colonne);
                    grilleJeu.placerDesintegrateur(ligne, colonne);
                } else {
                    grilleJeu.placerTrouNoir(ligne, colonne);
                }
                nbTrouNoir += 1;
            }
        }
        int nbDesint = 0;
        while (nbDesint < 3) {
            int ligne = (int) (Math.random() * 6);
            int colonne = (int) (Math.random() * 7);
            if (grilleJeu.CellulesJeu[ligne][colonne].presenceDesintegrateur() == false) {
                grilleJeu.placerDesintegrateur(ligne, colonne);
                nbDesint += 1;
            }
        }
        // attribuer jetons aux joueurs
        for (int i = 0; i < 21; i++) {
            if (ListeJoueurs[0].Couleur.equals("rouge")) {
                Jeton jetonjoueurRouge = new Jeton("rouge");
                ListeJoueurs[0].ajouterJeton(jetonjoueurRouge);
                Jeton jetonjoueurJaune = new Jeton("jaune");
                ListeJoueurs[1].ajouterJeton(jetonjoueurJaune);
            } else {
                Jeton jetonjoueurRouge = new Jeton("rouge");
                ListeJoueurs[1].ajouterJeton(jetonjoueurRouge);
                Jeton jetonjoueurJaune = new Jeton("jaune");
                ListeJoueurs[0].ajouterJeton(jetonjoueurJaune);
            }
        }

    }

    void changerJoueur() {
        if (joueurCourant == ListeJoueurs[0]) {
            joueurCourant = ListeJoueurs[1];

        } else {
            joueurCourant = ListeJoueurs[0];
        }
    }

    public void debuterPartie() {
        //inscription des 2 joueurs:
        Scanner sca = new Scanner(System.in);
        System.out.println("Entrez le nom du premier joueur ");
        String Joueur1 = sca.next();
        System.out.println("Entrez le nom du second joueur ");
        String Joueur2 = sca.next();
        Joueur J1 = new Joueur(Joueur1);
        Joueur J2 = new Joueur(Joueur2);
        ListeJoueurs[0] = J1;
        ListeJoueurs[1] = J2;

        //détermination du 1er joueur:
        double nb = Math.random();
        if (nb > 0.5) {
            joueurCourant = ListeJoueurs[0];
        } else {
            joueurCourant = ListeJoueurs[1];
        }

        //Distribution des couleurs:
        attribuerCouleursAuxJoueurs();

        initialiserPartie();
        while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) != true) && (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) != true) && (grilleJeu.etreRemplie() != true)) {
            //afficher la grilleJeu
            grilleJeu.afficherGrilleSurConsole();

            //demander au joueur ce qu'il veut faire
            Scanner sc = new Scanner(System.in);
            System.out.println("vous avez " + joueurCourant.nombreDesintegrateurs + "desintegrateurs");
            System.out.println(joueurCourant.Nom + " A vous de jouer ! ");
            System.out.println("Que voulez-vous faire: /1)Placer un jeton /2)Récupérer un jeton /3)Utiliser un désintégrateur");
            int saisie = sc.nextInt();
            while (saisie > 3 || saisie <= 0) {
                System.out.println("ERREUR: Veuillez ressaisir un choix compris entre 1 et 3:");
                saisie = sc.nextInt();
            }
            if (saisie == 1) {
                //placer un jeton dans une colonne
                Scanner s = new Scanner(System.in);

                System.out.println("Sélectionnez un numéro de colone:");
                int colonne = s.nextInt() - 1;
                while (colonne > 7 || colonne < 0) {
                    System.out.println("ERREUR: Veuillez ressaisir un numéro de colone correct:");
                    colonne = s.nextInt() - 1;
                }
                while (grilleJeu.colonneRemplie(colonne) == true) {
                    System.out.println("ERREUR: La colonne est remplie, veuillez en choisir une autre:");
                    colonne = s.nextInt() - 1;
                }

                int i = 0;

                while (grilleJeu.CellulesJeu[i][colonne].jetonCourant != null ) {
                    i++;
                }
                    // if jeton sur trou noir -> supprimer jeton
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1], colonne);
                    joueurCourant.nombreJetonsRestants -= 1;
                 
                if (grilleJeu.CellulesJeu[i][colonne].presenceTrouNoir() == true) {
                    grilleJeu.CellulesJeu[i][colonne].activerTrouNoir();

                

                }
                   changerJoueur();
            }

            if (saisie == 2) {
                //récupérer un jeton de la grilleJeu de jeu
                Scanner s = new Scanner(System.in);
                System.out.println("Sélectionnez les coordonnéesdu jeton:");
                System.out.println("Sélectionnez un numéro de ligne:");
                int ligne = sca.nextInt() - 1;
                while (ligne > 5 || ligne < 0) {
                    System.out.println("ERREUR: Veuillez ressaisir un numéro de ligne correct:");
                    ligne = sca.nextInt() - 1;
                }
                System.out.println("Sélectionnez un numéro de colone:");
                int colonne = sca.nextInt() - 1;
                while (colonne > 6 || colonne < 0) {
                    System.out.println("ERREUR: Veuillez ressaisir un numéro de colonne correct:");
                    colonne = sca.nextInt() - 1;
                }

                // verifier que le jeton appartient bien au joueur
                while (grilleJeu.CellulesJeu[ligne][colonne].lireCouleurDuJeton() != joueurCourant.Couleur) {
                    System.out.println("Erreur, vous n'avez pas selectionné votre jeton");
                    System.out.println("vous avez " + joueurCourant.nombreDesintegrateurs + " desintegrateurs");
                    System.out.println("Que voulez-vous faire: /1)Placer un jeton /2)Récupérer un jeton /3)Utiliser un désintégrateur");
                    saisie = sc.nextInt();
                    while (saisie > 3 || saisie <= 0) {
                        System.out.println("ERREUR: Veuillez ressaisir un choix compris entre 1 et 3:");
                        saisie = sc.nextInt();
                    }

                }

                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = grilleJeu.recupererJeton(ligne, colonne);
                grilleJeu.tasserGrille(ligne, colonne);
                changerJoueur();

            }

            if (saisie == 3 && (joueurCourant.nombreDesintegrateurs != 0)) {
                //utiliser un desintégrateur
                System.out.println("Sélectionnez les coordonnées du jeton:");
                System.out.println("Sélectionnez un numéro de ligne:");
                int ligne = sca.nextInt() - 1;
                while (ligne > 5 || ligne < 0) {
                    System.out.println("ERREUR:  un numéro de ligne incorrect:");
                    ligne = sca.nextInt() - 1;
                }
                System.out.println("Sélectionnez un numéro de colonne:");
                int colonne = sca.nextInt() - 1;
                while (colonne > 6 || colonne < 0) {
                    System.out.println("ERREUR: Veuillez ressaisir un numéro de colonne correct:");
                    colonne = sca.nextInt() - 1;
                }
                joueurCourant.utiliserDesintegrateur();

                // verifier la couleur de la cellule, identique a celle du joueur
                while (grilleJeu.CellulesJeu[ligne][colonne].lireCouleurDuJeton() != joueurCourant.Couleur) {
                    System.out.println("Erreur, la cellule n'est pas de votre couleur");
                }

                grilleJeu.supprimerJeton(ligne, colonne);
                grilleJeu.tasserGrille(ligne, colonne);
                changerJoueur();
            } else if (saisie == 3 && (joueurCourant.nombreDesintegrateurs == 0)) {
                System.out.println("ERREUR: Vous n'avez pas de désintégrateur à utiliser");
            }

        }
        if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true) {
            System.out.println(ListeJoueurs[0].Nom + " a gagné !");
        }
        if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == true) {
            System.out.println(ListeJoueurs[1].Nom + " a gagné!");
        }
        if (grilleJeu.etreRemplie() == true) {
            System.out.println("La grille est pleine,aucun gagnant");
        }

    }
}
