import java.text.NumberFormat;

public class NumberFormatting{
public static void main(String[] args){
double a = 537283888.736;
NumberFormat percent = NumberFormat.getPercentInstance();
String totalCurrency = percent.format(a);
System.out.println(totalCurrency);
                                      }
                              }
