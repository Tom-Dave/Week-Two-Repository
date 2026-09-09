 
 
/*import java API scanner
 use public class
 create a public static void(no return value) for the main
 get the new scanner class
 print out "Enter your number: "
 use nextInt to capture the integer
 use the number modulus 2 and store the answer
 if the modulus is equal to 0 print "your number is even"
 if the modulus is equal to 1 print "your number is odd"*/
 
 
 
 import java.util.Scanner;
 
 
 
    public class Divisible{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter your number: ");
     int number = input.nextInt();
     int unknownNumber = number%2 ;
     int even = 2;
     int remainder = 0;
     if( number % even == remainder){
     System.out.printf("Your number %d is an even number%n", number);
     }else {
      System.out.printf("Your number %d is an odd number%n", number);
     }
     }
                                }
