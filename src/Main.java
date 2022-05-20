public class Main {
    public static void main(String[] args) {

        //Father Class "Figure", abstract
        //String color, boolean backFill
        //Constructor for both parameters
        //Getters and Setters
        //2 Abstract methods
            //obtainArea -> abstract, return double
            //obtainPerimeter -> abstract, return double

        //Class "Circle"
        //Double radio
        //Constructor inherits super and add radio
        //Getters and Setters
        //Implements abstract methods from Father Class (obtainArea, obtainPerimeter)

        //Class "Rectangle"
        //double width, double height
        //Constructor inherits super and add Width and Height
        //Getters and Setters
        //Implements abstract methods from Father Class (obtainArea, obtainPerimeter)

        Circle circle = new Circle("Red",true,11.78);
        Rectangle rectangle = new Rectangle("Blue",true,10.5,22.8);

        circle.obtainArea();
        circle.obtainPerimeter();
        rectangle.obtainArea();
        rectangle.obtainPerimeter();
    }
}
