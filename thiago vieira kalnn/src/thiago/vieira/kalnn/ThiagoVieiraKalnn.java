/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thiago.vieira.kalnn;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ThiagoVieiraKalnn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      float pes,jardas,milhas;
      double polegadas;
      
      pes = Float.valueOf(input.nextLine());
              
        System.out.println("digite sua medida em pes");
        
        polegadas = pes * 12;
        
        jardas = pes/3;
        
       milhas = jardas / 1760;
        System.out.println("media em polegadas"+ polegadas);
               
        System.out.println("media em jardas" + jardas);
        
        System.out.println("media em milhas" + milhas);
          
        
        
      
      
    }
    
}
