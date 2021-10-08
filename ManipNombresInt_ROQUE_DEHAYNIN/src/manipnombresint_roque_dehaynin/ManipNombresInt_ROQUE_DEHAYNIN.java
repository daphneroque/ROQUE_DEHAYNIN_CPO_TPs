
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jade
 */
public class ManipNombresInt_ROQUE_DEHAYNIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int entier1=0;
    int entier2=0;
    Scanner sc;
    sc = new Scanner(System.in);
    System.out.println("Entrez un entier");
    entier1 = sc.nextInt();
    System.out.println("Please int number:"); 
    entier2 = sc.nextInt();
    
    int somme = entier1+entier2;
    System.out.println("La somme des entiers est : "+somme);
    int diff= entier1-entier2;
    System.out.println("La différence etre les entiers est : "+ diff);
    int produit=entier1*entier2;
    System.out.println("Le produit des entiers est "+ produit);
    int quotient= entier1/entier2;
    System.out.println("Le quotient du 1er et du 2eme est "+ quotient);
    int div= entier1%entier2;
    System.out.println("Le reste de la div est "+ div);
    
    
 }
 }
    
    

