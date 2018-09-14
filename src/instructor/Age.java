import java.util.Scanner;

/** Program to perform conversions of the
* user input of age.
@author Janyl Jumadinova
*/
public class Age {
  /** main method obtains the user's input
  * and converts age from years to centuries.
  */
  public static void main (String [] args) {
    // declare and assign Scanner
    Scanner input = new Scanner (System.in);
    double age;
    double result;

    // ask the user for input
    System.out.println("Please enter your age");

    // store user's input in a variable
    age = input.nextDouble();
    System.out.println("You entered: " + age);

    // convert the age from years to centuries
    result = age/100;
    System.out.println("Age in centuries is: " + result);
  }
}
