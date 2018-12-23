public class Circle {
    private double radius;
    private double x1;
    private double x2;
    private double y1;
    private  double y2;
    protected double Length ( double x1,double x2,double y1,double y2){
        radius=Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
        return 2*radius*Math.PI;
    }
protected double Square (double x1,double x2,double y1,double y2){
    radius=Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
    return Math.PI*radius*radius;
}
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX1() {
        return x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX2() {
        return x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
