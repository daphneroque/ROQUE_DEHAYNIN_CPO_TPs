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
public class Joueur { //on crée nos attributs dont un tableau de 21 cases

    String Nom ;
    String Couleur;
    Jeton[] ListeJetons = new Jeton[21];
    int nombreJetonsRestants;
    int  nombreDesintegrateurs;

    public Joueur(String c) { // on affecte le nom joueur avec son parametre
        Nom = c;
    }

    public void affecterCouleur(String coul) { //affecter la couleur en parametre au joueur
        Couleur = coul; 

    }

    public boolean ajouterJeton(Jeton pion) { //on ajoute le jeton en parametre a la liste de jeton
        int i = 0;
        while (i < ListeJetons.length) { // on crée une boucle qui permet d'initialiser notre liste jeton
            if (ListeJetons[i] == null) {
                ListeJetons[i] = pion;
                nombreJetonsRestants++;
                return true;
            }
            if (ListeJetons[i] != null) {
                i++;
            }
            if (i == 21) { // il y a max 21 jetons il peut pas en avoir plus 
                return false;

            }

        }
        return true; // cela permets de faire fonctionner notre methode
    }
    
    
    public void obtenirDesintegrateur(){ //incrémente le nombre de désintégrateurs du joueur
        nombreDesintegrateurs = nombreDesintegrateurs +1;
   
    }
    
    public boolean utiliserDesintegrateur(){ // decremente le nombre de desintegrateur 
        if (nombreDesintegrateurs>0){
            nombreDesintegrateurs=nombreDesintegrateurs-1;
            return true;  // confirme l'tulisation du desintegrateur
   
        }
        else {
            return false; // il ne reste plus de desintegrateur a utiliser
        }

    }
    

}
