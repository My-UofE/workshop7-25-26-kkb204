public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        super();
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
    }

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA() {
        return a;
    }

    public double getSideB() {
        return b;
    }

    public double getSideC() {
        return c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return String.format("Triangle[a=%.2f,b=%.2f,c=%.2f,color=%s]", a, b, c, getColor());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triangle)) return false;
        Triangle other = (Triangle) obj;
        return a == other.a && b == other.b && c == other.c;
    }
}