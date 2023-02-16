import java.text.DecimalFormat;

import java.util.Scanner;

public class Main

{   

    //reads user's input

    static Scanner input= new Scanner(System.in);


     public static void takeUserChoiceIceCream(){

         

         //stores user's inputs together in one variable

         String [] userIceCream= new String[4];

         System.out.print("We make ice creams that matches your flavour\nSo lets get started :)");

	   

	   //prompts user for ice cream container

	    System.out.print("How would you like to have your ice cream\nEnter 1 if you like to have it in Waffle Cone ($3)\nEnter 2 if you like to have it in Cup shaped cone ($2)\nEnter 3 if you like to have it simply in cup ($ 2.5)\n");

	    System.out.print("Enter here: ");

	    userIceCream[0]=input.nextLine();

	    

	    //if user's ice cream container input is not from the given option

	    while((!userIceCream[0].equalsIgnoreCase("1"))&&(!userIceCream[0].equalsIgnoreCase("2"))&&(!userIceCream[0].equalsIgnoreCase("3"))){

	        

	        //prompts user to enter ice cream container again from the given options

	        System.out.print("***Invalid Entry***\nPlease enter your choice only from given above options: ");

	        userIceCream[0]=input.nextLine();

	    }

	    

	    //prompts for which flavore ice cream they want

	    System.out.print("Which flavour you would like for your ice cream\nChocolate ($3)\nStrawberry ($2)\nVanilla ($1.5)\n");

	    System.out.print("Enter your flavour here: ");

	    userIceCream[1]=input.nextLine();

	    

	    //if user's ice cream flavour is not from the given options 

	    while(!userIceCream[1].equalsIgnoreCase("chocolate")&&!userIceCream[1].equalsIgnoreCase("strawberry")&&!userIceCream[1].equalsIgnoreCase("vanilla")){

	        

	        //prompts user to enter flavour again from the given above options

	        System.out.print("***Invalid Entry***\nPlease enter your choice only from given above options: ");

	        userIceCream[1]=input.nextLine();

	    }

	    

	    //prompts user if they would like toppings on ice cream

         System.out.print("Would you like to have toppings on your ice cream\nEnter yes or no: ");

         String toppings= input.nextLine();

         

         //if user enters anything else instead of yes or no 

         while(!toppings.equalsIgnoreCase("yes")&&!toppings.equalsIgnoreCase("no")){

             

             //prompts user to enter either yes or no

             System.out.print("Invalid Entry, please enter either yes or no: ");

             toppings =input.nextLine();

         }

         

         //if user wants toppings on their ice cream 

         while(toppings.equalsIgnoreCase("Yes")){

             

             //prompts user which topping they would like 

             System.out.println("Which topping would you like on your ice cream: ");

             

             //based on what user chose as ice cream flavour, displays 3 different topping options

             if(userIceCream[1].equalsIgnoreCase("chocolate")){//flavour = chocolate

                 

                 System.out.println("Enter 4 for Rosemary and brown sugar mixed nuts ($1)");

                 System.out.println("Enter 5 for Caramel Popcorn ($0.95)");

                 System.out.println("Enter 6 for Sprinkles ($0.90)");

                 System.out.println("Enter 7 for no toppings ($0.00)");

                 System.out.print("Enter here: ");

                 userIceCream[2]=input.nextLine();

                 

             }//flavour=strawberry

             else if(userIceCream[1].equalsIgnoreCase("strawberry")){

                 

                 System.out.println("Enter 4 for Raspberry & vanilla sauce ($1)");

                 System.out.println("Enter 5 for Strawberry coconut cluster ($0.95)");

                 System.out.println("Enter 6 for Sprinkles ($0.90)");

                 System.out.println("Enter 7 for no toppings($0.00)");

                 System.out.print("Enter here: ");

                 userIceCream[2]=input.nextLine();

             

                 

             }//flavour = vanilla

             else{

                 System.out.println("Enter 4 for Chocolate sauce ($1)");

                 System.out.println("Enter 5 for instant espresso powder & chocolate chip ($0.95)");

                 System.out.println("Enter 6 for Sprinkles ($0.90)");

                 System.out.println("Enter 7 for no toppings($0.00)");

                 System.out.print("Enter here: ");

                 userIceCream[2]=input.nextLine();

             

             }

             

             //if user's topping choice is not from the given above choices

             while(!userIceCream[2].equals("4")&&!userIceCream[2].equals("5")&&!userIceCream[2].equals("6")&&!userIceCream[2].equals("7")){

                 System.out.println("***Invalid Entry***");

                 

                 //prompts to enter again topping choice again from the given above options

                 System.out.print("Please enter your choice only from given above options: ");

                 userIceCream[2]=input.nextLine();


             }

             break;

             

         }//if user don't want toppings

         while(toppings.equalsIgnoreCase("no")){

             

             //prompts whether user wants extra flavour to their ice cream

             System.out.println("Would you like to mix another flavour to your ice cream");

             System.out.println("Enter 4 for Chocolate ($1)");

             System.out.println("Enter 5 for Strawberry ($0.95)");

             System.out.println("Enter 6 for Vanilla ($0.90)");

             System.out.println("Enter 7 for no extra flavour ($0.00)");

             System.out.print("Enter here: ");

             userIceCream[2]=input.nextLine();

             

             //if user's flavour does not matches any flavour from above given options

             while(!userIceCream[2].equals("4")&&!userIceCream[2].equals("5")&&!userIceCream[2].equals("6")&&!userIceCream[2].equals("7")){

                 System.out.println("***Invalid Entry***");

                 

                 //prompts to enter again topping choice again from the given above options

                 System.out.print("Please enter your choice only from given above options: ");

                 userIceCream[2]=input.nextLine();

             

             }

             break;

         }

         

         //prompts user if they want extra toppings

         System.out.print("Would you like extra topping on your ice cream\nEnter yes or no: ");

         String extraToppings=input.nextLine();

         

         //if user enters any other input instead of yes or no

         while(!extraToppings.equalsIgnoreCase("Yes")&&!extraToppings.equalsIgnoreCase("No")){

             

             //prompts user to enter yes or no 

             System.out.print("Invalid Entry, enter either Yes OR no: ");

             extraToppings=input.nextLine();

         }

         

         //if user wants extra toppings

         if(extraToppings.equalsIgnoreCase("yes")){

             

             //displays different topping options and prompts user to enter any option

             System.out.println("Which extra toppings would you like on your ice cream");

             System.out.println("Enter a for one cherry ($0.20)");

             System.out.println("Enter b for one chocolate stick ($0.30)");

             System.out.print("Enter c for cherry dipped in chocolate ($0.25)");

             String userToppings=input.nextLine();

             

             //if user enters anything else instead of a,b,c

             while(!userToppings.equalsIgnoreCase("a")&&!userToppings.equalsIgnoreCase("b")&&!userToppings.equalsIgnoreCase("c")){

                 

                 System.out.print("Please enter either a,b or c: ");

                 userToppings=input.nextLine();

             }

             

             

             //converts user's input to lower case and store it as userIceCream[3]

             userIceCream[3]=userToppings.toLowerCase();

             

             //based on user's input different statements will be displayed

             switch(userIceCream[3]){

                 

                 case "a":

                     System.out.println("Great choice, cherry will taste amazing !!");

                     break;

                 case"b":

                     System.out.println("Great choice, chocolate stick will taste fabulous !!!");

                     break;

                 case "c":

                     System.out.println("Great choice, chocolate dipped cherry would taste delicious !!");

                     break;

             }

             

             

             

             

         }//user don't want extra toppings

         else{

             

             userIceCream[3]="0";

             System.out.println("Great, You preffer simple ice cream !!");

            

         }

         

         

         //makes random draw for user

         System.out.println("Its time for your lucky draw :) !!!");

         

         System.out.print("Press enter to get started with your draw ");

         input.nextLine();

         

         int luckyDraw= (int)((3-1+1)*Math.random()+1);

         

         String [] drawGift= new String[2];

         

         String e="Chocolate cake";

         String r="Red velvet cake";

         String p="Packed";

         String f="Eat now";

         String cc="Chocolate chip cookies";

         String mm="M&M cookies";

         String cb="Chocolate brownie";

         String pb="peanut butter brownie";


         

         //user gets gift based on draw's result

         switch(luckyDraw){

             

             //if luckyDraw no.=1 

             case 1:

                 

                 //user gets free cake

                 System.out.println("You won a free cake");

                 System.out.println("Which cake would you like");

                 

                 //prompts user for cake's flavour

                 System.out.print("Enter e for chocolate cake\nEnter r for red velvet cake: ");

                 drawGift[0]=input.nextLine();

                 

                 //user enters invalid input, enters anything else except e and r

                 while(!drawGift[0].equalsIgnoreCase("e")&&!drawGift[0].equalsIgnoreCase("r")){

                     System.out.print("Invalid entery, please enter either a or r");

                     drawGift[0]=input.nextLine();

                 }

                 

                 //prompts user to pack it or not

                 System.out.println("Would you like to pack it or eat it now");

                 System.out.print("Enter p to pack it\nEnter f to eat it now: ");

                 drawGift[1]=input.nextLine();

                 

                 //user enters invalid option not from given option

                 while(!drawGift[1].equalsIgnoreCase("p")&&!drawGift[1].equalsIgnoreCase("f")){

                     

                     //prompts user to enter either p or f

                     System.out.print("Invalid entery, please enter either p or f");

                     drawGift[1]=input.nextLine();

                 }

                 

                 break;

                 

             case 2:

                 

                 //user gets free cookie

                 System.out.println("You won free cookies");

                 System.out.println("Which cookie you would like");

                 System.out.print("Enter cc for chocolate chip cookies\nEnter mm for M&M cookies: ");

                 drawGift[0]=input.nextLine();

                 

                 //prompts user for cookie flavour

                 while(!drawGift[0].equalsIgnoreCase("cc")&&!drawGift[0].equalsIgnoreCase("mm")){

                     System.out.print("Invalid entry, you can only write either cc OR mm: ");

                     drawGift[0]=input.nextLine();

                 }

                 

                 //prompts to whether pack it or eat it

                 System.out.println("Would you like to pack it or eat it now");

                 System.out.print("Enter p to pack it\nEnter f to eat it now: ");

                 drawGift[1]=input.nextLine();

                 

                 //user enters option that was not given

                 while(!drawGift[1].equalsIgnoreCase("p")&&!drawGift[1].equalsIgnoreCase("f")){

                     

                     //prompts user to enter either p or f

                     System.out.print("Invalid entery, please enter either p or f");

                     drawGift[1]=input.nextLine();

                 }

                 

                 break;

                 

             case 3:

                 

                 //user won brownie

                 System.out.println("You won free brownies");

                 

                 //prompts user for brownie flavour

                 System.out.println("Which kind of brownie woould you like");

                 System.out.print("Enter cb for chocolate brownies\nEnter pb for peanut butter brownies: ");

                 drawGift[0]=input.nextLine();

                 

                 //user enters input not given in options

                 while(!drawGift[0].equalsIgnoreCase("cb")&&!drawGift[0].equalsIgnoreCase("pb")){

                     

                     //prompts user to enter either cb or pb

                     System.out.print("Invalid entry, please enter either cb or pb as per informed above: ");

                     drawGift[0]=input.nextLine();

                     

                 }

                 

                 //prompts user whether they want to eat it or pack it

                 System.out.println("Would you like to pack it or eat it now");

                 System.out.print("Enter p to pack it\nEnter f to eat it now: ");

                 drawGift[1]=input.nextLine();

                 

                 //user enters any other input not from given options

                 while(!drawGift[1].equalsIgnoreCase("p")&&!drawGift[1].equalsIgnoreCase("f")){

                     

                     //prompts user to enter p or f

                     System.out.print("Invalid entery, please enter either p or f");

                     drawGift[1]=input.nextLine();

                 }

                 

                 break;

                 

         }

         

         makeBill( userIceCream, drawGift);

	}

