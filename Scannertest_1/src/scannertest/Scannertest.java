
package scannertest;

import java.util.*;
public class Scannertest {

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("please enter your name");
        System.out.print(">");
        String name = sc.nextLine();
        System.out.println("Hello," +name+ ". Welcome to Scanner!");
        
    
    }
    
}
