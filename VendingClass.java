// * Terrick Wright
//* VendingClass
//* November 19, 2021


import java.util.Scanner;

public class VendingClass {
               int[]Cost = {45,75,80,95};
               int Food;
               int moneyEntered;
               int selected;
              
             
                      
   
            public VendingClass()
            {
            }
             Scanner keyboard =  new Scanner(System.in);                      
          static String Menu = "*****************************"
                                 + "\n*   Java Vending Machine    *"
                                 + "\n*****************************"
                                 + "\n(1): Breath Mints -- 45¢"
                                 + "\n(2): Potato Chips -- 75¢"
                                 + "\n(3): Hershey Bar -- 80¢"
                                 + "\n(4): Pop Tarts -- 95¢"
                                 +"\nPlease make your selection (1, 2, 3, 4 or type 5 to EXIT): ";  
                                 
                                                              
                                 
         public static void Foodselection(){ //error checking method? But when I input for example '17a' it will display "Please enter the money for item 1 "
                                    int Food = keyboard.nextInt();
                                    switch(Food){                          
                                    case 1:
                                    System.out.print("Please enter the money for item 1 : ");
                                    break;
                                    case 2:
                                    System.out.print("Please enter the money for item  2 : ");
                                    break;
                                    case 3:
                                    System.out.print("Please enter the money for item 3 : ");
                                    break;
                                    case 4:
                                    System.out.print("Please enter the money for item 4 : ");
                                    break; 
                                    case 5:
                                    System.out.print("Thanks for your patronage! Have a Nice Day");       
                                    break;
                                    default:
                                    System.out.print("That is not a valid choice--please select again...");
                                    
                                  }
                                  }
                                  
        public static void addedChange(){
        selected = Cost[Food - 1]; 
       moneyEntered = keyboard.nextInt(); 
       System.out.print("You have submitted " + moneyEntered  + " cents for item " + Food);
       System.out.print("\nYou must submit " + (selected - moneyEntered) + " cents more ");
       System.out.print("\nPlease enter addtional change for your item: "); 
       }
                                  
             
                                   
 }
