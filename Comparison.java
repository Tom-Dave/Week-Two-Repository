/*import Java API for scanner
use public class 
use public static void for the main method being executed
import the main scanner
print out "Enter your number: "
use nextInt to read and capture the integer
use if to check if it's less than or greater than or equal to 10
print the result*/



import java.util.Scanner;


  public class Comparison{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter your number: ");
   int number = input.nextInt();
   if(number > 10){
   System.out.printf("Your number %s is greater than 10 %n", number);
   }if(number == 10){
   System.out.printf("Your number %s is equal to 10 %n", number);
   }if(number < 10){
   System.out.printf("Your number %s is lesser than 10 %n", number);
   }
   
   
   
                        }
                                }