      public static void makeBill(String[] makeUserIceCream, String[] displayDrawGift){

          

          DecimalFormat df= new DecimalFormat("0.00");

         

         double container;

         double flavour;

         double topping;

         double extraTopping;


         

         String e="Chocolate cake,";

         String r="Red velvet cake,";

         String p="which you wanted in packed form";

         String f="which you like to eat now";

         String cc="Chocolate chip cookies,";

         String mm="M&M cookies,";

         String cb="Chocolate brownie,";

         String pb="Peanut butter brownie,";

         int numberIceCream;


         //prompts for number of ice creams

         System.out.print("How many Ice creams would you like to have\nPlease enter number of ice cream as integer input: ");

         

         //user enters non integer input

         while(!input.hasNextInt()){

             

             //prompts for integer input

             System.out.print("We don't provide half ice creams\nPlease enter number of ice creams as integer number: ");

             input.next();

         }

          numberIceCream=input.nextInt();

         

         //user enters number of ice cream as negative number 

         while(numberIceCream<0){

             

             //prompts for positive number of ice creams

             System.out.print("Please enter number ice cream as positive number: ");

             numberIceCream=input.nextInt();

         }

         

         //user chose 1 option 

         if(makeUserIceCream[0].equals("1")){

             System.out.println("Here is your total bill");

             System.out.println("Waffle Cone ($"+df.format(((double)3)*numberIceCream)+")");

             

             //container price will be 3

             container=3;

             

         }//user chose 2 option

         else if(makeUserIceCream[0].equals("2")){

             System.out.println("Cup shaped cone ($"+ df.format(((double)2)*numberIceCream)+")");

             

             //container price will be 2

             container=2;

             

         }//user chose 3 option

         else if(makeUserIceCream[0].equals("3")){

             System.out.println("simply in cup ($"+df.format(((double)2.5)*numberIceCream)+")");

             

             //container price will be 2.5 

             container=2.5;

         }else{

             container=0;

         }

         

         

         //user chose chocolate

         if(makeUserIceCream[1].equalsIgnoreCase("chocolate")){

             System.out.println("Chocolate ($"+ df.format(((double)3)*numberIceCream)+")");

             

             //flavour price will be 3

             flavour=3;

             

             //user chose 4 option for topping

             if(makeUserIceCream[2].equals("4")){

                 System.out.println("Rosemary and brown sugar mixed nuts ($"+df.format(((double )1)*numberIceCream));

                 

                 //topping price will be 1                   

                 topping=1;

                 

             }//user chose 5 option for topping

             else if(makeUserIceCream[2].equals("5")){

                 System.out.println("Caramel Popcorn ($"+df.format(((double)0.95)*numberIceCream)+")");

                 

                 //topping price will be 0.95

                 topping=0.95;

             

             }//user chose 6 option for topping

             else if(makeUserIceCream[2].equals("6")){

                 System.out.println("Sprinkles ($"+0.90*numberIceCream+")");

                 

                 //topping price will be 0.90

                 topping=0.90;

                 

             }//user chose 7 option for topping

             else if(makeUserIceCream[2].equals("7")){

                 System.out.println("no toppings ($"+0.00*numberIceCream+")");

                 

                 //topping price will be 0

                 topping=0;

             }else{

                 topping=0;

             }

             

         }//user chose Strawberry as flavour 

         else if(makeUserIceCream[1].equalsIgnoreCase("Strawberry")){

             System.out.println("Strawberry ($"+2*numberIceCream+")");

             

             //flavour price will be 2

             flavour=2;

             

             //user chose 4 option for topping

             if(makeUserIceCream[2].equals("4")){

                 System.out.println("(Raspberry & vanilla sauce ($"+1*numberIceCream+")");

                 

                 //topping price will be 1                   

                 topping=1;

                 

             }//user chose 5 option for topping

             else if(makeUserIceCream[2].equals("5")){

                 System.out.println("Strawberry coconut cluster ($"+0.95*numberIceCream+")");

                 

                 //topping price will be 0.95

                 topping=0.95;

             

             }//user chose 6 option for topping

             else if(makeUserIceCream[2].equals("6")){

                 System.out.println("Sprinkles ($"+0.90*numberIceCream+")");

                 

                 //topping price will be 0.90

                 topping=0.90;

                 

             }//user chose 7 option for topping

             else if(makeUserIceCream[2].equals("7")){

                 System.out.println("no toppings ($"+0.00*numberIceCream+")");

                 

                 //topping price will be 0

                 topping=0;

             }else{

                 topping=0;

             }

         }//user chose vanilla as flavour

         else if(makeUserIceCream[1].equalsIgnoreCase("vanilla")){

             System.out.println("Vanilla ($"+1.5*numberIceCream+")");

             flavour= 1.5;

             

             //user chose 4 option for topping

             if(makeUserIceCream[2].equals("4")){

                 System.out.println("Chocolate sauce ($"+1*numberIceCream+")");

                 

                 //topping price will be 1                   

                 topping=1;

                 

             }//user chose 5 option for topping

             else if(makeUserIceCream[2].equals("5")){

                 System.out.println("Instant espresso powder & chocolate chip ($"+0.95*numberIceCream+")");

                 

                 //topping price will be 0.95

                 topping=0.95;

             

             }//user chose 6 option for topping

             else if(makeUserIceCream[2].equals("6")){

                 System.out.println("Sprinkles ($"+0.90*numberIceCream+")");

                 

                 //topping price will be 0.90

                 topping=0.90;

                 

             }//user chose 7 option for topping

             else if(makeUserIceCream[2].equals("7")){

                 System.out.println("no toppings ($"+0.00*numberIceCream+")");

                 

                 //topping price will be 0

                 topping=0;

             }else{

                 topping=0;

             }

         }else{

             

             flavour=0;

             if(makeUserIceCream[2].equals("4")){

                 System.out.println("Extra Chocolate flavour($"+1*numberIceCream+")");

             

                 topping=1;

             }else if(makeUserIceCream[2].equals("5")){

                 System.out.println("Extra Strawberry ($"+0.95*numberIceCream+")");

                 topping=0.95;

             }else if(makeUserIceCream[2].equals("6")){

                 System.out.println("Extra vanilla ($"+0.90*numberIceCream+")");

                 topping=0;

              }else if(makeUserIceCream[2].equals("7")){

                 System.out.println("No extra flavour ($"+0.00*numberIceCream+")");

                 topping=0;

             }else{

                 topping=0;

             }

         } 

         

         if(makeUserIceCream[3].equals("a")){

             System.out.println("One cherry ($"+0.20*numberIceCream+")");

             extraTopping=0.20;

         }else if(makeUserIceCream[3].equals("b")){

             System.out.println("One chocolate stick ($"+0.30+")");

             extraTopping=0.30;

         }else if(makeUserIceCream[3].equals("c")){

             System.out.println("Cherry dipped in chocolate ($"+0.25*numberIceCream+")");

             extraTopping=0.25;

         }else{

             extraTopping=0;

         }

         

         

         //displays draw gift

         String gift;

         String eatGift;

         

         //user chose chocolate cake as draw gift

         if(displayDrawGift[0].equalsIgnoreCase("e")){

             gift="Chocolate cake,";

             

         }//user chose red velvet cake as draw gift

         else if(displayDrawGift[0].equalsIgnoreCase("r")){

             gift="Red velvet cake,";

             

         }//user chose chocolate chip cookies as draw gift

         else if(displayDrawGift[0].equalsIgnoreCase("cc")){

             gift="Chocolate chip cookies,";

             

         }//user chose M&M cookies as draw gift

         else if(displayDrawGift[0].equalsIgnoreCase("mm")){

             gift="M&M cookies,";

             

         }//user chose Chocolate brownie as draw gift

         else if(displayDrawGift[0].equalsIgnoreCase("cb")){

             gift="Chocolate brownie,";

             

         }//user chose Peanut butter brownie as draw gift

         else if(displayDrawGift[0].equalsIgnoreCase("pb")){

             gift="Peanut butter brownie,";

             

         }//just to avoid error

         else{

             gift="nothing";

         }

         

         //user don't want to pack draw gift

         if(displayDrawGift[1].equalsIgnoreCase("f")){

             eatGift="and would like to eat it now.";

             

         }//user wants to pack their draw gift 

         else if(displayDrawGift[1].equalsIgnoreCase("p")){

             eatGift="and would like to pack it.";

             

         }//just to avoid error

         else{

             eatGift="nothing";

         }

          

          //displays draw gift 

          System.out.print("Your draw gift is "+gift+ "   "+ eatGift);


         //calculating total bill without tax and discount

         double totalBill= numberIceCream*(container+flavour+topping+extraTopping);

         System.out.println("Your total bill is: $ "+df.format(totalBill));

         

         double taxBill;

         

         //gives discount if total bill is greater or equal to 8

         if(totalBill>=8){

             

             //calculating discount on bill

             double discountBill=(totalBill)-(double)(totalBill*((double)10/100));//casting double

             

             System.out.println("You got discount of $ "+df.format((double)(totalBill*(double)((double)10/100)))+"\nYour bill with discount is: $ "+df.format(discountBill));

             

             //calculating 13% tax on user's bill 

              taxBill= discountBill+(double)(discountBill*((double)13/100));

             

         }//user gets no discount

         else{

             System.out.println("No Discount");

             

             //calculating 13% tax on non discounted bill 

               taxBill= totalBill+(double)(totalBill*((double)13/100));

             

         }

         

         //displaying bill with tax

         System.out.println("Your bill with 13 % tax on it is : $ "+df.format(taxBill));

        

         

         //prompting user if they want to cancle order or give order again or continue and pay

         System.out.print("Enter 1 to continue and pay\nEnter 2 to cancle order and leave\nEnter 3 to order again");

         while(!input.hasNextInt()){

             System.out.print("***Invalid Entry***\nPlease enter 1 OR 2 OR 3 : ");

             input.next();

         }

         int payOrLeave=input.nextInt();

         

         //if user enters any other option except 1 or 2 or 3

         while(payOrLeave!=1&&payOrLeave!=2&&payOrLeave!=3){

             

             System.out.println("***Invalid Entry***\nEnter only 1 OR 2 OR 3: ");

             payOrLeave=input.nextInt();

             

         }//user wants to continue and pay

         if(payOrLeave==1){

             

             //prompts user to enter payment

             System.out.print("Enter your payment here: ");

             

             //if user enters non decimal input 

             while(!input.hasNextDouble()){

                 

                 //prompts user for decimal input

                 System.out.print("Please enter your payment as double: ");

                 double userPayment=input.nextDouble();

             }

             double userPayment=input.nextDouble();

             

             do{

                 

                 

                 if((userPayment-taxBill)>0.01){

                     System.out.println("You paid $ "+df.format(userPayment-taxBill)+" extra");

                     break;

                 }

                    

                  else if((taxBill-userPayment)>0.01){

                     System.out.println("You forgot to pay : $ "+df.format(Math.abs(userPayment-taxBill)));

                     

                     double checkRemaining=0;

                     do{

                         System.out.print("Please enter remaining payment ($"+df.format(taxBill-userPayment)+") : ");

                         double remainingPayment=input.nextDouble();

                         userPayment += remainingPayment;

                         checkRemaining+=remainingPayment;

                     }while((taxBill-userPayment)>0.01);

                 

                 }

             }while((userPayment-taxBill)>0.01||(taxBill-userPayment)>0.01);


             

             //user paid same exact bill amount

             System.out.print("Thanks for shopping with us :)");


         }

             //if user wants to cancle order and leave

             while(payOrLeave==2){

                 System.out.print("Sorry if you found any inconvenience :(\nThanks for being with us :)");

                 break;

             }

             

             //user wants to order again from starting 

             while(payOrLeave==3){

                 System.out.println("\n\nHello!!\nWelcome back to jeny's Ice Cream shop");

                 //calls main method

                 takeUserChoiceIceCream();

                 

             }

      }      

       

     public static void main(String[] args) {

         

         //displays welcome message

         System.out.println("Hello!\nWelcome to Jeny's Ice Cream shop");

         

         //b is 1

         int b=1;

          

         //displays upper triangle

         for(int i=1;i<=6;i++){

             

             //adds space before printing

             for(int j=i;j<11;j++){

                 System.out.print(" ");

             }

             for(int k=1;k<=b;k++){

                 System.out.print("o");  

             }

             b+=2;

             System.out.println("");

         }

         

         

         int o=9;

         int temp=9;

          

         //displays lower triangle

         for(int k=5;k<=10;k++){

             

             //adds space before printing *

             for(int m=temp;m<15;m++){

                 System.out.print(" ");

             }

             for(int n=o;n>=1;n--){

                 System.out.print("*");

             }

             o-=2;

             temp--;

             System.out.println("");

         }

         System.out.println("Great Day to eat ice cream!!!\n");

         takeUserChoiceIceCream();

	}

}