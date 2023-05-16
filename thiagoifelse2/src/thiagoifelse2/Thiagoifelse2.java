/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thiagoifelse2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Thiagoifelse2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
      float preço,quantidade,total;
      
        System.out.println("digite o numero 1");
        preço = Float.valueOf(input.nextLine());
        
        System.out.println("digite o numero 2");
        quantidade = Float.valueOf(input.nextLine());
        
        
        total = preço * quantidade;
        
        if(preço<0 || quantidade<0){
            System.out.println("ERRO");
        }
        
        else{ 
        
        System.out.println("(total)" + total);
        }
    }
    
}
