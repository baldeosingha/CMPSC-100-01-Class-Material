/** Program to calculate the volume
* and the durface area.
@author Janyl Jumadinova
*/

public class VolumeSurfaceArea {
  /** Main method to do calculations.
  */
  public static void main (String [] args) {
    // 1. Declare variables
    int radius;
    double pi;
    double area;

    // 2. Assign values to the variables
    radius = 10;
    pi = 3.14;
    
    // 3. To do the calculation
    area = 3 * pi * radius * radius;

    // 4. Output the result
    System.out.println("Surface Area of the sphere: " + area);
  }
}
