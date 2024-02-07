import java.util.Scanner;

public class TemperatureConverter
{
  public static void main(String[] args)
  {
    double celcius = 0;
    double celcius_fahrenheit = 0;
    double celcius_kelvin = 0;

    double c2f_con_rate = 33.8; 
    double c2k_con_rate = -272; 

    Scanner input = new Scanner(System.in);
    System.out.print("Enter celcius: ");

    celcius = input.nextDouble();
    celcius_fahrenheit = celcius * c2f_con_rate;
    celcius_kelvin = celcius * c2k_con_rate;

    System.out.println(celcius +" celcius is "+ celcius_fahrenheit + " fahrenheit");	 
    System.out.println(celcius +" celcius is "+ celcius_kelvin +" kelvin");
    
    input.close();
  }	
}