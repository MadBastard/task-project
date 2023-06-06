package rectangle;

public class Rectangle {
    private double length = 1;
    private double width = 1;

    public void setLength(double length) {
        if (length < 0.0 || length >= 20.0) {
            throw new IllegalArgumentException("Size out of bound");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0 || width >= 20.0) {
            throw new IllegalArgumentException("Size out of bound");
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public double getArea() {
        return length * width;
    }
}
