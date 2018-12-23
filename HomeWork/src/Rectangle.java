public class Rectangle {
    private double length;
    private double width;
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    protected double Perimeter ( double x1,double x2,double y1,double y2){
        length=Math.abs(x2-x1);
        width=Math.abs(y2-y1);
        return 2*(length+width);
    }
    protected double Square (double x1,double x2,double y1,double y2) {
        length = Math.abs(x2 - x1);
        width = Math.abs(y2 - y1);
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
