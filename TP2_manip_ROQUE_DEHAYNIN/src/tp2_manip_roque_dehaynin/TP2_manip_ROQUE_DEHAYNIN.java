/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_roque_dehaynin;

/**
 *
 * @author Jade
 */
public class TP2_manip_ROQUE_DEHAYNIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        assiette2.nbCalories = 100;
        Tartiflette assiette3 = assiette2 ;
        
        // il y a 2 new donc deux tartiflettes; L'ASSIETE 2 et l'assiete 3 sont la même tartiflette
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        System.out.println("nb decalories de Assiette 1: " + assiette1.nbCalories);
        
        assiette2 = assiette1;
        assiette1 = assiette3;
        
        // les deux sont fausses : on ne peut pas entrer un objet dans une classe qui n'est pas la sienne
        
    Moussaka [] tableau = new Moussaka[10];
    for (int i=0;i<tableau.length;i++){
    tableau[i] = new Moussaka(100*(1+i));
    if (i==tableau.length-1){
            System.out.println(tableau[i]);   
        }
    else{
            System.out.print(tableau[i]);   

    }
    }
    }
}
// ccc

    
