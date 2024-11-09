public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }

    @Override
    public double calculateArea() { return length * width; }

    @Override
    public String toString() {
        return String.format("%s [Length: %.2f, Width: %.2f, Area: %.2f]", super.toString(), length, width, calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.width, width) == 0;
    }
}
