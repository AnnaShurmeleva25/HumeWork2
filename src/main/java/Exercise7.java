public class Exercise7 {
    public static void main(String[] args) {
        int number = 8;

        System.out.println("Определить является ли число" + " " + number + " " + "чётным или нечётным");
        if (number % 2 == 0) {
            System.out.println("Число" + " " + number + " " + "является чётным");
        } else {
            System.out.println("Число" + " " + number + " " + "является нечётным");
        }
        System.out.printf("\n");
    }
}
