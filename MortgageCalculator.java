import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator{
public static void main(String[] args){
final byte TOTAL_NO_OF_MONTHS_IN_A_YEAR = 12;
final byte PERCENT = 100;
Scanner input = new Scanner(System.in);
System.out.print("Principle: ");
int principle = input.nextInt();
System.out.print("Annual Interest Rate: ");
double annualInterestRate = input.nextDouble();
System.out.print("Period(Years): ");
int period = input.nextInt();

double annualInterest = annualInterestRate / PERCENT;
double monthlyInterestRate = annualInterest / TOTAL_NO_OF_MONTHS_IN_A_YEAR;
int numberOfPayments = period * TOTAL_NO_OF_MONTHS_IN_A_YEAR ;
int n = numberOfPayments;
double r = monthlyInterestRate;
int p = principle;
double a = Math.pow(r + 1 , n);
double m = p * ((a * r)/ (a - 1) );

NumberFormat currency = NumberFormat.getCurrencyInstance();
String mortgage = currency.format(m);
System.out.println("Mortgage : " + mortgage);



                                      }
                                }
