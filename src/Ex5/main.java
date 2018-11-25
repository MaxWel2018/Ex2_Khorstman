package Ex5;

public class main {

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5); // с помощью методов доступа
      /*  Point p = new Point(3, 4);   // модифицирующий
        p.translate(1,3);
        p.scale(0.5);*/
        System.out.println(p.getX() + " " +p.getY());
    }
}
