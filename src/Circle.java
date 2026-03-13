package src;
public class Circle extends Shape {
    private double r;

    public Circle(String tenhinh, double r) {
        super(tenhinh);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhchuvi() {
        return r*3.14*2;
    }

    @Override
    public double tinhdientich() {
        return r*r*3.14;
    }
    
}