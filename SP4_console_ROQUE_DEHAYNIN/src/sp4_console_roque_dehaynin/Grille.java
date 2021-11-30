/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roque_dehaynin;

/**
 *
 * @author daphn
 */
public class Grille { //on crée notre attribut  de 6x7 objet de type cellule
    Cellule[][] CellulesJeu =new Cellule [6][7];
    
    public Grille() { // on crée notre constructeur grille a l'aide d'une boucle qui parcours nos ligne et colonne
        for (int i=0; i<6; i++){ // parcours les 6 lignes
            for (int j=0; j<7; j++){// parcours les 7 colonnes
                CellulesJeu[i][j]=new Cellule();
            }
        }
            
}
    public boolean ajouterJetonDansColonne(Jeton jet,int colonne){ //ajoute le jeton dans la colonne ciblée, sur
      //la cellule vide la plus basse

        for (int i=0; i<6; i++){ // parcours les lignes 
            if (CellulesJeu[i][colonne].jetonCourant==null){ //on verifie qu'il n'y a pas de jeton de la colonne demande
                CellulesJeu[i][colonne].affecterJeton(jet); // dans ce cas on place le jeton dans la colonne 
                return true;
            }
            
            }
        return false;   //la colonne est pleine on revoie faux
        }
    
    public boolean etreRemplie() { // on regarde si la grille est remplie
        boolean MaGrille=true;
        for (int j=0; j<7; j++){ // on parcours les 7 colonnes 
            if (CellulesJeu[5][j].jetonCourant== null){ // si il reste des cellules vide dans les lignes
                MaGrille=false; // alors la grille n'est pas remplie
                return MaGrille;
            }    
        }
        return MaGrille; // on retourne vrai car la grille est remplie
    }
    
    public void viderGrille(){ // on vide la grille
        for (int i=0; i<6; i++){ //on parcours chaque cellule de toutes les lignes 
            for (int j=0; j<7; j++){ //et colonnes pour les intialiser à O
                CellulesJeu[i][j].jetonCourant=null;
            }
        }
        
    }
    
    public void afficherGrilleSurConsole(){ // methode afin d'afficher notre grille
        for (int i=5; i>=0; i--){ // comme la grille affiche la premiere ligne, et que la ligne du haut est 5, on doit changer le sens pour l'affichage
            for (int j=0; j<7; j++){ // on parcours nos lignes et cellule
                if ((CellulesJeu[i][j].lireCouleurDuJeton()== "vide")&&
                        CellulesJeu[i][j].trouNoir == false &&
                        CellulesJeu[i][j].Desintegrateur == false)  {
                    System.out.print("_ "); // s'il n'y a ni de TN et D alors la case est vide on la note _
                }
                if (CellulesJeu[i][j].lireCouleurDuJeton()== "rouge"){ // si la cellule est occupé par un jeton rouge
                    System.out.print("R"); // R apparait dans la cellule concerné 
                }
                
                if (CellulesJeu[i][j].lireCouleurDuJeton()== "jaune"){ // si la cellule est occupé par un jeton jaune
                    System.out.print("J"); // J apparait dans la cellule concerné 
                    
                }
                if(CellulesJeu[i][j].trouNoir == true) { // si presence de trou noir dans la cellule
                    System.out.print(" O");
                }
                if((CellulesJeu[i][j].Desintegrateur == true && CellulesJeu[i][j].trouNoir==false )) { //il faut q'il y est un D mais pas de TN
                    System.out.print(" D");
                }
                
            
            }
              System.out.println();          
             
            
        }
    }
    
   public boolean celluleOccupee (int ligne ,int colonne){ // renvoie  si la cellule de coordonnées données est
       //occupée par un jeton.
       if (CellulesJeu[ligne][colonne].jetonCourant==null){ // on regarde si la cellule est occupée
           return false;
       }
       else {
       return true; // la cellule est occupée par un jeton
                   }
           
       }
    

public String lireCouleurDuJeton(int ligne, int colonne){ // renvoie la couleur du jeton de la cellule ciblée
    
       return CellulesJeu[ligne][colonne].lireCouleurDuJeton();
    
    
       
    
}
public boolean etreGagnantePourJoueur(Joueur personnageG){ // renvoie vrai si la grille est gagnante pour le
         //joueur passé en paramètre
        int Compt = 0; // on initialise notre variable compteur 
        String CouleurGagnante = personnageG.Couleur;

        for (int i=0; i<6; i++) {  
            for (int j=0; j<4; j++){  //parcours seulement 4 colonnes car il en faut 4 pour gagner
            Compt=0;
            String CouleurCase = lireCouleurDuJeton(i,j); // creation d'une variable qui va lire la couleur du jeton de la cellule
                if (CouleurCase == CouleurGagnante){ 
                    int k =j;
                    while (CellulesJeu[i][k].lireCouleurDuJeton()== CouleurGagnante){
                        Compt += 1; // on augmente le compteur de 1 car la couleur des jetons du joueur sont alignées
                        k +=1;
                        if (Compt == 4){
                            return true; // les 4 jetons sont alignés, le jour a gagné
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
        return CellulesJeu[5][colonne].jetonCourant!=null ;  
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



        

   

    
    
    

