package src;
public class Square extends Rectangle {
    private double a;
    
    public Square(String tenhinh, double a) {
        super(tenhinh, a, a);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

}