public class Exercise6 {
    public static void main(String[] args) {

        double x1 = 1;
        double y1 = 4;
        double rad = 8;
        double hypotenuse = 0;

        hypotenuse = rad * 2 / Math.sqrt(2);

        if (hypotenuse <= rad) {
            System.out.println("Координаты точки (" + x1 + " " + y1 + ") точка пренадлежит кругу.");
        } else {
            System.out.println("Координаты точки (" + x1 + " " + y1 + ") точка пренадлежит кругу.");
        }
        System.out.printf("\n");
    }
}
