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
    
   public boolean celluleOccupee (int ligne ,int colonne){
       if (CellulesJeu[ligne][colonne].jetonCourant==null){
           return false;
       }
       else {
       return true; 
                   }
           
       }
    

public String lireCouleurDuJeton(int ligne, int colonne){
    
       return CellulesJeu[ligne][colonne].lireCouleurDuJeton();
    
    
       
    
}
public boolean etreGagnantePourJoueur(Joueur personnageG){
        int Compt = 0;
        String CouleurGagnante = personnageG.Couleur;

        for (int i=0; i<6; i++) { 
            for (int j=0; j<4; j++){  
            String CouleurCase = lireCouleurDuJeton(i,j);
                if (CouleurCase == CouleurGagnante){ 
                    int k =j;
                    while (CellulesJeu[i][k].lireCouleurDuJeton()== CouleurGagnante){
                        Compt += 1;
                        k +=1;
                        if (Compt == 4){
                            return true;
                        }
                    }
                }

            } 
        }

        for (int i=0; i<3; i++) { 
            for (int j=0; j<7; j++){  
            String Couleurcellule = lireCouleurDuJeton(i,j);
                if (Couleurcellule == CouleurGagnante){ 
                    int k =i;
                    while (CellulesJeu[k][j].lireCouleurDuJeton()== CouleurGagnante){
                        Compt += 1;
                        k +=1;
                        if (Compt == 4){
                            return true;

                        }
                    }
                }     

            } 
        }

        
        for (int i=0; i<3; i++) { 
            for (int j=0; j<4; j++){  
            String Couleurcellule = lireCouleurDuJeton(i,j);
                if (Couleurcellule == CouleurGagnante){
                    int k =i;
                    int n = j;
                    while (CellulesJeu[k][n].lireCouleurDuJeton()== CouleurGagnante){
                        Compt += 1;
                        k +=1;
                        n +=1;
                        if (Compt == 4){
                            return true;

                        }

                    }

                }     

            } 

        }

 
        
        for (int i=3; i<6; i++) { 
            for (int j=0; j<4; j++){  
            String Couleurcellule = lireCouleurDuJeton(i,j);
                if (Couleurcellule == CouleurGagnante){ 
                    int k =i;
                    int n = j;
                    while (CellulesJeu[k][n].lireCouleurDuJeton()== CouleurGagnante){
                        Compt += 1;
                        k +=1;
                        n -=1;
                        if (Compt == 4){
                            return true;

                        }
                    }
                }     

            } 

        }

        return false;
    }
  

boolean colonneRemplie (int colonne){
        return CellulesJeu[5][colonne].jetonCourant!=null;  
}
}
        

   

    
    
    

