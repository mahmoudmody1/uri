/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.util.Scanner;

/**
 *
 * @author mo3tamed
 */
public class Greatest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        if ( x >= y && x >= z )
            System.out.println(x+" eh o maior");
        else if (y >= z )
            System.out.println(y+" eh o maior");
        else 
            System.out.println(z+" eh o maior");
    
    }
    
}
