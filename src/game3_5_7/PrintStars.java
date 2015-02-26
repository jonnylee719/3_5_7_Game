package game3_5_7;


import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PrintStars {
    
    public static void main (String[] args) {
        
        String text = JOptionPane.showInputDialog(null,
                "Please enter the number of rows: "
                );
        int rowNum = Integer.parseInt(text);
        int count = 1;
        
        while(count <= rowNum) {
        
        for (int j = 0; j < (rowNum - count); j++)
        System.out.print("-");
        
        for (int j = 0; j < count; j++)
        System.out.print("*");
        
        count++;
        System.out.print("\n");
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
