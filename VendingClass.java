// * Terry
//* VendingClass
//* 



public class VendingClass {
            
             static char Food;
             static int moneyEntered;
             
             
             
            public VendingClass()
            {
            }
                                    
          static String Menu = "*****************************"
                                 + "\n*   Java Vending Machine    *"
                                 + "\n*****************************"
                                 + "\n(1): Breath Mints -- 45¢"
                                 + "\n(2): Potato Chips -- 75¢"
                                 + "\n(3): Hershey Bar -- 80¢"
                                 + "\n(4): Pop Tarts -- 95¢"
                                 +"\nPlease make your selection (1, 2, 3, 4 or type 5 to EXIT): ";  
                                 
                                                              
                                 
         public static void Foodselection(){ //error checking method? But when I input for example '17a' it will display "Please enter the money for item 1 "
                         
                                    switch(Food){                          
                                    case '1':
                                    System.out.print("Please enter the money for item 1 : ");
                                    break;
                                    case '2':
                                    System.out.print("Please enter the money for item  2 : ");
                                    break;
                                    case '3':
                                    System.out.print("Please enter the money for item 3 : ");
                                    break;
                                    case '4':
                                    System.out.print("Please enter the money for item 4 : ");
                                    break; 
                                    case '5':
                                    System.out.print("Thanks for your patronage! Have a Nice Day");       
                                    break;
                                    default:
                                    System.out.print("That is not a valid choice--please select again...");
                                  }
                                  }
                                  
             
                                   
 }
