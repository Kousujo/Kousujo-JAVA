package src;
public abstract class Shape {
    String tenhinh;

    public Shape(String tenhinh) {
        this.tenhinh = tenhinh;
    }

    public String getTenhinh() {
        return tenhinh;
    }

    public void setTenhinh(String tenhinh) {
        this.tenhinh = tenhinh;
    }
    
    public abstract double tinhchuvi();

    public abstract double tinhdientich(); 

    public void xuat() {
        System.out.println("Hinh :" + tenhinh);
        System.out.printf("Chu vi : %.2f\nDien tich : %.2f",tinhchuvi(), tinhdientich());
    }
}