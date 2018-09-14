/** Program to calculate the volume
* and the surface area of the sphere.
* @author Janyl Jumadinova
*/

public class VolumeSurfaceArea {
  /** Main method that creates the needed
  * variables and has expressions to perform
  * the neccessary calculations.
  */
  public static void main (String [] args) {
    // 1. Declare variables
    int radius;
    double pi;
    double area;
    double volume;

    // 2. Assign values to the variables
    radius = 10;
    pi = 3.14;

    // 3. To do the calculation for the surface area
    area = 3 * pi * radius * radius;

    // 4. Output the result
    System.out.println("Surface Area of the sphere: " + area);

    // 5. Calculate the volume of the sphere
    volume = 1.333 * pi * radius * radius * radius;

    // 6. Output the result
    System.out.println("Volume of sphere: "+volume);
  }
}
