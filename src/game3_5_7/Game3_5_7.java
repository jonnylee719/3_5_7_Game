/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game3_5_7;

import java.util.Scanner;


/**
 *
 * @author user
 */
public class Game3_5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        int starNum, star1, star2, star3;
        star1 = 3;
        star2 = 5;
        star3 = 7;
        
        int rowNum, row1, row2, row3;
        rowNum = 0;
        row1 = 1;
        row2 = 2;
        row3 = 3;
        int playerCounter = 1, roundNum = 1;
        
        do {
            System.out.print( "\n" + "Round " + roundNum + "\n" +  // getting input from player
                    "Player " + playerCounter + ", please type rowNum and no. of * : ");
            Scanner scan = new Scanner (System.in);
            rowNum = scan.nextInt();
            starNum = scan.nextInt();           
            
            if (rowNum == row1){
                star1 -= starNum;
            } 
            if (rowNum == row2){
                star2 -= starNum;
            }
            if (rowNum == row3){
                star3 -= starNum;
            }
            
                            
            for (int k = 0; k< star1; k++){ // for printing first row
                System.out.print ("*");
            }
            System.out.println();
            
            for (int k = 0; k< star2; k++){ // for printing second row
                System.out.print ("*");
            }
            System.out.println();    
            
            for (int k = 0; k< star3; k++){ // printing third row
                System.out.print ("*");
            }
            System.out.println();
            
            playerCounter += 1;
            
        
            
            if (playerCounter == 3) {
                roundNum++;
                playerCounter -= 2;
                System.out.println ("--------------------------------------------");
            }
                
            
        }
        while (star1 + star2 + star3 > 1);
        
        if (playerCounter == 1)
        System.out.print( "Too bad Player 1, you have lost!");
        else 
        System.out.print ("Too bad Player 2, you have lost!");
        
       
        
        
        
    }
    
}
