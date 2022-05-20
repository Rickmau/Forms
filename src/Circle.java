public class Circle extends Figure{

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circle(String color, boolean backFill, double radio) {
        super(color, backFill);
        this.radio = radio;
    }

    @Override
    public void obtainArea() {
        double area;
        area = 3.1416 * Math.pow(getRadio(),2);

        System.out.println("The area of the circle is: " + area);
    }

    @Override
    public void obtainPerimeter() {
        double perimeter;
        double diameter;

        diameter = 2*getRadio();
        perimeter = 3.1416 * diameter;

        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}
