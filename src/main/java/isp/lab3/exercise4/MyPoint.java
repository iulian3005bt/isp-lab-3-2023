package isp.lab3.exercise4;

public class MyPoint {
    private int x;
    private int y;
    private int z;

    public MyPoint() {
        this(0, 0, 0);
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double distance(int x, int y, int z) {
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y, another.z);
    }
}