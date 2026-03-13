package src;
public class Rectangle extends Shape {
    private double w, h;

    @Override
    public double tinhchuvi() {
        return (w + h) / 2;
    }

    @Override
    public double tinhdientich() {
        return w * h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Rectangle(String tenhinh, double w, double h) {
        super(tenhinh);
        this.w = w;
        this.h = h;
    }  
}