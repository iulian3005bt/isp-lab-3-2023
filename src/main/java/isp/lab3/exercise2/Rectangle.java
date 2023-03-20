package isp.lab3.exercise2;

class Rectangle {

    private int length = 2;
    private int width = 1;
    private String color = "red";
    private int area;
    private int perimeter;

    //constructori
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {

        return this.length;
    }

    public int getWidth() {

        return this.width;
    }

    public String getColor() {

        return this.color;
    }

    public int getPerimeter() {
        if (length > 0 && width > 0)
            perimeter = this.length + this.width;
        return this.perimeter;
    }

    public int getArea() {
        if (length > 0 && width > 0)
            area = length * width;
        return this.area;
    }
}