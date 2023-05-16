/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationforr;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class JavaApplicationForr {
     static Scanner input = new Scanner(System.in);
    
    
    
    
    public static void main(String[] args) {
        int idade,idadet;
        String nome;
        
        System.out.println("digite seu nome");
        nome = String.valueOf(input.nextLine());
        
        System.out.println("digite sua idade");
        idade = Integer.valueOf(input.nextLine());
        
        
        while(idade < 0 || idade>100){
        System.out.println("digite a idade novamente");
        idade = Integer.valueOf(input.nextLine());
        
        }
        
        idadet = idade + 5;
        System.out.println("idade" + idadet);
        
    }
    
}
