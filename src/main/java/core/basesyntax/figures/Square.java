package core.basesyntax.figures;

import core.basesyntax.base.Figure;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area()
                + " sq. units, side: " + side + " units, color: " + color);
    }
}