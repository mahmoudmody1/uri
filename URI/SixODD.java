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
public class SixODD {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < 6; i++) {
            if (a % 2 == 0 )
                System.out.println(2*i +1+ a );
            else
                System.out.println(2*i + a );
        }
    }
    
}
