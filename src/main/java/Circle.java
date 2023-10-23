public class Circle <T extends Number> {
    private T radius;
    private String color;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
