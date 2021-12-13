// * Terrick Wright
//* VendingMachine
//* November 19, 2021

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
    
     String input;
     char food;
     int Cost[] = {45, 75, 80, 95};
     int moneyEntered;
     
     
            Scanner keyboard = new Scanner(System.in);
            
                
            
            
            System.out.print(VendingClass.Menu);
            
            

        input = keyboard.nextLine();// Need Input to match the Cost of the item
        VendingClass.Food = input.charAt(0);
        VendingClass.Foodselection(); 
        moneyEntered = keyboard.nextInt(); //  //Calculate the money that the user needs to add, keeping a display of the running total of how much money the user still owes, and calculate the change (if any) owed to the user

      //("You have submitted " + moneyEntered + " cents for item " + input)
      //("You must submit " + Cost - moneyEntered + " cents more ");
      //("Please enter addtional change for your item: ")
      
      // Needs to repeat until it is time to give change back
        
           
                                               
 }}





 



      
    
    
    
    
        
        