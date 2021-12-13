CIT 111 Programming Assignment
For our last programming project of the semester, we will create a program entitled VendingMachine that will simulate the operation of a vending machine. You will create a program to display a menu of choices, take the user’s inputted selection, ask for money for their selection, calculate any change due back to the user, and list the exact type and amount of coins (not just the numerical amount) that the user would receive in change. Write the code necessary to perform the following actions in your program:
1.	Produce a menu system that looks EXACTLY like the following illustration 
(appearance will be graded):
******************************
*    Java Vending Machine    *
******************************
	(1): Breath Mints -- 45¢ 
	(2): Potato Chips -- 75¢
	(3): Hershey Bar -- 80¢ 
	(4): Pop Tarts -- 95¢
Please make your selection (1, 2, 3, 4 or type 5 to EXIT): 

**Notice the use here of the cents symbol (¢). You will have to research how to add this symbol, since it is not present on your keyboard.
2. You should create a means to provide error checking for the user’s input. The user should NOT be able to enter a number or letter that does not correspond to one of the choices offered in the menu. There are several ways to provide error-checking (a switch statement is one, but there are others).
For this program, you should use the Scanner Class for input from the user. Do not use the JOptionPane Class, as it will not provide a running account on the screen of the program’s transactions with the user.
3.  Write four methods to perform the functions of the program:
•	Display the machine’s menu
•	Perform error checking on the user’s input for both the menu choices and change input
•	Calculate the money that the user needs to add, keeping a display of the running total of how much money the user still owes, and calculate the change (if any) owed to the user
•	Calculate the exact coins to be dispensed to the user in change
These methods should be written in a separate Class file called VendingClass. As we have done in other assignments, the methods will be called from the VendingMachine program file and should not be included as part of the code in the VendingMachine program.
4.  Provide the appropriate prompts for the user to enter money as an amount of cents based on what choice the user has made, how much money he has submitted, how much more (if any) money still needs to be entered, how much change is due to the user, and how many of each of the coins (quarters, dimes, and nickels) will be dispensed as change (follow the sample output listed below). You should not design your program to deal with the user trying to do something like submitting pennies or any amount that is not divisible by five (i. e., you should not be able to enter an amount like 32 cents). Design your program to accept input in cents, not in fractional amounts (i. e., use integers -- do not set up your program to deal in amounts containing dollars and cents, such as 1.25).
5.  Create an array to hold the cost of each of the four items available from the machine and use the values from the array in your methods to calculate how much money needs to be input by the user.
6.  Use loops where appropriate to calculate the exchange of money and allow the user to run the program as many times as he or she wants. Provide the appropriate mechanism to allow the user to exit the program cleanly.
7.  Display appropriate “Thank you” messages at the end of the transactions.
8.  Your program should display the exact coins that a user would get in change. For our purposes here, you can assume the machine has a limitless quantity of each of the three coins, so you do not have to determine what would happen if the machine has run out of quarters, dimes, or nickels. 
9.  The program files must be submitted in their electronic form. The project will be graded on its input, output, and error-handling capabilities (as explained by the Grading Checklist handed out with the project description). The program will be due no later than before our final class day, December 9. 
Below is a sample printout of the program that illustrates what your prompts and messages should say to the user:

******************************
*    Java Vending Machine    *
******************************
	(1): Breath Mints -- 45¢ 
	(2): Potato Chips -- 75¢
	(3): Hershey Bar -- 80¢ 
	(4): Pop Tarts -- 95¢
Please make your selection (1, 2, 3, 4, or type 5 to EXIT): 3
Please enter the money for item 3: 25
You have submitted 25 cents for item 3
You must submit 55 cents more
Please enter additional change for your item: 25
You have submitted 50 cents for item 3
You must submit 30 cents more
Please enter additional change for your item: 25
You have submitted 75 cents for item 3
You must submit 5 cents more
Please enter additional change for your item: 25
You have given 20 cents too much 
     Your change is 0 quarter(s), 2 dime(s), and 0 nickel(s).
Thanks for your patronage! Enjoy your treat! 

******************************
*    Java Vending Machine    *
******************************
	(1): Breath Mints -- 45¢ 
	(2): Potato Chips -- 75¢
	(3): Hershey Bar -- 80¢ 
	(4): Pop Tarts -- 95¢
Please make your selection (1, 2, 3, 4, or type 5 to EXIT): 6
That is not a valid choice--please select again...

******************************
*    Java Vending Machine    *
******************************
	(1): Breath Mints -- 45¢ 
	(2): Potato Chips -- 75¢
	(3): Hershey Bar -- 80¢ 
	(4): Pop Tarts -- 95¢
Please make your selection (1, 2, 3, 4, or type 5 to EXIT): 4
Please enter the money for item 4: 100
You have given 5 cents too much 
     Your change is 0 quarter(s), 0 dime(s), and 1 nickel(s).
Thanks for your patronage! Enjoy your treat! 

******************************
*    Java Vending Machine    *
******************************
	(1): Breath Mints -- 45¢ 
	(2): Potato Chips -- 75¢
	(3): Hershey Bar -- 80¢ 
	(4): Pop Tarts -- 95¢
Please make your selection (1, 2, 3, 4, or type 5 to EXIT): 5
Thanks for your patronage! Have a Nice Day!

Process completed.
