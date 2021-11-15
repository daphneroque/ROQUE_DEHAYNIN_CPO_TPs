/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roque_dehaynin;

/**
 *
 * @author daphn
 */
public class Grille {
    Cellule[][] CellulesJeu =new Cellule [6][7];
    
    public void Grille() {
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                CellulesJeu[i][j]=null;
            }
        }
            
}
    public boolean ajouterJetonDansColonne(Jeton jet,int colonne){

        for (int i=0; i<6; i++){
            if (CellulesJeu[i][colonne].jetonCourant==null){
                CellulesJeu[i][colonne].affecterJeton(jet);
                return true;
            }
            
            }
        return false;   
        }
    
        
        
    }
   
    
    
    
    

