package isp.lab3.exercise4;

public class Exercise4 { public static void main(String[] args) {
    MyPoint p1 = new MyPoint(3, 2, 6);
    MyPoint p2 = new MyPoint(5, 2, 9);
    double distance = p1.distance(p2);
    System.out.println("Distance between " + p1.toString() + " and " + p2.toString() + " is " + distance);
}
}