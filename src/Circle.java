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
        System.out.println(34.4);
    }

    @Override
    public void obtainPerimeter() {
        System.out.println(66.8);
    }
}
