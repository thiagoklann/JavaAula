/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thiagoprova1ex3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Thiagoprova1ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int compra,pago,troco,notas100,notas10,notas1,resto;
         
         
         System.out.println("digite o valor de compra");
         compra = Integer.valueOf(input.nextLine());
         
         System.out.println("digite o valor pago");
         pago = Integer.valueOf(input.nextLine());
         
         troco = pago - compra;
         
         notas100 = troco / 100;
                 
         resto = troco % 100;
         
         notas10 = resto / 10;
         
         notas1 = resto % 10;
         
         System.out.println("(valor troco)" + troco + "(notas 100)" + notas100 + "(notas 10)" + notas10 + "(notas1)" + notas1);
                 
                 
    }
    
}
