class Square extends Rectangle {
    // Constructor
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter and Setter for side (using length as square has equal sides)
    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[side=" + getSide() + ", " + super.toString() + "]";
    }
}