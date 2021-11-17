package net.vendingmachine;
import java.util.Scanner;

public class VendingMachine
{
public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);  
  
  Product products[] = new Product[5];
  products[0] = new Product("Coke", 0.50, 1);
  products[1] = new Product("Pepsi", 0.75, 2);
  products[2] = new Product("Sprite", 0.50, 3);
  products[3] = new Product("Fanta", 1.25, 4);
  products[4] = new Product("Rootbeer", 1.0, 5);
 
  double totalCoins = 0;
  
  char ch;
  
  do
  {
   System.out.println("C)heck my coins S)how products I)nsert coin B)uy R)emove coins Q)uit");
   ch = input.nextLine().charAt(0);
   
   if(ch == 'C' || ch == 'c')
   {
     System.out.println(totalCoins);
   }
   
   else if(ch == 'S' || ch == 's')
   {
    for(int i = 0; i < 5; i++)
     System.out.println(products[i]);
    
   }
   else if(ch == 'I' || ch == 'i')
   {
    System.out.println("A) nickel = 0.05");
    System.out.println("B) dime = 0.1");
    System.out.println("C) quarter = 0.25");
    System.out.println("D) dollar = 1.0");
    ch = input.nextLine().charAt(0);    
    
    if(ch == 'A' || ch == 'a')
     totalCoins += 0.05;
    else if(ch == 'B' || ch == 'b')
     totalCoins += 0.1;
    else if(ch == 'C' || ch == 'd')
     totalCoins += 0.25;
    else if(ch == 'D' || ch == 'd')
     totalCoins += 1.0;
   }
   else if(ch == 'B' || ch == 'b')
   {
    for(int i = 0; i < 5; i++){
     System.out.println((char)('A' + i) + ") " + products[i]);
    }
    
    ch = input.nextLine().charAt(0);
    
    if((ch == 'A' || ch == 'a') && (totalCoins >= 0.50) && (products[0].getQuantity() > 0)) {
    	System.out.println("Purchased");
    	products[0].setQuantity(products[0].getQuantity() - 1);
    }
    else if((ch == 'B' || ch == 'b') && (totalCoins >= 0.75) && (products[0].getQuantity() > 0)) {
    	System.out.println("Purchased");
    	products[1].setQuantity(products[1].getQuantity() - 1);
    }
    else if((ch == 'C' || ch == 'c') && (totalCoins >= 0.50) && (products[0].getQuantity() > 0)) {
    	System.out.println("Purchased");
    	products[2].setQuantity(products[2].getQuantity() - 1);
    }
    else if((ch == 'D' || ch == 'd') && (totalCoins >= 1.25) && (products[0].getQuantity() > 0)) {
       	System.out.println("Purchased");
       	products[3].setQuantity(products[3].getQuantity() - 1);
     }
    else if((ch == 'E' || ch == 'e') && (totalCoins >= 1.0) && (products[0].getQuantity() > 0)) {
       	System.out.println("Purchased");
       	products[4].setQuantity(products[4].getQuantity() - 1);
     }
    
    else {
    	System.out.println("Not Enough Coins or Invalid Input");
    }

   }
   else if(ch == 'R' || ch == 'r')
   {    
    System.out.println("Removed: $" + totalCoins);
   }
   else if(ch != 'Q' && ch != 'q')
   {
    System.out.println("Invalid choice");
   }
  
  }while(ch != 'Q' && ch != 'q');  
}
}