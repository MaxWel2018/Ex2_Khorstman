package Ex5;

public final class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }


    public Point translate(double x, double y) {   // мотоды доступа
        return new Point(this.x += x, this.y += y);
    }

    public Point scale(double x) {
        return new Point(this.x *= x, this.y *= y);
    }
    public  Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

   /* public void translate(double x, double y) {  // Модифицируююзиий метод
       this.x += x;
       this.y += y;
    }

    public void scale(double x) {
         y *= x;
        this.x *= x;
    }*/

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
