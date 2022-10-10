class RegularPolygon {
    int n = 3;// number of sides
    double side = 1.00;// define length of side
    double x = 0;// defines the x-coordinate of the polygon’s center
    double y = 0;// defines the y-coordinate of the polygon’s center

    RegularPolygon() {
        System.out.println("The Regular polygon Is : ");
        System.out.println("The Polygon centered at (" + x + "," + y + ")");
        System.out.println("The default Perimeter of Polygon is : " + getPerimeter());
        System.out.println("The default Area of Polygon is : " + getArea());
        System.out.println();
        System.out.println("For Find New one : ");
        System.out.println();
    }

    // Accessor and Mutrator
    int getNos() {
        // Accessor
        System.out.println("The Number Of side is : " + n);
        return n;
    }

    void setNos(int n) {
        this.n = n;
        // mutators
    }

    void getlos() {
        // Accessor
        System.out.println("The Length Of side is : " + side);
    }

    void setlos(Double side) {
        this.side = side;
        // mutators
    }

    public void getx() {
        // Accessor
        System.out.println("The value of x is : " + x);
    }

    public void setx(Double x) {
        this.x = x;
        // mutators
    }

    public void gety() {
        // Accessor
        System.out.println("The value of y is : " + y);
    }

    public void sety(Double y) {
        this.y = y;
        // mutators
    }

    // find perimeter
    double getPerimeter() {
        double perimeter = n * side;
        return perimeter;
    }

    // find Area
    double getArea() {
        double angle = Math.toRadians(180 / n);
        angle = Math.tan(angle);
        double area = ((side * side * n) / (4 * angle));
        return area;
    }

}

public class pr2 extends RegularPolygon {
    public static void main(String[] args) 
    {
        RegularPolygon sh = new RegularPolygon();
        sh.setNos(5);
        sh.getNos();
        sh.setlos(10.00);
        sh.getlos();
        sh.setx(7.00);
        sh.getx();
        sh.sety(8.00);
        sh.gety();
        System.out.println("The Perimeter of given Input is : " + sh.getPerimeter());
        System.out.println("The Area of given Input is : " + sh.getArea());
    }
}
