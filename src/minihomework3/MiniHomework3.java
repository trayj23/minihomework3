/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihomework3;

import java.util.Scanner;

/**
 *
 * @author jacktraynor
 */
public class MiniHomework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pick one of the below colours for your starter Pokemon");
        System.out.println("Red, Blue, Green or Yellow?");
        
        Scanner userInput = new Scanner(System.in);
        String Colour = userInput.nextLine();
        
        System.out.println(Colour);
    }
    
}
