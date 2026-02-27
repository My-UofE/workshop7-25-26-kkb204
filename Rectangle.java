public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 10.0;
        this.height = 5.0;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return width * height; // you were missing the semicolon here
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f,height=%.2f,color=%s]", width, height, getColor());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return width == other.width && height == other.height;
    }
}