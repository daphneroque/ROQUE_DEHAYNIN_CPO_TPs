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
                CellulesJeu[i][j]=new Cellule();
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
    
    public boolean etreRemplie() {
        boolean MaGrille=true;
        for (int j=0; j<7; j++){
            if (CellulesJeu[5][j]== null){
                MaGrille=false;
                return MaGrille;
            }    
        }
        return MaGrille;
    }
    
    public void viderGrille(){
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                CellulesJeu[i][j]=null;
            }
        }
        
    }
    
    public void afficherGrilleSurConsole(){
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                if (CellulesJeu[i][j].lireCouleurDuJeton()== "vide"){
                    System.out.print("0");
                }
                if (CellulesJeu[i][j].lireCouleurDuJeton()== "Rouge"){ 
                    System.out.print("R");
                    
                }
                if (CellulesJeu[i][j].lireCouleurDuJeton()== "Jaune"){ 
                    System.out.print("J");
                    
                }
            }
              System.out.println();          
             
        }
    }
    
   
    
        
        
    }
   
    
    
    
    

