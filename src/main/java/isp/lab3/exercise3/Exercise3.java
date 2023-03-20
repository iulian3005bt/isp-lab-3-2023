package isp.lab3.exercise3;
import isp.lab3.exercise3.Vehicle;
public class Exercise3 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle v2 = new Vehicle("Mazda", "6", 180, 'D');
        System.out.println(v1.getModel());
        System.out.println(Vehicle.getNumVehicles());
        Vehicle.displayNumVehicles();
        System.out.println(v2.toString());
    }
}