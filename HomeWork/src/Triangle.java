public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private String a;
    private  double p;
   protected String Exists (double side1, double side2, double side3){
        if (side1+side2>side3 && side2+side3>side1 && side1+side3>side2)
            return a="треугольник с заданными сторонами существует";
        else
            return a="треугольника с заданными сторонами не существует";

   }
   protected double Perimeter ( double side1, double side2, double side3){
       return side1+side2+side3;
   }
   protected  double Square (double side1, double side2, double side3){
       p=(side1+side2+side3)/2;
       return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
   }


    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
}
