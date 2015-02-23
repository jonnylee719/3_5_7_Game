/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game3_5_7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Game3_5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        int row1, numStar;
        row1 = 5;
        int playerCounter = 1, roundNum = 1;
        
        do {
        
            
            for (int i = 1 ; i <= row1 ; i++) {
                System.out.print ("*");
            }
            
            System.out.print("\n" );
            
            
            System.out.print( "\n" + "Round " + roundNum + "\n" +
                    "Player " + playerCounter + ", please choose no. of * : ");
            Scanner scan = new Scanner (System.in);
            numStar = scan.nextInt();
        
            row1 -= numStar;
            playerCounter += 1;
            
        
            
                if (playerCounter == 3) {
                    roundNum++;
                    playerCounter -= 2;
                }
                
            System.out.println ("--------------------------------------------");
        }
        while (row1 > 1);
        
        if (playerCounter == 1)
        System.out.print( "Too bad Player 1, you have lost!");
        else 
        System.out.print ("Too bad Player 2, you have lost!");
        
       
        
        
        
    }
    
}
