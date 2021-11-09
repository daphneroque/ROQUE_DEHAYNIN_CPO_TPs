/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_dehaynin_roque;

/**
 *
 * @author Jade
 */
public class TP2_Bieres_DEHAYNIN_ROQUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
         //uneBiere.nom = "Cuvée des trolls"; 
         //uneBiere.degreAlcool = 7.0 ;
         //uneBiere.brasserie = "Dubuisson";
         //uneBiere.ouverte = false;
         uneBiere.lireEtiquette();
         
        BouteilleBiere Biere1 = new BouteilleBiere("Jade",40.0 ,"Les trois Brasseurs") ;
         Biere1.lireEtiquette();
         
        BouteilleBiere Biere2 = new BouteilleBiere("Daph",0.0 ,"Le Charly") ;
         Biere2.lireEtiquette();
         
        BouteilleBiere Biere3 = new BouteilleBiere("Sun",10.0 ,"Summer") ;
         Biere3.lireEtiquette();
         
        BouteilleBiere Biere4 = new BouteilleBiere("evian",0.0 ,"L'eau") ;
         Biere4.lireEtiquette();
         
        BouteilleBiere Biere5 = new BouteilleBiere("Lake",15.0 ,"Water") ;
         Biere5.lireEtiquette();
         
         System.out.println(uneBiere) ;
         boolean result = Biere1.Décapsuler();
         System.out.println(result);
         result = Biere1.Décapsuler();
         System.out.println(result);
         
         System.out.println(Biere2) ;
         System.out.println(Biere3) ;
         System.out.println(Biere4) ;
         System.out.println(Biere5) ;
         
         //uneBiere.nom = "Leffe"; 
         //uneBiere.degreAlcool = 6.6 ;
         //uneBiere.brasserie = "Abbaye de Leffe";
         //uneBiere.ouverte = false;
         //uneBiere.lireEtiquette();
    }
    
}
