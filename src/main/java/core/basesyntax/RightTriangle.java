package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (firstSide * secondSide) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure : right triangle, "
                + getArea()
                + " sq. units, firstSide: "
                + firstSide
                + " units, secondSide: "
                + secondSide
                + " units, color: "
                + getColor());
    }
}
