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
    Jeton[] ListeJetons = new Jeton[21];
    int nombreJetonsRestants;

    public Joueur(String c) {
        Nom = c;
    }

    public void affecterCouleur(String coul) {
        Couleur = coul;

    }

    public boolean ajouterJeton(Jeton pion) {
        int i = 0;
        while (i < ListeJetons.length) {
            if (ListeJetons[i] == null) {
                ListeJetons[i] = pion;
                return true;
            }
            if (ListeJetons[i] != null) {
                i++;
            }
            if (i == 21) {
                return false;

            }

        }
        return true;
    }

}
