public class Rectangle extends Figure{

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(String color, boolean backFill, double width, double height) {
        super(color, backFill);
        this.width = width;
        this.height = height;
    }

    @Override
    public void obtainArea() {
        double area;

        area = getWidth() * getHeight();

        System.out.println("The area of the rectangle is: " + area);
    }

    @Override
    public void obtainPerimeter() {
        double perimeter;

        perimeter = getWidth() + getWidth() + getHeight() + getHeight();

        System.out.println("The perimeter of the rectangle is: "+ perimeter);
    }
}
