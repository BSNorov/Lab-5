public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public double calculateArea() { return Math.PI * radius * radius; }

    @Override
    public String toString() {
        return String.format("%s [Radius: %.2f, Area: %.2f]", super.toString(), radius, calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}
