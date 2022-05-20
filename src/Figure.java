public abstract class Figure {

    private String color;
    private boolean backFill;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBackFill() {
        return backFill;
    }

    public void setBackFill(boolean backFill) {
        this.backFill = backFill;
    }

    public Figure(String color, boolean backFill) {
        this.color = color;
        this.backFill = backFill;
    }

    public abstract void obtainArea();
    public abstract void obtainPerimeter();
}
