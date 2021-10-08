/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_roque_dehaynin;

/**
 *
 * @author Jade
 */
import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author Jade
 */
public class guessmynumber_ROQUE_DEHAYNIN {
     public static void main(String[] args) {
        //modules
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
       
        //variables
        int nombreInt = generateurAleat.nextInt(100);
        int mode = 0;
        int nombreJoueur = -2;
        int compteur = 0;
        
       
        //istructions
        while (mode != 1 && mode != 2 && mode != 3 && mode != 4){
            System.out.println("Choisissez le niveau de difficulté\nniveau facile : entre 0 et 30\nniveau normal : entre 0 et 60\nniveau difficile : entre 0 et 100 nombre d'essaies limités à 10");
            mode = sc.nextInt();
            if (mode == 1 || mode == 2 || mode == 3){
                break;
            }
        }
           
        if (mode == 1){
            nombreInt = generateurAleat.nextInt(30);
            while (nombreInt != nombreJoueur){
                System.out.println("Entrez un nombre entre 0 et 30");
                nombreJoueur = sc.nextInt();
                if(nombreJoueur < nombreInt){
                    if (nombreJoueur+10 < nombreInt){
                        System.out.println("vraiment trop petit");
                    }
                    else{
                        System.out.println("trop petit");
                   }   
                }
                else{
                    if(nombreJoueur > nombreInt){
                        if (nombreJoueur-10 > nombreInt){
                            System.out.println("vraiment trop grand");
                        }
                        else{
                            System.out.println("trop grand");
                        }
                    }
                }
                compteur ++;
            }
            System.out.println("gagné"+ compteur +"tentavies");
        }
       
        
        
        if (mode == 2){
            while (nombreInt != nombreJoueur){
            System.out.println("Entrez un nombre entre 0 et 60");
            nombreJoueur = sc.nextInt();
            if(nombreJoueur < nombreInt){
                System.out.println("trop petit");
            }
            if(nombreJoueur > nombreInt) {
                System.out.println("trop grand");
            }
            compteur ++;
            }
            System.out.println("gagné "+ compteur+"tentatives");
        }
       
        
        if (mode == 3){
            while (nombreInt != nombreJoueur || compteur >= 10){
                System.out.println("Entrez un nombre entre 0 et 100");
                nombreJoueur = sc.nextInt();
                if(nombreJoueur < nombreInt){
                    System.out.println("trop petit");
                }
                if(nombreJoueur > nombreInt) {
                    System.out.println("trop grand");
                }
                compteur ++;
            }
            if (compteur >= 10){
                System.out.println("perdu nombre d'essaies supérieur à 10");
            }
            else{
                System.out.println("gagné "+ compteur+" tentatives");
            }
        }
       
        
           
            
           
        }
    }

}

