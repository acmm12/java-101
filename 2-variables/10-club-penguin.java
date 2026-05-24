// Club Penguin 🐧
// Codédex

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

      Scanner scanner= new Scanner(System.in);
        double coinValue= 0.0045;
        System.out.print("Enter the number of coins:  ");
         int coins = scanner.nextInt(); 
          double usd= coinValue * coins;

  
        System.out.print("You have this ammount:  ");
        System.out.println(usd);
    }
}
