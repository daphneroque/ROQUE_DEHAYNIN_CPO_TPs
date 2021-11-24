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
    
    public Grille() {
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
            if (CellulesJeu[5][j].jetonCourant== null){
                MaGrille=false;
                return MaGrille;
            }    
        }
        return MaGrille;
    }
    
    public void viderGrille(){
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                CellulesJeu[i][j].jetonCourant=null;
            }
        }
        
    }
    
    public void afficherGrilleSurConsole(){
        for (int i=5; i>=0; i--){ // comme la grille affiche la premiere ligne, et que la ligne du haut est 5, on doit changer le sens pour l'affichage
            for (int j=0; j<7; j++){
                if (CellulesJeu[i][j].lireCouleurDuJeton()== "vide"){
                    System.out.print("_ ");
                }
                if (CellulesJeu[i][j].lireCouleurDuJeton()== "rouge"){ 
                    System.out.print("R");
                }
                
                if (CellulesJeu[i][j].lireCouleurDuJeton()== "jaune"){ 
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
            Compt=0;
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
                Compt=0;
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
                Compt=0;
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
                Compt=0;
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

public void tasserGrille (int ligne, int colone){
    for(int i=0; i<ligne; i++ ){
    CellulesJeu[i+1][colone].jetonCourant=CellulesJeu[i][colone].jetonCourant;
        CellulesJeu[i][colone].jetonCourant = null;
    }
    
}

public boolean placerTrouNoir(int ligne , int colone ){ //demander au prof si ça fonctionne
    boolean trou=false;
    if (CellulesJeu[ligne][colone].trouNoir==false){
       CellulesJeu[ligne][colone].trouNoir=true;
       trou = true;
    }
    return trou;
}


public boolean placerDesintegrateur(int ligne, int colone){
     if (CellulesJeu[ligne][colone].Desintegrateur==false){
       CellulesJeu[ligne][colone].Desintegrateur=true;
       return true;
    }
    else{
        return false;
    }  
}

public boolean supprimerJeton(int ligne, int colone){
    if (CellulesJeu[ligne][colone]!=null){
           CellulesJeu[ligne][colone] = null;
           return true;
       }
       else {
           return false;
       }
   }

public Jeton recupererJeton(int ligne, int colone){
    Jeton recuperationJeton =  CellulesJeu[ligne][colone].jetonCourant;
    CellulesJeu[ligne][colone].supprimerJeton();
    return recuperationJeton;           
}
}



        

   

    
    
    

